package IDB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Used to access database for Driver

public class ConnectionUtil {
    public static final String username = "Integrals";
    private static final String password = "hello";
    private static final String url = "jdbc:postgresql://localhost:5431/Integrals";

    public static Connection getConnection() throws SQLException
    {   return DriverManager.getConnection(url, username, password);    }
}