
package DAO;

import Modelo.Nota;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NotaDAO {

    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;

    public NotaDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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

    public boolean insertaNota(Nota nota) throws SQLException {
        String sql = "INSERT INTO nota (nota,curso,estudiante,grupo,condicion) VALUES (?, ?, ?, ?, ?)";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, nota.getNOTA());
        statement.setString(2, nota.getCURSO());
        statement.setString(3, nota.getESTUDIANTE());
        statement.setInt(4, nota.getGrupo());
        statement.setString(5, nota.getCondicion());

        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }

    public List<Nota> listAllNota() throws SQLException {
        List<Nota> listNota = new ArrayList<>();

        String sql = "SELECT * FROM NOTA";

        connect();

        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {

            int nnota = resultSet.getInt("nota");
            String curso = resultSet.getString("curso");
            String estudiante = resultSet.getString("estudiante");
            int grupo = resultSet.getInt("grupo");
            String condision = resultSet.getString("condision");

            Nota nota = new Nota(nnota, curso, estudiante, grupo, condision);
            listNota.add(nota);
        }

        resultSet.close();
        statement.close();

        disconnect();

        return listNota;
    }

    public Nota getNota(String estudiante) throws SQLException {
        Nota nota = null;
        String sql = "SELECT * FROM nota WHERE estudiante = ?";

        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, estudiante);

        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {

            int nnota = resultSet.getInt("nota");
            String curso = resultSet.getString("curso");
            String eestudiante = resultSet.getString("estudiante");
            int grupo = resultSet.getInt("grupo");
            String condision = resultSet.getString("condision");

            nota = new Nota(nnota, curso, eestudiante, grupo, condision);
        }

        resultSet.close();
        statement.close();

        return nota;
    }

    public boolean deleteNota(Nota nota) throws SQLException {
        String sql = "DELETE FROM nota where estudiante = ?";

        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, nota.getESTUDIANTE());

        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;
    }

    public boolean updateNota(Nota nota) throws SQLException {
        String sql = "UPDATE nota SET  nota = ?, curso = ?,grupo =?,condicion = ?";
        sql += " WHERE estudiante = ?";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, nota.getNOTA());
        statement.setString(2, nota.getCURSO());
        statement.setInt(3, nota.getGrupo());
        statement.setString(4, nota.getCondicion());

        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;
    }

}
