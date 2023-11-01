<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script>
function checkID(obj, msg) {
	if (obj.value != "user1") {
		alert(msg + "가 올바르지 않습니다.")
		return false;
	} else {
		return true;
	}
}

function checkPW(obj, msg) {
	if (obj.value != "1234") {
		alert(msg + "가 올바르지 않습니다.")
		return false;
	} else {
		return true;
	}
}

function fnCheck(obj) {
	if (!checkID(obj.id, "아이디")) {
		return false;
	}
	if (!checkPW(obj.pw, "비밀번호")) {
		return false;
	} 
	
	return true;
}
</script>
</head>
<body>
		<h1>로그인</h1>
	<hr>
	<!-- 세션 값이 null이 아니면 쇼핑몰로 이동 -->
	<%
		if (session.getAttribute("id") != null) {
			response.sendRedirect("./shoppingMall.jsp");
		}
	%>
	
	<!-- 아이디 비밀번호 체크 후 로그인 프로세스로 이동 -->
	<form action="loginProcess.jsp" method="post" onsubmit="return fnCheck(this)">
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td bgcolor="#87ceeb">아이디</td>
				<td><input type="text" name="id"/></td>
			</tr>
			<tr>
				<td bgcolor="#87ceeb">비밀번호</td>
				<td><input type="password" name="pw"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="로그인"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>