<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인중...</title>
</head>
<body>
	<!-- 세션 값에 id 저장 후 쇼핑몰로 이동 -->
	<%= request.getParameter("id") %>
	<% session.setAttribute("id", request.getParameter("id")); %>
	<% response.sendRedirect("./shoppingMall.jsp"); %>
</body>