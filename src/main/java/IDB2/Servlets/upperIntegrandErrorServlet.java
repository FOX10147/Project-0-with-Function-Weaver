package IDB2.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "upperintegranderror", urlPatterns = { "/upperintegranderror" })
public class upperIntegrandErrorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Missing an upper integrand. Please provide one and try again.");
    }
}