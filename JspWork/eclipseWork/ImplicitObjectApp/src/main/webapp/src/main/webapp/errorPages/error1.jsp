<%@ page contentType="text/html; charset=UTF-8"
	isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	에러입니다
	<h4>에러입니다</h4>
	원인 : <%=exception.getMessage() %>
	<!-- isErrorPage="true"가 있어야지 에러 페이지 표현 가능 -->
</body>
</html>