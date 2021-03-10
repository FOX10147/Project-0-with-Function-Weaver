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

@WebServlet(name = "display", urlPatterns = { "/display" })
public class displayServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        DBConnect test = new DBConnect();
        Connection c = test.getConnect();

        ResultSet rc = null;
        GrabAll grabAll = new GrabAll();
        rc = grabAll.getAll();
        try {
            while (rc.next()) {
                out.println("id# " + rc.getString("id") + "  |  Integral: " + rc.getString("Integral")
                        + "  |  Solution: " + rc.getString("Solution"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        out.flush();
    }
}