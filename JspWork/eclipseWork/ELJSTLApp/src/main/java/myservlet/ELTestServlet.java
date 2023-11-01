package myservlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybean.Dog;
import mybean.Person;

public class ELTestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		
		req.setAttribute("visitCount", 100);
		
		String[] favorateFood = {"냉면", "돼지갈비", "순대국", "콩국수"};
		req.setAttribute("foods", favorateFood);
		// 왼쪽 : 변수명, 오른쪽 : 담은 내용
		
		ArrayList<String> movies = new ArrayList<String>();
		movies.add("영웅본색1");
		movies.add("영웅본색2");
		movies.add("영웅본색3");
		movies.add("어벤저스");
		req.setAttribute("movies", movies);
		
		Person hong = new Person();
		Dog popee = new Dog();
		// 객체 생성
		
		hong.setName("홍길동");
		popee.setName("뽀삐");
		
		hong.setDog(popee);
		// 홍이 강아지를 소유
		req.setAttribute("hong", hong);
		
		// core/test07.jsp에서 사용할 데이터
		String[] movie1 = {"매트릭스", "캐리비안의 해적", "마션", "007 스펙터"};
		String[] movie2 = {"넘버3", "관상", "명량"};
		
		ArrayList list = new ArrayList();
		list.add(movie1);
		list.add(movie2);
		req.setAttribute("moviList", list);
		
		// 댓글 데이터
		String[] comment = {"이 사이트는 편리합니다.", "정말 좋은 사이트인듯.."
				, "자주 찾는 사이트가 될 것 같아요!"}
		req.setAttribute("comments", comment);
		
		// MEMBER변수에 guest와 member값을 번갈아서 사용
		req.getSession().setAttribute("MEMBER", "guest");
		
		
		RequestDispatcher view = 
				req.getRequestDispatcher("test08_proc.jsp");
				// 요청받은 정보를 다른 페이지로 넘기는 함수
		view.forward(req, resp);
		//view로 정의하고 실행하는 것은 forward
	}	
}