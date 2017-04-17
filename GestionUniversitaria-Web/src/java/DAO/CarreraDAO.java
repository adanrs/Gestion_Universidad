
package DAO;

import Modelo.Carrera;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarreraDAO {

    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;

    public CarreraDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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

    public boolean insertaCarrera(Carrera carrera) throws SQLException {
        String sql = "INSERT INTO carrera (codigo, nombre) VALUES (?, ?)";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, carrera.getNombre());
        statement.setString(2, carrera.getCodigo());

        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }

    public List<Carrera> listAllCarrera() throws SQLException {
        List<Carrera> listCarrera = new ArrayList<>();

        String sql = "SELECT * FROM carrera";

        connect();

        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {

            String nombre = resultSet.getString("nombre");
            String codigo = resultSet.getString("codigo");

            Carrera carrera = new Carrera(nombre, codigo);
            listCarrera.add(carrera);
        }

        resultSet.close();
        statement.close();

        disconnect();

        return listCarrera;
    }

    public List<Carrera> listAllCarreraSelect() throws SQLException {
        List<Carrera> listCarrera = new ArrayList<>();

        String sql = "SELECT codigo FROM carrera";

        connect();

        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {


            String codigo = resultSet.getString("codigo");

            Carrera carrera = new Carrera(codigo);
            listCarrera.add(carrera);
        }

        resultSet.close();
        statement.close();

        disconnect();

        return listCarrera;
    }

    
    
    
    public Carrera getCarrera(String cod) throws SQLException {
        Carrera carrera = null;
        String sql = "SELECT * FROM carrera WHERE codigo = ?";

        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, cod);

        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {

            String nombre = resultSet.getString("nombre");
            String codigo = resultSet.getString("codigo");

            carrera = new Carrera(nombre, codigo);
        }

        resultSet.close();
        statement.close();

        return carrera;
    }

    public boolean deleteCarrera(Carrera carrera) throws SQLException {
        String sql = "DELETE FROM carrera where codigo = ?";

        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, carrera.getCodigo());

        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;
    }

    public boolean updateCarrera(Carrera carrera) throws SQLException {
        String sql = "UPDATE carrera SET  nombre = ?";
        sql += " WHERE codigo = ?";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, carrera.getNombre());

        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;
    }

}
