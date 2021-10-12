<%@ page contentType = "text/html; charset=euc-kr" %>

<%
    session.invalidate();          // 세션 삭제
%>

<html>
	<head><title>세션 종료</title></head>
	<body>

   <script>
    alert("로그아웃");
    location.href="../../request/login/loginform.html";
   </script>

	</body>
</html>