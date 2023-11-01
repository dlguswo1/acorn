<%@ page contentType="text/html; charset=UTF-8"%>

<!-- 클라이언트가 보내온 데이터를 전달 받음 -->

<%
	String name = request.getParameter("name");
	String age = "20";
%>
<%= name %>
<%= age %>