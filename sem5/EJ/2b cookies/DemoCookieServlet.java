package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DemoCookieServlet extends HttpServlet {
    static int i = 1;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String k = String.valueOf(i);
        Cookie c = new Cookie("visit", k);
        response.addCookie(c);
        int j = Integer.parseInt(c.getValue());
        if(j==1) {
            out.println("Welcome");
        }
        else {
            out.println("You visited " + i + " times");
        }
        i++;
    }
}
