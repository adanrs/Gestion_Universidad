package DAO;

import Modelo.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adan
 */
public class PersonaDAO {
    private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;
	
	public PersonaDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
	
	protected void connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(
										jdbcURL, jdbcUsername, jdbcPassword);
		}
	}
	
	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}
        
        public boolean insertaPersona(Persona persona) throws SQLException {
		String sql = "INSERT INTO persona (cedula,nombre,pass,correo,telefono,tipo,carrera) VALUES (?, ?, ?, ?, ? , ?,?)";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, persona.getCedula());
                statement.setString(2, persona.getNombre());
                statement.setString(3, persona.getClave());
                statement.setString(4, persona.getEmail());
                statement.setInt(5, persona.getTelefono());
                statement.setInt(6, persona.getTipo());
                statement.setString(7, persona.getCarrera());
                
                
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowInserted;
	}
        
        public List<Persona> listAllPersona() throws SQLException {
		List<Persona> listPersona = new ArrayList<>();
		
		String sql = "SELECT * FROM persona where tipo = 2";
		
		connect();
		
		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {

                        
                        int telefono = resultSet.getInt("telefono"); 
                        String correo = resultSet.getString("correo");
                        String nombre = resultSet.getString("nombre");
                        String f_nacimiento = resultSet.getString("f_nacimiento");
                        String cedula = resultSet.getString("cedula");
                        int tipo = resultSet.getInt("tipo"); 
                        String clave = resultSet.getString("pass");
                        String carrera = resultSet.getString("carrera");        
                                
                        
                        
			Persona persona = new Persona(cedula,clave,tipo,nombre,correo,telefono,carrera);
			listPersona.add(persona);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listPersona;
	}
    
        public List<Persona> listAllPersonaProfesor() throws SQLException {
		List<Persona> listPersona = new ArrayList<>();
		
		String sql = "SELECT * FROM persona where tipo = 1";
		
		connect();
		
		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {

                        
                        int telefono = resultSet.getInt("telefono"); 
                        String correo = resultSet.getString("correo");
                        String nombre = resultSet.getString("nombre");
                        String f_nacimiento = resultSet.getString("f_nacimiento");
                        String cedula = resultSet.getString("cedula");
                        int tipo = resultSet.getInt("tipo"); 
                        String clave = resultSet.getString("pass");
                        String carrera = resultSet.getString("carrera");        
                                
                        
                        
			Persona persona = new Persona(cedula,clave,tipo,nombre,correo,telefono,carrera);
			listPersona.add(persona);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listPersona;
	}
        
	public Persona getPersona(int cedula) throws SQLException {
		Persona persona = null;
		String sql = "SELECT * FROM persona WHERE cedula = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setInt(1, cedula);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
                        
			String clave = resultSet.getString("pass");
			int tipo = resultSet.getInt("tipo");
			String nombre = resultSet.getString("NOMBRE");
			String correo = resultSet.getString("CORREO");
			int telefono = resultSet.getInt("TELEFONO");
			String carrera = resultSet.getString("carrera");

                        
        
                        
			persona = new Persona(clave,tipo,nombre,correo,telefono,carrera);
		}
		
		resultSet.close();
		statement.close();
		
		return persona;
	}
        public boolean deletePersona(Persona persona) throws SQLException {
		String sql = "DELETE FROM persona where cedula = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setInt(1, persona.getTipo());
		
		boolean rowDeleted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowDeleted;		
	}
	
	public boolean updatePersona(Persona persona) throws SQLException {
		String sql = "UPDATE persona SET  nombre = ?, telefono = ?,correo = ?,carrera =?,pass = ?,tipo = ?";
		sql += " WHERE cedula = ?";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(7, persona.getCedula());
                statement.setString(1, persona.getNombre());
                statement.setInt(2, persona.getTelefono());
                statement.setString(3, persona.getEmail());
                statement.setString(4, persona.getCarrera());
                statement.setString(5, persona.getClave());
                statement.setInt(6, persona.getTipo());
                
                
		
		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowUpdated;		
	}
}
