package view.Image;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Stud_Regstr_Servlet", urlPatterns = { "/stud_regstr_servlet" })
public class Stud_Regstr_Servlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String getPath = "";
        String getImage = "";
        
        try {
            getPath = request.getParameter("getPath");
            getImage = request.getParameter("getImage");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(getPath);
        System.out.println(getImage);
//        response.setContentType(CONTENT_TYPE);
//        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("<head><title>Stud_Regstr_Servlet</title></head>");
//        out.println("<body>");
//        out.println("<p>The servlet has received a GET. This is the reply.</p>");
//        out.println("</body></html>");
//        out.close();
        
        
        
        
    }
}
