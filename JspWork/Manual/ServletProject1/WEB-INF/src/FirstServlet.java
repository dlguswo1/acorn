import javax.servlet.http.*;

// 주석
public class FirstServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp){
		System.out.println("Servlet start...:");
	}
}