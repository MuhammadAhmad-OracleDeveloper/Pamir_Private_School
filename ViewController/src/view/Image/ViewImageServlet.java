package view.Image;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "ViewImageServlet", urlPatterns = { "/viewimageservlet" })
public class ViewImageServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String getPath = "";
        String getImage = "";
        try {
            
            if (!request.getParameter("getImage").isEmpty()) {
                getPath = request.getParameter("getPath");
                getImage = request.getParameter("getImage");
            } else {
                getPath = "E:\\Pamir_Private_School\\ViewController\\src\\META-INF\\resources\\images\\";
                getImage = "photo_not_available.png";
            }
            
       
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(getPath);
        System.out.println(getImage);
        
//        response.setContentType(CONTENT_TYPE);
//        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("<head><title>ViewImageServlet</title></head>");
//        out.println("<body>");
//        out.println("<p>The servlet has received a GET. This is the reply.</p>");
//        out.println("</body></html>");
//        out.close();
                            System.out.println("Image servlet called '''''''''''''''''''''''''");
            //System.out.println(System.getProperty("user.dir"));
            //System.out.println(Paths.get("").toAbsolutePath().toString());
            System.out.println(getPath+getImage);
            response.setContentType(CONTENT_TYPE);
                OutputStream os = response.getOutputStream();
                InputStream inputStream = null;
                try {
                    getImage.replaceAll("\\s+","");
                File outputFile = new File(getPath,getImage);
                inputStream = new FileInputStream(outputFile);
                BufferedInputStream in = new BufferedInputStream(inputStream);
                int b;
                byte[] buffer = new byte[10240];
                while ((b = in.read(buffer, 0, 10240)) != -1) {
                os.write(buffer, 0, b);
                }

                } catch (Exception e) {

                System.out.println(e);
                }
                finally {
                if (os != null) {
                os.close();
                }
                if (inputStream != null) {
                inputStream.close();
                }

                }
    }
    
}
