package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseDAO {
    
    protected Connection conn;
    
    public Connection connect() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
            "jdbc:mysql://localhost/biblionew", "root", ""
            );
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void desconnect() throws SQLException {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
