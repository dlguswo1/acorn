package lifecycle;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class ServletLifeCycle extends HttpServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service가 호출됨");
		
	}

	@Override
	public void destroy() {
		System.out.println("destory가 호출됨");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init가 호출됨");
	}

}
