<%@ page contentType = "text/html; charset=euc-kr" %>

<html>
	<head><title>include ��Ƽ��</title></head>
	<body>

<%
    int number = 10;
%>

<%@ include file="includee.jsp" %>

���뺯�� DATAFOLDER = "<%= dataFolder %>"

	</body>
</html>