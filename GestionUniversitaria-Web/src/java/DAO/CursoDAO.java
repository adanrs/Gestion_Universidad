
package DAO;

import Modelo.Curso;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {

    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;

    public CursoDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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

    public boolean insertaCurso(Curso curso) throws SQLException {
        String sql = "INSERT INTO curso (codigo, nombre, creditos, h_semanales, cod_carrera, num_ciclo) VALUES (?, ?, ?, ?, ? , ?)";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, curso.getCodigo());
        statement.setString(2, curso.getNombre());
        statement.setInt(3, curso.getCreditos());
        statement.setInt(4, curso.getHsemanales());
        statement.setString(5, curso.getCarrera());
        statement.setInt(6, curso.getNum_ciclo());

        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }

    public List<Curso> listAllCurso() throws SQLException {
        List<Curso> listCurso = new ArrayList<>();

        String sql = "SELECT * FROM curso";

        connect();

        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

         while (resultSet.next()) {

             String codigo = resultSet.getString("codigo");
            String nombre = resultSet.getString("nombre");
            int creditos = resultSet.getInt("creditos");
            int hsemanales = resultSet.getInt("h_semanales");
            String carrera = resultSet.getString("cod_carrera");
              int num_ciclo = resultSet.getInt("num_ciclo");

             Curso curso = new Curso(codigo, nombre, creditos, hsemanales, carrera, num_ciclo);
             listCurso.add(curso);
         }

        resultSet.close();
        statement.close();

        disconnect();

        return listCurso;
    }

    public Curso getCurso(String cod) throws SQLException {
        Curso curso = null;
        String sql = "SELECT * FROM curso WHERE codigo = ?";

        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, cod);

        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {

            String codigo = resultSet.getString("codigo");
            String nombre = resultSet.getString("nombre");
            int creditos = resultSet.getInt("creditos");
            int hsemanales = resultSet.getInt("h_semanales");
            String carrera = resultSet.getString("cod_carrera");
            int num_ciclo = resultSet.getInt("num_ciclo");

            curso = new Curso(codigo, nombre, creditos, hsemanales, carrera, num_ciclo);
        }

        resultSet.close();
        statement.close();

        return curso;
    }

    public boolean deleteCurso(Curso curso) throws SQLException {
        String sql = "DELETE FROM curso where codigo = ?";

        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, curso.getCodigo());

        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;
    }

    public boolean updateCurso(Curso curso) throws SQLException {
        String sql = "UPDATE curso SET  nombre = ?, creditos = ?,h_semanales = ?,cod_carrera =?,num_ciclo = ?";
        sql += " WHERE codigo = ?";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, curso.getNombre());
        statement.setInt(2, curso.getCreditos());
        statement.setInt(3, curso.getHsemanales());
        statement.setString(4, curso.getCarrera());
        statement.setInt(5, curso.getNum_ciclo());

        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;
    }

}
