/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolsoft;

/**
 *
 * @author davidwesker
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public final class AccesoDB {

        private AccesoDB() {
    }

    public static Connection getConnection(){
        Connection cn = null;
        try {
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //JDBC 2005
             } catch (Exception e) {}
        try {
//            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=DBEvolSoft;user=sa;password=12345";
            cn = DriverManager.getConnection(connectionUrl);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cn;
    }
}
