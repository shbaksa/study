<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script>
		function check()
		{
			//alert(document.pkc.pay[3].checked) // checked 체크가 되었으면 true, 아니면 false
			var chk=0;
			for(i=0;i<4;i++)
				{
				if(document.pkc.pay[i].checked) // 참이 발생되면 chk값은 1
					{
						chk=1;
					}
				}
			if(chk == 0)
			{
				alert("결제방법을 선택하세요");
				return false;
			}
			else
				{
					return true;
				}
		}
	
	</script>
</head>
<body>
	<form name="pkc" method="post" action="a.jsp" onsubmit="return check()">
		결제방법 : <input type="checkbox" name="pay" > 카드
				 <input type="checkbox" name="pay"> 현금
				 <input type="checkbox" name="pay"> 계좌이체
				 <input type="checkbox" name="pay"> 외상 <p>
		<input type="submit" value="전송">
				   
		
	</form>

</body>
</html>