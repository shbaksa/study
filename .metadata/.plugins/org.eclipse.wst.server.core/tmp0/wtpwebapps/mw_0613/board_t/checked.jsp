<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
    // area필드에 1이 저장되어 있다면
    String area="3";
%>
 <script>
   function init()
   {
	   //alert();
	   // 필요한 위치의 radio에 체크가 되게 처리
	   document.pkc.area[<%=area%>].checked=true;
   }
 </script>
</head>
<body onload="init()">  <!-- onload : 문서를 읽을때 --> 
   
  <form name="pkc">
   <input type="radio" name="area" value="0">서울
   <input type="radio" name="area" value="1">경기
   <input type="radio" name="area" value="2">강원
   <input type="radio" name="area" value="3">충청
   <input type="radio" name="area" value="4">전라
  </form>
</body>
</html>