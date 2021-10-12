<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="java.sql.*"%>

<%
  String uid=request.getParameter("id");
%>
<html>
<head><title>레코드 삭제예제</title></head>

<body>
  <h2>member1 테이블의 레코드 삭제예제</h2>

  <FORM METHOD="post" ACTION="deleteTest.jsp">
  <input type=hidden name="id" value="<%=uid %>">
  <%--   아이디 : <%=id %><p> --%>
    패스워드 : <INPUT TYPE="password" NAME="passwd"><p>
   <%--  이름:<%=name%><p> --%>
    <INPUT TYPE="submit" VALUE="삭제">
  </FORM>

</body>
</html>



