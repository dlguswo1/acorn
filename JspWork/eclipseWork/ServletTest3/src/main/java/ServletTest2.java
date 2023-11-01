import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("euc-kr");
		
		//사용자가 어디에 있는지
		PrintWriter out = resp.getWriter();	
		
		out.println("<html><body>");
		/*
		String[] singers = req.getParameterValues("singer");
		
		out.println("<h3>당신이 입력한 가수 이름 입니다.</h3>");
		out.println("<ul>");
		for(String singer : singers) {
			out.println("<li>가수 : " + singer + "</li>");
		}		
		out.println("</ul>");
		
		try {
			String foods[] = req.getParameterValues("food");
			System.out.println("foods :" + foods.length);
			
			out.println("<h3>당신이 체크한 음식 목록 입니다.</h3>");
			out.println("<ul>");
			for(String food : foods) {
				out.println("<li>음식 : " + food + "</li>");
			}		
			out.println("</ul>");
		}
		catch(NullPointerException e) {
			out.println("음식을 선택하지 않았습니다.");
		}
		
		try {
			String[] citys = req.getParameterValues("city");
			System.out.println("citys :" + citys.length);
			
			out.println("<h3>당신이 선택한 도시 목록 입니다.</h3>");
			out.println("<ul>");
			for(String city : citys) {
				out.println("<li>도시 : " + city + "</li>");
			}		
			out.println("</ul>");
		}
		catch(NullPointerException e) {
			out.println("도시를 선택하지 않았습니다.");
		}
		*/
		
		// getParameterNames()
		Enumeration<String> enumer = req.getParameterNames();
		while(enumer.hasMoreElements()) {
			// hasMoreElements() : 더 이상 꺼내올 것이 없을 때 까지
			String name = enumer.nextElement();
			if(name != null) {
				String[] values = req.getParameterValues(name);
				out.println("<h3>당신이 선택한" + name + "입니다.</h3>");
				out.println("<ul>");
				for(String val : values) {
					out.println("<li>도시 : " + val + "</li>");
				}		
				out.println("</ul>");
			}
		}
		
		out.println("</body></html>");
		out.close();
		
	}
}
