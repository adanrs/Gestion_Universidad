/*
Dise�o y programaci�n de plataformas M�viles
Laboratorio #1-2 � Back-End (Sistema de Gesti�n Acad�mica)
Ad�n Rivera Sanchez
Sergio Arguedas Quesada
 */
package DAO;

import Modelo.Ciclo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CicloDAO {

    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;

    public CicloDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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

    public boolean insertaCiclo(Ciclo ciclo) throws SQLException {
        String sql = "INSERT INTO ciclo (id,anno,num_ciclo,Fecha_inicio,Fecha_final) VALUES (?, ?, ?, ?, ?)";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, ciclo.getId());
        statement.setInt(2, ciclo.getAnno());
        statement.setInt(3, ciclo.getNciclo());
        statement.setString(4, ciclo.getFinicio());
        statement.setString(5, ciclo.getFinicio());

        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }

    public List<Ciclo> listAllCiclo() throws SQLException {
        List<Ciclo> listCiclo = new ArrayList<>();

        String sql = "SELECT * FROM ciclo";

        connect();

        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {

            String id = resultSet.getString("id");
            int anno = resultSet.getInt("anno");
            int nciclo = resultSet.getInt("num_ciclo");
            String Finicio = resultSet.getString("Fecha_inicio");
            String Ffinal = resultSet.getString("Fecha_final");

            Ciclo ciclo = new Ciclo(id, anno, nciclo, Finicio, Ffinal);
            listCiclo.add(ciclo);
        }

        resultSet.close();
        statement.close();

        disconnect();

        return listCiclo;
    }

    public Ciclo getCiclo(String id) throws SQLException {
        Ciclo ciclo = null;
        String sql = "SELECT * FROM ciclo WHERE id = ?";

        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, id);

        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {

            String iid = resultSet.getString("id");
            int anno = resultSet.getInt("anno");
            int nciclo = resultSet.getInt("num_ciclo");
            String Finicio = resultSet.getString("Fecha_inicio");
            String Ffinal = resultSet.getString("Fecha_final");

            ciclo = new Ciclo(iid, anno, nciclo, Finicio, Ffinal);
        }

        resultSet.close();
        statement.close();

        return ciclo;
    }

    public boolean deleteCiclo(Ciclo ciclo) throws SQLException {
        String sql = "DELETE FROM ciclo where id = ?";

        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, ciclo.getId());

        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowDeleted;
    }

    public boolean updateCiclo(Ciclo ciclo) throws SQLException {
        String sql = "UPDATE ciclo SET  anno = ?,num_ciclo = ?,fecha_inicio =?,fecha_final = ?";
        sql += " WHERE id = ?";
        connect();

        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setInt(1, ciclo.getAnno());
        statement.setInt(2, ciclo.getNciclo());
        statement.setString(3, ciclo.getFinicio());
        statement.setString(4, ciclo.getFfinal());

        boolean rowUpdated = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowUpdated;
    }

}
