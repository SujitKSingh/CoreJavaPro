import java.io.*;
import javax.servlet.GenericServlet;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/MyGenericServlet")
public class MyGenericServlet extends GenericServlet {
private static final long serialVersionUID = 1L;
public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<html><body>");
out.println("<h3><u>Resume</u></h3>");
out.println("This is the First Servlet");
out.println("</body></html>");
}
}