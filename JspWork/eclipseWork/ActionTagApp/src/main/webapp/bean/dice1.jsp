<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>주사위 굴리기 예제</h2>
	<jsp:useBean id="dice" class="com.example.DiceBean" scope="page">
		<jsp:setProperty property="min" name="dice" value="1"/>
		<jsp:setProperty property="max" name="dice" value="6"/>
	</jsp:useBean>
	
	<h3>주사위 눈금은
	<jsp:getProperty property="randomNumber" name="dice"/>
	입니다.</h3>
	
	<form method="post" action="dice.jsp">
		<input type="submit" value="다시 굴리기"/>
	</form>
</body>
</html>