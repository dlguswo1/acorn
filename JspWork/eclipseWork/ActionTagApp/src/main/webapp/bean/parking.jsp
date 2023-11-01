<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.example.CarDto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="parking" class="com.example.ParkingBean" scope="application"/>
	<jsp:setProperty property="enter" name="parking" param="enter"/>
	<jsp:setProperty property="exit" name="parking" param="exit"/>
	<h1>주차 관리 프로그램</h1>
	<form action="parking.jsp" method="Post">
		주차장에 들어온 차 번호 : <input type="text" name="enter"/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" name="입차" />
	</form>
	
	
	<form action="parking.jsp" method="Post">
		주차장에서 나간 차 번호 : <input type="text" name="exit"/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" name="출차" />
	</form>
	<hr/>
	주차된 차량 목록 <br>
	<table border="1">
		<tr>
			<th>차량 번호</th>
			<th>입차 시간</th>
		</tr>
		<jsp:useBean id="car" class="com.example.CarDto" />
		<%	
		CarDto[] cars = parking.getCarList();
		for(int i = 0; i<cars.length; i++){
			//CarDto car = cars[i];
			pageContext.setAttribute("car", cars[i]);
		%>
			<tr>
				<td><jsp:getProperty property="plateNumber" name="car"/></td>
				<td><jsp:getProperty property="parkingTime" name="car"/></td>
			<!-- 액션 태그로 바꿔보기 -->
			</tr>
		<%
		}
		%>
	</table>
	
	총 대수 : <jsp:getProperty property="total" name="parking"/>
</body>
</html>

<!-- 
*************************************************
className : com.example.CarDto
name r/w datatype
------------------------------------
plateNumber r String
parkingTime r java.util.Date

*************************************************
className : com.example.ParkingBean
name r/w datatype
------------------------------------
enter w String
exit w String
total r int
car r CarDto
carList r carDto[]
-->