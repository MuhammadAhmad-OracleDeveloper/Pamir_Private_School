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

@WebServlet(name = "ImageServlet", urlPatterns = { "/imageservlet" })
public class ImageServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String path = "E:\\Pamir_Private_School\\ViewController\\src\\META-INF\\resources\\images\\";
//        C:\\Meta_Data\\Pamir_Data\\student_regstr\\

        String var0 = "";
        try {
            if (!request.getParameter("imageNameParam").isEmpty()) {
                var0 = request.getParameter("imageNameParam");
            } else {
                var0 = "no_image.jpg";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
//        response.setContentType(CONTENT_TYPE);
//        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("<head><title>ImageServlet</title></head>");
//        out.println("<body>");
//        out.println("<p>The servlet has received a GET. This is the reply.</p>");
//        out.println("</body></html>");
//        out.close();
                    System.out.println("Image servlet called '''''''''''''''''''''''''");
            //System.out.println(System.getProperty("user.dir"));
            //System.out.println(Paths.get("").toAbsolutePath().toString());
            System.out.println(path+var0);
            response.setContentType(CONTENT_TYPE);
                OutputStream os = response.getOutputStream();
                InputStream inputStream = null;
                try {
                    var0.replaceAll("\\s+","");
                File outputFile = new File(path,var0);
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
