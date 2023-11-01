<%@ page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="dao" class="mybean.BoardDao"/>
<jsp:useBean id="dto" class="mybean.Board"/>

<%
	request.setCharacterEncoding("UTF-8");
%>

<jsp:setProperty property="b_name" name="dto" param="name"/>
<jsp:setProperty property="b_email" name="dto" param="email"/>
<jsp:setProperty property="b_homepage" name="dto" param="homepage"/>
<jsp:setProperty property="b_subject" name="dto" param="subject"/>
<jsp:setProperty property="b_content" name="dto" param="content"/>
<jsp:setProperty property="b_pass" name="dto" param="pass"/>
<jsp:setProperty property="b_ip" name="dto"/>
<!-- 액션태그로 만들었음 -->
<!-- <jsp:setProperty property="*" name="dto"/> -->
<!-- 이렇게 별표로 한번에 다 담아올 수 있음 -->

<%
	dao.setBoard(dto);
	response.sendRedirect("List.jsp");
%>
