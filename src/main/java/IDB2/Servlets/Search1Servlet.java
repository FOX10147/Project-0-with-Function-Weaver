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

@WebServlet(name = "searchid", urlPatterns = { "/searchid" })
public class Search1Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String number = "";
        number = request.getParameter("number");
        int choice = Integer.parseInt(number);

        DBConnect test = new DBConnect();
        Connection c = test.getConnect();

        ResultSet rc = null;
        GrabAll grabAll = new GrabAll();
        rc = grabAll.getAll();
        int J = 0;
        boolean flag = true;
        out.println("Please type an integral id");
        try {
            while (rc.next()) {
                J = rc.getInt("id");
                if (J == choice) {
                    out.println("\nIntegral #" + number + " found:");
                    out.println();
                    out.println("\nid# " + rc.getInt("id") + "  |  Integral: " + rc.getString("Integral")
                            + "  |  Solution: " + rc.getString("Solution") + "\n\n");
                    flag = false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (flag)
        {   out.println("\nSorry, there are no integrals with that id. Please try again.\n\n");    }
    }
}