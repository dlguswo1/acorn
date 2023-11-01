<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전체 방문자 카운터</h1>
	<jsp:useBean id="cnt" class="com.example.ApplicationBean" scope="application"/>
	
	<% if(session.isNew()){ %>
	
	<jsp:setProperty property="counter" name="cnt" value="1"/>
	<%} 
// if 문을 set플퍼티에 덮어서 새로고침으로 인한 방문자 수를 늘리지 않음 
	%>
	방문자 수 : <jsp:getProperty property="counter" name="cnt"/> 명<br><br>
	
	<form action="applicationExam.jsp" method="post">
		<input type="submit" name="check" value="새로 고침" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" name="restart" value="카운터 리셋" />
	</form>
</body>
</html>