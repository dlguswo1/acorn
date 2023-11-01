<%@page import="java.util.Date"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fmt:formatNumber value="10000000"/><br>
	<!-- 3자리마다 콤마를 찍어줌 -->
	<fmt:formatNumber value="10000000" groupingUsed="false"/><br>
	<!-- 숫자의 형태를 바꿔줌 -->
	<fmt:formatNumber value="3.14159265458979" pattern="#.###"/><br>
	<!--  자릿 수(전에서 반올림) -->
	<fmt:formatNumber value="0.5" type="percent"/><br>
	<!-- 퍼센트 표시 -->
	<fmt:formatNumber value="250000000" type="currency"/><br>
	<!-- 원화 표시 -->
	<fmt:formatNumber value="250000000" type="currency"
		currencySymbol="$"/><br>
	<!-- 달러 표시 -->
	<hr>
	<%
		Date date = new Date();
	%>
	<c:set var="today" value="<%=new Date() %>"/>
	
	<fmt:formatDate value="${today}" type="date"/><br>
	<fmt:formatDate value="${today}" type="time"/><br>
	<fmt:formatDate value="${today}" type="both"/><br>
	<!-- 년도 날짜, 시간 표시 -->
	<br>
	<fmt:formatDate value="${today}" dateStyle="short"/><br>
	<fmt:formatDate value="${today}" dateStyle="medium"/><br>
	<fmt:formatDate value="${today}" dateStyle="long"/><br>
	<fmt:formatDate value="${today}" dateStyle="full"/><br>
	<!-- 년도 월일 요일 표시 -->
	<br>
	<fmt:formatDate value="${today}" type="time" timeStyle="short"/><br>
	<fmt:formatDate value="${today}" type="time" timeStyle="medium"/><br>
	<fmt:formatDate value="${today}" type="time" timeStyle="long"/><br>
	<fmt:formatDate value="${today}" type="time" timeStyle="full"/><br>
	<!-- timeStyle : 시간표시 -->
	<br>
	<fmt:formatDate value="${today}" pattern="yyyy/MM/dd(E)" /><br>
	<!-- 2023/10/06(금) -->
	<hr>
	
	<!-- 원하는 국가 형태 -->
	<fmt:setLocale value="ko_kr"/><!-- 기본 값 -->
	<fmt:setLocale value="en_us"/>
	<fmt:formatNumber value="250000000" type="currency"/><br>
	<fmt:formatDate value="${today}" type="both" dateStyle="full"
		timeStyle="full"/><br>
		
	<hr>

	<!-- 해당 국가 표준 시간 -->
	<fmt:setLocale value="ko_kr"/>
	서울 : <fmt:formatDate value="${today}" type="both" /><br>
	<br>
	<fmt:timeZone value="Asia/Hong_Kong">
	홍콩 : <fmt:formatDate value="${today}" type="both" /><br>
	</fmt:timeZone><!-- 이렇게하면 사이에 값만 할당되고 바로 빠져나옴 -->
	<br>
	<fmt:timeZone value="Euroup/London">
	런던 : <fmt:formatDate value="${today}" type="both" /><br>
	</fmt:timeZone>
	<br>
	<fmt:timeZone value="America/New_York">
	뉴욕 : <fmt:formatDate value="${today}" type="both" /><br>
	</fmt:timeZone>
	<br>

</body>
</html>