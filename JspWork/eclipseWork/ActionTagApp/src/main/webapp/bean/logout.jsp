<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃 중...</title>
</head>
<body>
	<!-- 세션 값 삭제 후 메인페이지로 이동 -->
	<% session.invalidate(); %>
	<% response.sendRedirect("./index.html"); %>
</body>
</html>