package persistance;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletSession extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("euc-kr");
		
		String name = req.getParameter("name");
		HttpSession session = req.getSession();
		// 생성된 세션객체의 주소를 가져와서 HttpSession에 저장
		
		session.setAttribute("name", name);
		// 세션이 끊기기전까지 이름을 기억
		// 지정된 이름을 사용하여 개체를 이 세션에 바인딩합니다.
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("당신의 이름은 " + session.getAttribute("name") + " 이다.<br><br>");
		out.println("접속시간 : " + new Date(session.getCreationTime()) + "<br><br>");
		out.println("ID : " + session.getId() + "<br><br>");
		out.println("만료시간 : " + session.getMaxInactiveInterval() + "<br><br>");
		
		if(session.isNew()) {
			out.println("처음 접속하였습니다.");
		}
		else{
			out.println("최근에 접속하였습니다.");
		}
		out.println("</html></body>");
		out.close();
	}

}
