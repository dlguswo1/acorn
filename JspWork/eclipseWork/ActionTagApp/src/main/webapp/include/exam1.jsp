<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> exam1.jsp </title>
</head>
<body>
	<jsp:include page="inc/header.jsp"></jsp:include>
	<!-- 여기서 include는 포함이 아니라 이동의 의미이다. -->
	<%
		int i = 20;
	%>
	<%= i %>
	
	<h1>Welcome To My world</h1>
	...
	
	<%@ include file = "inc/footer.jsp" %>
	
	<%
		int j = 20;
	%>
	<%= j %>
</body>
</html>