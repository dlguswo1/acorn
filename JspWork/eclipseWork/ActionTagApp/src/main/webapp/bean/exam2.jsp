<%@page import="com.example.MessageBean"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.example.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="simple1" class="com.example.MessageBean"></jsp:useBean>
	<!-- 객체 생성 -->
	
	<jsp:setProperty property="msg" name="simple1" value="간단한 빈 예제입니다."/>
	
	메시지 : <jsp:getProperty property="msg" name="simple1"/>
	<hr/>
	<%
		MessageBean simple2 = new MessageBean();
		simple1.setMsg("이것은 스크립트릿으로 작성된 구문입니다.");
		simple2.setMsg(" 스크립트릿으로 생성된 객체입니다.");
	%>
	메시지 : <%= simple1.getMsg() %><br>
	메시지 : <%= simple2.getMsg() %>
</body>
</html>

<!-- 
	Bean ClassName : com.example.MessageBean
	
	Property Spec.
	--------------
	name		r/w		DataType		explain
	-------------------------------------------
	Message		r/w		String			메세지를 저장하고 가져오는 기능
	
	r/w : getter, setter
	void setMessage(String ~) : 매개변수 안써도 있어야함
	String getMessage() : 매개변수 없어야함, 리턴 값 있어야함
 -->