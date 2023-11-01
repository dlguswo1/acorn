package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CompleteCommand;
import model.ConfirmCommand;
import model.FactoryBean;
import model.ICommand;
import model.MainCommand;
import model.RegisterCommand;

@WebServlet("/mem")
//만들어진 @(annotation) 활용 web.xml에 등록하는 대신에 class 위에 @WebServlet 사용
//servlet에 어떻게 접속하게 할 것인가 ->("/mem")

public class MemberController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/*
		
		String command = req.getParameter("command");
		String url = "";
		
		ICommand cmd = null;
		 
		if(command.equals("REGISTER")) {
			cmd = new RegisterCommand();
		}
		else if(command.equals("CONFIRM")) {
		
			cmd = new ConfirmCommand();
		}
		else if(command.equals("COMPLETE")) {
			
			cmd = new CompleteCommand();
		}
		else if(command.equals("MAIN")) {
			cmd = new MainCommand();
		}
		else {
			// 잘못된 접근에 대한 처리
		}
		
		url = (String)cmd.processCommand(req, resp);
		
		RequestDispatcher view = req.getRequestDispatcher(url);
		// 현재 request에 담긴 정보를 저장하고 있다가
		// 그 다음 페이지 그 다음 페이지에도 해당 정보를 볼수있게 계속 저장하는 기능.
		
		view.forward(req, resp);
		// 사용자 요청에 의해 컨테이너에서 생성된 request와 response를
		// 다른 리소스(서블릿, jsp, html)로 넘겨주는 역할을 한다.
		*/
		
		String command = req.getParameter("command");
		String url = "";
		ICommand cmd = null;
		
		FactoryBean factory = FactoryBean.newInstance();
		cmd = factory.createInstance(command);
		
		url = (String)cmd.processCommand(req, resp);
		RequestDispatcher view = req.getRequestDispatcher(url);
		view.forward(req, resp);
	}
	
	

}
