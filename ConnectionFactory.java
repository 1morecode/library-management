
package library_management;
import java.sql.*;

public class ConnectionFactory {

    public static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_manage?useSSL=false", "root", "DatabasePassword");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return con;

    }
}

