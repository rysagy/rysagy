<%@ page contentType = "text/html; charset=euc-kr" %>

<%
    session.invalidate();        // 세션 삭제
%>

<html>
	<head><title>로그아웃</title></head>
	<body>

	<script>
	      alert("로그아웃 되었습니다");
	      location.href="sessionLoginForm.jsp";
	
	</script>

	</body>
</html>