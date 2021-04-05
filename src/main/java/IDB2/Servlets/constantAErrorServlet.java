package IDB2.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "constantAerror", urlPatterns = { "/constantAerror" })
public class constantAErrorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("It seems the solution you are requesting needs an A constant");
        out.println("Please type an A constant and try again");
    }
}