<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "java.net.URLDecoder" %>

<html>
	<head><title>��Ű���</title></head>
	<body>
	��Ű ���<br><br>

<%
    Cookie[] cookies = request.getCookies();
    if (cookies != null && cookies.length > 0) {
        for (int i = 0 ; i < cookies.length ; i++) {
%>

			<%= cookies[i].getName() %> = 
			<%= URLDecoder.decode(cookies[i].getValue()) %><br>

<%
        }//for end
    } else {
%>
		��Ű�� �������� �ʽ��ϴ�.
<%
    }
%>

	</body>
</html>