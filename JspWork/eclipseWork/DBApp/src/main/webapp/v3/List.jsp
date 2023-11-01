<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import="mybean.*" %>
<%@ page import="java.util.*" %>

<%!
	// 페이징에 필요한 변수 선언
	
	int totalRecord = 0;
	// 총 글의 갯수
	int numPerPage = 5;
	// 한 페이지에 글이 3개 씩
	int totalPage =0;
	// 총 페이지 수
	int nowPage = 0;
	// 현재 페이지
	int beginPerPage = 0;
	// 페이지의 맞는 시작번호? 2페이지는 4번글부터, 페이지 별 시작번호
	int pagePerBlock = 3;
	// 블럭 당 페이지 수
	int totalBlock = 0;
	// 총 블럭 수
	int nowBlock = 0;
	// 현재 블럭
%>
<HTML>
<link href="style.css" rel="stylesheet" type="text/css">
<script>
	function check(){
		if(document.search.keyWord.value == ""){
			alert("검색어를 입력하세요.");
			document.search.keyWord.focus();
			return;
		}
		document.search.submit();
	}
</script>
<BODY>
<jsp:useBean id="dao" class="mybean.BoardDao"/>
<%
	request.setCharacterEncoding("UTF-8");
	
	String keyWord = request.getParameter("keyWord");
	String keyField = request.getParameter("keyField");
	
	Vector vec = (Vector)dao.getBoardList(keyField, keyWord);
	
	totalRecord = vec.size();
	totalPage = (int)Math.ceil((double)totalRecord / numPerPage);
	
	if(request.getParameter("nowPage") != null)
		nowPage = Integer.parseInt(request.getParameter("nowPage"));
	// nowPage를 클릭으로 받을건데 클릭을 정수형으로 바꿔줌
	
	if(request.getParameter("nowBlock") != null)
		nowBlock = Integer.parseInt(request.getParameter("nowBlock"));
	
	beginPerPage = nowPage * numPerPage;
	totalBlock = (int)Math.ceil((double)totalPage / pagePerBlock);
%>
<center><br>
<h2>JSP Board</h2>

<table align=center border=0 width=80%>
<tr>
	<td align=left>Total :  Articles(
		<font color=red>  <%=nowPage + 1 %> / <%=totalPage %> Pages </font>)
	</td>
</tr>
</table>

<table align=center width=80% border=0 cellspacing=0 cellpadding=3>
<tr>
	<td align=center colspan=2>
		<table border=0 width=100% cellpadding=2 cellspacing=0>
			<tr align=center bgcolor=#D0D0D0 height=120%>
				<td> 번호 </td>
				<td> 제목 </td>
				<td> 이름 </td>
				<td> 날짜 </td>
				<td> 조회수 </td>
			</tr>
	
		<%	
		if(vec != null || !vec.isEmpty()){
			for(int i = beginPerPage; i<(beginPerPage + numPerPage); i++){
				if(i == totalRecord)
					break;
				//마지막페이지에 자투리 에러를 반복문 중지로 해결 
				Board board = (Board)vec.get(i);
				// 여기서 글을 받아옴
		%>
	
	<tr>
		<td><%=board.getB_num() %></td>
		<td>
			<%=dao.useDepth(board.getDepth()) %>
			<%
				if(board.getDepth() > 0) {
			%>
				<img src="../image/re.gif" />
			<%
				}
			%>
			<a href="Read.jsp?b_num=<%=board.getB_num()%>">
			<%=board.getB_subject() %></a></td>
		<td><%=board.getB_name() %></td>
		<td><%=board.getB_regdate() %></td>
		<td><%=board.getB_count() %></td>
	</tr>
		<%
			} // for
		} // if
		else{
		%>
			데이터가 없습니다.
		<%
		} // else
		%>
	
		</table>
	</td>
</tr>
<tr>
	<td><BR><BR></td>
</tr>
<tr>
	<td align="left">Go to Page &nbsp;&nbsp;&nbsp;
	<%if(nowBlock > 0) {%>
		<a href="List.jsp?nowPage=<%=pagePerBlock * (nowBlock-1)%>&nowBlock=<%=nowBlock-1%>">이전<%=pagePerBlock %> 개</a>
	<% } %>
	::: &nbsp;&nbsp;&nbsp;
	<%
		for(int i = 0; i<pagePerBlock; i++){
			if((nowBlock * pagePerBlock) + i == totalPage)
				break;
	%>
		<a href="List.jsp?nowPage=<%=(nowBlock * pagePerBlock) + i%>&nowBlock=<%=nowBlock%>">
			<%=(nowBlock * pagePerBlock) + i + 1 %>
		</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<%
		}	
	%>
	&nbsp;&nbsp;&nbsp;
	:::
	<%if(totalBlock > nowBlock + 1 ) {%>
		<a href="List.jsp?nowPage=<%=pagePerBlock * (nowBlock + 1)%>&nowBlock=<%=nowBlock+1%>">다음<%=pagePerBlock%>개</a>
	<% } %>
	</td>
	<td align=right>
		<a href="Post.jsp">[글쓰기]</a>
		<a href="javascript:list()">[처음으로]</a>
	</td>
</tr>
</table>
<BR>
<form action="List.jsp" name="search" method="post">
	<table border=0 width=527 align=center cellpadding=4 cellspacing=0>
	<tr>
		<td align=center valign=bottom>
			<select name="keyField" size="1">
				<option value="name"> 이름
				<option value="subject"> 제목
				<option value="content"> 내용
			</select>

			<input type="text" size="16" name="keyWord" >
			<input type="button" value="찾기" onClick="check()">
			<input type="hidden" name="page" value= "0">
		</td>
	</tr>
	</table>
</form>
</center>	
</BODY>
</HTML>