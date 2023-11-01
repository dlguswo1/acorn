package homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Homework2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("euc-kr");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body><h3>");
		
		String cook = req.getParameter("cook");
		Enumeration<String> names = req.getParameterNames();
		
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			if (name != null) {
				String[] values = req.getParameterValues(name);
				
				for (String str : values) {
					out.println(name + " : " + str + "<br>");
					
					
					if (cook != null && cook.equals("on")) {
						Cookie cookie = new Cookie(name, req.getParameter(name));
						cookie.setMaxAge(60 * 60 * 24 * 30); 
						resp.addCookie(cookie);
					}
				}
			}
		}
		
		out.println("</h3></body></html>");
		out.close();
	}
}
	
