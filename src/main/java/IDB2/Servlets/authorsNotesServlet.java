package IDB2.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "authorsnotes", urlPatterns = { "/authorsnotes" })
public class authorsNotesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Integrals are used to find areas under curves in mathematical cartesian graphs.");
        out.println("While the field of mathematics has many techniques to solve integrals, there are ");
        out.println("many integrals that either have solutions not yet solved, not uploaded to this ");
        out.println("database, or simply take far too much time to solve. Integral books provide ");
        out.println("references to many solved Integrals, but the sheer volume in paper format can be ");
        out.println("overwhelming. Thus, the next logical step is to place these integrals into a ");
        out.println("computer database to hold the ability to store far greater volumes of integrals ");
        out.println("as well as provide a backbone to insert more integrals should they ever be solved. ");
        out.println("A digital reference to integrals can become essential to any engineer as it will cut ");
        out.println("down the time it takes to solve difficult integrals.\n\n");
        out.flush();
    }
}