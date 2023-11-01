<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert title here</title>
</head>
<body>
	<h2>간단한 Bean 예제</h2>
	<jsp:useBean id="cal" class="com.example.CalendarBean"/>
						<!-- class는 com.example패키기에 CalendarBean 자바파일 -->

   <h3> 오늘은  <jsp:getProperty property="year" name="cal"/>년  
   			  <jsp:getProperty property="month" name="cal"/>월  
   			  <jsp:getProperty property="date" name="cal"/>일 입니다. </h3>
</body>
</html>