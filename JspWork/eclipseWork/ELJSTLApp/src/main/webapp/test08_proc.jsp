<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=request.getParameter("name") %>님 환영합니다.</h3>
	<h3>${param.name}님 환영합니다.</h3>
	<hr>
	총 방문자 수 : <%=request.getAttribute("visitCount") %> 명<br>
	총 방문자 수 : ${requestScope.visitCount} 명
	<hr>
	<h3>${param.name}님이 좋아하는 음식</h3>
	<%
		String[] foods = (String[])request.getAttribute("foods");
	%>
	<%=foods[0] %>, <%=foods[1] %>, <%=foods[2] %>, <%=foods[3] %>
	<br><br>
	${foods}, ${requestScope.foods[0]}, ${foods[1]}, ${foods[2]}, ${foods[3]}
	<hr>
	뽀삐의 주인 이름 : <br>
	홍길동의 강아지 이름 : <br>
</body>
</html>