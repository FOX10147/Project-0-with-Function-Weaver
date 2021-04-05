package IDB2;

import java.util.Scanner;

import java.sql.ResultSet;
import java.sql.SQLException;

// Menu for different options

public class book {
    void bookStart() throws SQLException
    {   Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Integral Solutions Book ---");
        System.out.println("\nWelcome to the Integrals Solution Database.");
        System.out.println("Please select an option below.\n");
        System.out.println("[1] Search for an integral by id");
        System.out.println("[2] Search for exact integral");
        System.out.println("[3] Call calculator for result on Integral choice");
        System.out.println("[4] Display all Integrals in the terminal");
        System.out.println("[5] Add a new integral and solution to the database");
        System.out.println("[6] How to use this App.");
        System.out.println("[7] Notes about Integrals");
        System.out.println("[any other integer]. Exit Program");
        int choice = sc.nextInt(); 
        sc.nextLine();

        
        //Will search for integral by id
        if (choice == 1)
        {   ResultSet rc = null;
            GrabAll grabAll = new GrabAll();
            rc = grabAll.getAll();
            int J = 0;
            boolean flag = true;
            System.out.println("Please type an integral id");
            int choice3 = sc.nextInt();
            sc.nextLine();
            while (rc.next())
            {   J = rc.getInt("id");
                if (J == choice3)
                {   System.out.println("\nid# " + rc.getInt("id") + "  |  Integral: " + rc.getString("Integral") + "  |  Solution: " + rc.getString("Solution") + "\n\n");    
                    flag = false;
                }
            }
            if (flag)
            {   System.out.println("\nSorry, there are no integrals with that id. Please try again.\n\n");    }
            flag = true;
            bookStart();
        }

        //Will search for integral by exact notation
        else if (choice == 2)
        {   ResultSet rc = null;
            GrabAll grabAll = new GrabAll();
            rc = grabAll.getAll();
            String I = null;
            boolean flag = true;
            System.out.println("Please type the integral you are looking for");
            String choice2 = sc.nextLine();
            while (rc.next())
            {   I = rc.getString("Integral");
                if (I.equals(choice2))
                {   System.out.println("\nid# " + rc.getString("id") + "  |  Integral: " + rc.getString("Integral") + "  |  Solution: " + rc.getString("Solution") + "\n\n");    
                    flag = false;
                }
            }
            if (flag)
            {   System.out.println("\nSorry, that integral is not in this database."); 
                System.out.println("Please refer to an approximation technique for a result.\n\n");
            }
            flag = true;
            bookStart();
        }
        
    
        //Will calculate specific integrals for user
        else if (choice == 3)
        {   IntegralList showIntegral = new IntegralList();
            showIntegral.display(sc);
            System.out.println("\n\n");
            bookStart();
        }

        //Will display all integrals in database onto terminal
        else if (choice == 4)
        {   ResultSet rc = null;
            GrabAll grabAll = new GrabAll();
            rc = grabAll.getAll();
            while (rc.next())
            {   System.out.println("id# " + rc.getString("id") + "  |  Integral: " + rc.getString("Integral") + "  |  Solution: " + rc.getString("Solution")); 
            }
            System.out.println("\n\n");
            bookStart();
        }

        //Used to add integrals and solutions to database
        else if (choice == 5)
        {   System.out.println("Process to input new integral locked");
            System.out.println("Please enter password: ");
            String password = "database";
            String userpass = sc.next();
            sc.nextLine();
            if (userpass.equals(password))
            {   System.out.println("Password accepted.");
                System.out.println("Make sure to double check the format of your equation before uploading.\n");
            
                IntegralsDBAccess goTosql = new IntegralsDBAccess();
                goTosql.upload(); 
                bookStart(); 
            }
            else
            {   System.out.println("Password not accepted. returning to main menu.");
                bookStart();
            }
        }

        //Explanation on how best to use app
        else if (choice == 6)
        {   System.out.println("This app is an integral database used to view solutions to integrals that have been");
            System.out.println("solved and uploaded to this database. If you would like to search for a specific ");
            System.out.println("Integral and see if it has been solved, press 1, hit enter, and a prompt will ask you ");
            System.out.println("to input an id number to get an integral and its solution. You also want to add *dx to the ");
            System.out.println("end of your integral. Here, x's are used and constants ");
            System.out.println("are written with the letter a. If you would like to search for an exact integral, press 2.");
            System.out.println("If you would like to find the result out of specific ");
            System.out.println("integral, press 3 and a prompt will ask you for the id number of the integral you want to ");
            System.out.println("calculate from. It will ask for interval endpoint inputs, or from n1 to n2, and it may ask you for ");
            System.out.println("constant values, exponents, or other integer inputs depending on the integral.");
            System.out.println("If you would like all integrals and solutions ");
            System.out.println("printed to a txt file, press 4. If you would like to add a new integral and its solution");
            System.out.println("to the database, press 5. Note that the solution will have to be formatted properly ");
            System.out.println("in order to immediately start calculating from it. This is a new function");
            System.out.println("that this program has. To learn how to use this app, press 6. To read the authro's "); 
            System.out.println("notes on integrals, press 7. To exit the program, Enter any other integer in the start menu.\n\n");
            bookStart();
        }

        //Note from author about Integrals
        else if (choice == 7)
        {   System.out.println("Integrals are used to find areas under curves in mathematical cartesian graphs.");
            System.out.println("While the field of mathematics has many techniques to solve integrals, there are ");
            System.out.println("many integrals that either have solutions not yet solved, not uploaded to this ");
            System.out.println("database, or simply take far too much time to solve. Integral books provide ");
            System.out.println("references to many solved Integrals, but the sheer volume in paper format can be ");
            System.out.println("overwhelming. Thus, the next logical step is to place these integrals into a ");
            System.out.println("computer database to hold the ability to store far greater volumes of integrals ");
            System.out.println("as well as provide a backbone to insert more integrals should they ever be solved. ");
            System.out.println("A digital reference to integrals can become essential to any engineer as it will cut ");
            System.out.println("down the time it takes to solve difficult integrals.\n\n");
            bookStart();
        }

        // Exits the program
        else 
        {   System.out.println("Exiting the Program");
            System.out.println("Goodbye");
            sc.close();
            System.exit(0); 
        }
    }
}