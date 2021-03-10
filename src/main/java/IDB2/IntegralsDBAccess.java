package IDB2;

import java.util.Scanner;
import java.sql.Connection; 
import java.sql.PreparedStatement;

//Asks for user input to inject SQL statement and 
//add a new integral and solution to database

public class IntegralsDBAccess
{   DBConnect connect = new DBConnect();
    Connection c = connect.getConnect();
    PreparedStatement go = null;

    public void upload()
    {   try
        {   Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter id number: ");
            System.out.println("you may need to hit enter twice for next prompt");
            int id = sc2.nextInt();
            sc2.nextLine();
            System.out.println("Enter new Integral: ");
            System.out.println("you may need to hit enter twice");
            String integral = sc2.nextLine();
            sc2.nextLine();
            System.out.println("Enter Integral's solution: ");
            System.out.println("you may need to hit enter twice");
            String solution = sc2.nextLine();
            sc2.nextLine();
            
            String stmt = "INSERT INTO Integrals (id, Integral, Solution) VALUES(?,?,?)";
            sc2.close();

            go = c.prepareStatement(stmt);
            go.setInt(1, id);
            go.setString(2, integral);
            go.setString(3, solution);
            go.executeUpdate();
            System.out.println("New integral updated to database.");
            System.out.println("Returning to main menu\n\n");
            return;
        }   catch (Exception e)
        {   System.out.println("Could not add new integral to Database.");
            System.out.println(e);
        }
        return;
    }
}