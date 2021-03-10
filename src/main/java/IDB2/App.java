// This is a replica meant only for records keeping

package IDB2;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Integral Database App Jake Hernandez 08/19/2020
 * This app will allow a user to input an integral
 * or look up integrals by index to give back 
 * documented solution to it. This app
 * also gives 
 * the user the option to summon the inbuilt
 * calculator for a numerical answer to a specific
 * integral once the user inputs a lower and upper
 * value.
 * 
 * Updated 02/09/2021 to include FunctionWeaver 
 * capability.
 */

public class App {
    public static void main(String[] args) throws SQLException
    {   new Time();
        DBConnect test = new DBConnect();
        Connection c = test.getConnect();
        System.out.println(c);
        book newList = new book();
        newList.bookStart();
    }
} 