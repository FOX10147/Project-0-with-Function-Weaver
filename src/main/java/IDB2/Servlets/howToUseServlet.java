package IDB2.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "howtouse", urlPatterns = { "/howtouse" })
public class howToUseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("This app is an integral database used to view solutions to integrals that have been");
        out.println("solved and uploaded to this database. If you would like to search for a specific ");
        out.println("Integral and see if it has been solved, click on the \"Search for an integral by id\"");
        out.println("hyperlink and on the browser, type after the displayed url \"?number=\" followed by the");
        out.println("id number of the integral and its solution that you want. You can also search for an");
        out.println("integral by typing in its exact form using the \"Search for exact integral\" hyperlink");
        out.println("If you would like to find the result out of a specific integral, fill in the text boxes");
        out.println("below in the main menu and click on the \"calculate this integral with these values.");
        out.println("You may not need all values filled in, it depends on the integral you are looking for.");
        out.println("If you would like all integrals and solutions printed on the browser, click on the ");
        out.println("\"Display all integrals\" hyperlink and it will display every integral currently in the");
        out.println("database. To read the author's notes on integrals, click on the \"Notes about Integrals\""); 
        out.println("hyperlink in the main menu.\n\n");
        out.flush();
    }
}