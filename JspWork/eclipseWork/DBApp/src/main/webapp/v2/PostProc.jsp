<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("UTF-8");
	
	Connection con = null;
	/* PreparedStatement기법 : sql 넣을 때 ?로 대신할 수 있음   */
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String home = request.getParameter("homepage");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");
	String pass = request.getParameter("pass");
	
	//out.println(name + ", " +email + ", " + home + ", " + subject + ", " +
		//content + ", " + pass);
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott";
	String pw = "1111";
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, id, pw);
		
		String sql = "insert into tblBoard(b_num," +
				"b_name, b_email, b_homepage, b_subject, b_content," +
				"b_pass, b_count, b_ip, b_regdate, pos, depth)" +
				"values(seq_b_num.nextVal, ?,?,?,?,?,?,0,?,sysdate,0,0)";
		// sql
		// Statement 앞에 Prepared를 붙이면 변수를 나중에 입력받아 작성 가능하므로
		// ?라는 변수로 대체 사용이 가능 원래 없으면 '"name"'의 식으로 입력해야함
		stmt = con.prepareStatement(sql);
		// 입력받은 변수를을 저장할 준비시켜놓는
		stmt.setString(1, name);
		stmt.setString(2, email);
		stmt.setString(3, home);
		stmt.setString(4, subject);
		stmt.setString(5, content);
		stmt.setString(6, pass);
		stmt.setString(7, request.getRemoteAddr());
		stmt.executeUpdate();
		// 데이터
	
		response.sendRedirect("List.jsp");
	

	}
	catch(Exception e){
		System.out.println("PostProc.jsp: " + e);
	}
	finally{
		if(rs != null)
			rs.close();
		
		if(stmt != null)
			stmt.close();
		
		if(con != null)
			con.close();
	}
	//out.println(name + ", " + email + ", " + home + ", " + subject + ", " + content + ", " + pass);
%>