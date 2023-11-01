<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("cnt1", 100);
	// cnt1에다가 100을 저장
	// getAttribute로 꺼내옴
	int cnt2 = (Integer)request.getAttribute("cnt1");
%>
	

<%= cnt2 %><br>
<% out.println(cnt2); %><br>
${cnt1}, ${requestScope.cnt1}, ${sessionScope.cnt1} <br>
<!-- 원래 오른쪽처럼 입력해야함 -->

<%= session.getAttribute("cnt1") %><br>

${requestScope["cnt1"]}
${cnt2}
</body>
</html>