package IDB2;

import java.sql.*;

//Used to access database for app

public class DBConnect {
    static final String URL = "jdbc:postgresql://localhost:5431/Integrals";
    static final String USER = "Integrals";
    static final String PASS = "hello";

    private static Connection c = null;

    public Connection getConnect()
    {   if (c == null)
        {   try   
            {   Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("Connection Successful");
            }   catch (SQLException sqlException)
            {   System.out.println("Connection to SQL database failed");
                sqlException.printStackTrace();
            }   catch (Exception stackException)
            {   System.out.println("Could not load driver");
                stackException.printStackTrace();
            }
        }
        return c;
    }
}