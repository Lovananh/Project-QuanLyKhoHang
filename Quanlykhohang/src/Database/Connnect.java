
package Database;

import java.sql.*;
import javax.swing.*;

public class Connnect {
     public Connection conn = null;

    public Connection connectSQL() throws SQLException {
        try {
            String user = "sa";
            String password = "holmes2812";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=......   ;TrustServerCertificate=true;";
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = java.sql.DriverManager.getConnection(url, user, password);
            return conn;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ket noi toi SQL that bai", "Thong bao", 1);
        }
        return null;
    }
}
