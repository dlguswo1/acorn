<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("UTF-8"); %>
	<jsp:useBean id="req" class="com.example.RequestBean" scope="request"/>
	<!-- 객체 생성 -->
	<jsp:setProperty property="header" name="req" param="header"/>
	<jsp:setProperty property="footer" name="req" param="footer"/>
	<!-- 저장 : setter -->

	<jsp:include page="inc/header.jsp"></jsp:include>
	<form method="post" action="requestExam.jsp">
		머릿말에 들어갈 내용 : <br>
		<textarea rows="2" cols="60" name="header"></textarea>
		<br><br>
		꼬릿말에 들어갈 내용 : <br>
		<textarea rows="2" cols="60" name="footer"></textarea>
		<br><br>
		<input type="submit" value="새로고침"/>
	</form>
	<jsp:include page="inc/footer.jsp"></jsp:include>
</body>
</html>

<!-- 
Bean ClassName : com.example.RequestBean
name			r/w				Datatype
----------------------------------------
header			r/w				String
footer			r/w				String
 -->