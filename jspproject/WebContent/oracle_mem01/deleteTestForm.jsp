<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="java.sql.*"%>

<%
  String uid=request.getParameter("id");
%>
<html>
<head><title>���ڵ� ��������</title></head>

<body>
  <h2>member1 ���̺��� ���ڵ� ��������</h2>

  <FORM METHOD="post" ACTION="deleteTest.jsp">
  <input type=hidden name="id" value="<%=uid %>">
  <%--   ���̵� : <%=id %><p> --%>
    �н����� : <INPUT TYPE="password" NAME="passwd"><p>
   <%--  �̸�:<%=name%><p> --%>
    <INPUT TYPE="submit" VALUE="����">
  </FORM>

</body>
</html>



