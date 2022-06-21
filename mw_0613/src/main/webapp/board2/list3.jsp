<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="webapp/css/bootstrap.css">
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border-spacing : 0px;
	}
	td {
		border-top : 1px solid black;		
		height : 35px;
	}
	tr:last-child td {
		border-bottom : 2px solid black;
	}
	tr:first-child td {
		border-top: 2px solid black;
	}
	
	#aa {
		position : absolute;
		visibility : hidden;
		background : black;
		border : 2 soild;
		color : white;
	}
</style>
	
<script>
	function view(id) {
		
		document.getElementById("aa").style.visibility="visible";
		document.getElementById("aa").style.left=(event.pageX+10)+"px";
		document.getElementById("aa").style.top=event.pageY+"px";
		document.pkc.id.value=id; // 매개변수를 폼태그에 전달
		}
</script>
</head>
<body>

	<%
	Class.forName("com.mysql.jdbc.Driver");
	String db = "jdbc:mysql://localhost:3306/first";
	Connection conn = DriverManager.getConnection(db, "root", "1234"); 
	
	String sql ="select * from board2";
	
	PreparedStatement pstmt = conn.prepareStatement(sql);
	
	ResultSet rs = pstmt.executeQuery();
	
	%>
	
	<form name="pkc" id="aa" method="post" action="bimil_check.jsp">
	<input type="hidden" name="id">
	 비밀번호  <input type="password" name="pwd" size="4">
	<input type="submit" value="확인">
	</form>
	
	<table width="900" align="center" >
	<caption><h2> 게시판 목록 </h2></caption>
	<tr align="center">
	<td width="400" > <b>제목</b> </td>
	<td width="100"> <b>이름</b> </td>
	<td width="100"> <b>조회수</b> </td>
	<td width="100"> <b>작성일</b> </td>
	<td width="100"> <b>지역</b> </td>
	<td class="tdright" width="100"> <b>공개여부</b> </td>
	</tr>
	
	<% 
	int chk=1;
	String back;
	while(rs.next()) {
		if(chk%2 == 1) // chk 홀수 
			back="style='background:#eeeeee'";
		else // chk 짝수
			back="style='background:white'";
			%>
		
	<tr <%=back %> >
	<%if(rs.getInt("bimil") == 0) 
	{ %>	
	<td><a href="readnum.jsp?id=<%=rs.getInt("id")%>"> <%=rs.getString("title") %> </a>  </td>
	<%
	}
	else { 
	%>	
	<td> <span onclick="view(<%=rs.getInt("id")%>)"><%=rs.getString("title") %></span> </td> <!-- 클릭하면 비밀번호 입력창이 나오게 -->
								<!-- id값을 위의 폼태그의 id에 준다 -->
	<%
	}
	%>
	
	<td align="center"> <%=rs.getString("name") %></td>
	<td align="center"> <%=rs.getString("readnum") %></td>
	<td align="center"> <%=rs.getString("writeday") %> </td>	
	<td align="center"> <%switch(rs.getInt("area")) { 
	case 0 : %> 서울 <% break; 
	case 1 : %> 경기 <% break;
	case 2 : %> 강원 <% break;
	case 3 : %> 충청 <% break;
	case 4 : %> 전라 <% break;	
	case 5 : %> 경상 <% break;	
	case 6 : %> 제주 <% break;	
	} %> </td>	
	<td align="center"> <%switch(rs.getInt("bimil")){
		case 0 :  %> 공개글 <% break;
		case 1 :  %> 비밀글 <% break;
		
		}%> </td>
	
	</tr>
	<% 
	chk++;
	} %>
	<tr  >
	<td colspan="6" align="right"> <form method="post" action="write.jsp">
	<input type="submit" value="글쓰기"></form></td>
	</tr>
	<tr >
	<td colspan="6"> <form method="post" action="bimil_check.jsp"> 비고</form>
	</td>
	</tr>
	</table>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="wabapp/js/bootstrap.js"></script>
</body>
</html>