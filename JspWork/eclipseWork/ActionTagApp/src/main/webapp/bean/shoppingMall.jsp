<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쇼핑몰</title>
</head>
<body>
	<!-- 세션이 null이면 로그인 화면으로 이동 -->
	<% if (session.getAttribute("id") == null) {
		response.sendRedirect("./login.jsp");
	}	
	%>
	
	<h3><%= session.getAttribute("id") %>님 환영합니다.</h3><br><br>
	
	<!-- 로그아웃 -->
	<a href="./logout.jsp">로그아웃</a><br><br>
	
	<!-- 세션 유지하고 메인페이지로 이동 -->
	<a href="./index.html">메인페이지</a>
</body>
</html>