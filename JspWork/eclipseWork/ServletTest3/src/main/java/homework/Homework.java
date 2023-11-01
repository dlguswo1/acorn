package homework;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Homework extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("euc-kr");
		
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String sx = req.getParameter("sx");
		String[] hb = req.getParameterValues("hb");
		String jb = req.getParameter("jb");
		String sy = req.getParameter("sy");
		String ck = req.getParameter("ck");
		
		
		if(req.getMethod().equals("POST")){
			
			
			Cookie idCook = new Cookie("id", id);
			Cookie pwCook = new Cookie("pw", pw);
			Cookie sxCook = new Cookie("sx", sx);
			
			Cookie jbCook = new Cookie("jb", jb);
			Cookie syCook = new Cookie("sy", sy);
			Cookie ckCook = new Cookie("ck", ck);
			
			idCook.setMaxAge(60 * 60 * 24);
			pwCook.setMaxAge(60 * 60 * 24);
			sxCook.setMaxAge(60 * 60 * 24);
			jbCook.setMaxAge(60 * 60 * 24);
			syCook.setMaxAge(60 * 60 * 24);
			ckCook.setMaxAge(60 * 60 * 24);
			
			resp.addCookie(idCook);
			resp.addCookie(pwCook);
			resp.addCookie(sxCook);
			resp.addCookie(jbCook);
			resp.addCookie(syCook);
			resp.addCookie(ckCook);
			
			resp.getWriter().println("쿠키가 저장되었습니다.");
			}
			else {
				Cookie[] cooks = req.getCookies();
				for(Cookie c : cooks) {
					resp.getWriter().println(c.getName() + "," + c.getValue());
				}
			}
		out.println("<html><body>");
		
		
	}

}
