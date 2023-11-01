<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>주사위 굴리기 예제</h1>
	<%
		java.util.Random random = new java.util.Random();
		int randomNumber = random.nextInt(6-1+1)+1;
	%>
	
	<h3>주사위 눈금은 <%=randomNumber %>입니다.</h3>
	
	<form method="post" action="dice.jsp">
		<input type="submit" value="다시 굴리기"/>
	</form>
</body>
</html>

<!-- 
	Bean ClassName : com.example.DiceBean
	
	property spec.
	name			r/w			datatype		explain
	--------------------------------------------------------
	randomNumber	r			int				임의의 값 생성
	maxNumber		r/w			int				생성가능한 최대값
	minNumber		r/w			int				생성가능한 최소값
 -->