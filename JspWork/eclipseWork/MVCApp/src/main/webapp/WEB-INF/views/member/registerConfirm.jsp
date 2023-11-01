<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 가입 확인</h1>
	당신이 입력한 내용은 다음과 같습니다.
	
	<ul>
		<li>아이디 : ${member.id}</li>
		<!-- getId() -> id 프로퍼티 처럼 -->
		<li>패스워드 : ${member.pw}</li>
		<li>이메일 : ${member.email}</li>
	</ul>
	<form method="post" action="/MVCApp/mem">
		<input type="hidden" name="command" value="COMPLETE" />
		<input type="submit" value="가입 완료" />&nbsp;&nbsp;&nbsp;
		<input type="button" value="뒤로 " />
	</form>
</body>
</html>