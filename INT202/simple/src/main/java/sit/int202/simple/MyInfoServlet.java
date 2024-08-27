package sit.int202.simple;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "myinfoServlet", value = "/my-info")
public class MyInfoServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>Id: 66130500059</p");
        out.println("<p>Name: Pawarit</p");
        out.println("<p>GPAX: x.xx</p");
        out.println("<br><br><hr>");
        out.println("<a href=\"/simple_war_exploded\">back</a>");
        out.println("</body></html>");
    }
}