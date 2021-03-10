package IDB2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Used to grab everything from database and paste
//onto a ResultSet object named rs and returns rs
//to book class

public class GrabAll 
{   public static ResultSet getAll()
    {   ResultSet rs = null;
        String query = "SELECT * FROM Integrals";
        PreparedStatement statement;
        try
        {   statement = ConnectionUtil.getConnection().prepareStatement(query);
            rs = statement.executeQuery();
        }   catch (SQLException e)
        {   System.out.println(e);    }
        return rs;
    }

    public String getOne(int c)
    {   ResultSet rs = null;
        String selection = "";
        String query = "SELECT Solution FROM Integrals Where id = " + c;
        System.out.println("query is: " + query);
        PreparedStatement statement;
        try
        {   statement = ConnectionUtil.getConnection().prepareStatement(query);
            rs = statement.executeQuery();
            rs.next();
        }   
        catch (SQLException e)
        {   System.out.println(e);  }

        try
        {   selection = rs.getString("Solution");   }
        catch (SQLException e)
        {   System.out.println(e);  }

        selection = selection.substring(0, selection.length() - 2);
        System.out.println(selection + " ...retrieved");
        
        return selection;
    }
}