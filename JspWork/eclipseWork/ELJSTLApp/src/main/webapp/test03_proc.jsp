<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	request.setCharacterEncoding("UTF-8"); %>
		이름 : <%= request.getParameter("name") %><br>
		아이디 : <%= request.getParameter("id") %><br>
		<hr><!-- EL로 바꾼다면 ? -->
		이름 : ${param.name} 또는 ${param["name"]}<br>
		아이디 : ${param.id}
	
	<%
		String[] foods = request.getParameterValues("food");
	%>
		<br>
		first food : <%=foods[0] %><br>
		second food : <%=foods[1] %><br>
		<hr>
		first food : ${paramValues.food[0]}
			또는 ${paramValues["food"][0]}<br>
		second food : ${paramValues.food[1]}<br>
	
	<%
		//String[] hobbies = request.getParameterValues("hobby");
	%>
	<%
		//for(int i=0; i<hobbies.length; i++){
	%>
			 취미 : <%// hobbies[i] %><br>
	<%		
		//}
	 %>
	<hr>
		취미1 : ${paramValues.hobby[0]}<br>
		취미2 : ${paramValues.hobby[1]}<br>
		취미3 : ${paramValues.hobby[2]}<br>
		
</body>
</html>