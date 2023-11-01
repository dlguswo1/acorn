<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>contextExam2.jsp</h1>
	<h2>session 값을 확인</h2>
	<%=
		session.getAttribute("i")
	%>
	
	<h2>application 값을 확인</h2>
	<%= 
		application.getAttribute("i")
		// 세션과 어플리케이션 두개는 전역변수
		// 개념이라 가능
	%>
	
	<h2>pageContext 값을 확인</h2>
	<%= 
		pageContext.getAttribute("i")
		// 지역변수라 벗어나면 null로 바뀜
		// request도 마찬가지
	%>
	
	
</body>
</html>