<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- init -->
	GlobalData : <%= application.getInitParameter("globalData") %><br>
	
	<!-- initParam -->
	GlobalData : ${initParam.globalData}
</body>
</html>