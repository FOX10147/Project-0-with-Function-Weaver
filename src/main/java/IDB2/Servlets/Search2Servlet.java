package IDB2.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import IDB2.DBConnect;
import IDB2.GrabAll;

@WebServlet(name = "searchexact", urlPatterns = { "/searchexact" })
public class Search2Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String number2 = "";
        number2 = request.getParameter("number2");

        DBConnect test = new DBConnect();
        Connection c = test.getConnect();

        ResultSet rc = null;
        GrabAll grabAll = new GrabAll();
        rc = grabAll.getAll();
        String I = null;
        boolean flag = true;
        out.println("Please type the integral you are looking for");
        try {
            while (rc.next()) {
                I = rc.getString("Integral");
                if (I.equals(number2)) {
                    out.println("\nIntegral found:");
                    out.println();
                    out.println("\nid# " + rc.getString("id") + "  |  Integral: " + rc.getString("Integral")
                            + "  |  Solution: " + rc.getString("Solution") + "\n\n");
                    flag = false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (flag)
        {   out.println("\nSorry, that integral is not in this database."); 
            out.println("Please refer to an approximation technique for a result.\n\n");
        }
        
        out.flush();
    }
}