<%@ page contentType="text/html; charset=euc-kr" %>
<% request.setCharacterEncoding("euc-kr");%>

<%-- <%@page import="javaBean.SimpleBean"%>
<%
      SimpleBean sb1= new SimpleBean();
      sb1.setMsg("�ȳ�");
      sb1.setName("ȫ�浿");
%>
�̸� : <%=sb1.getName() %><br>
�޽��� : <%=sb1.getMsg() %> --%>

<jsp:useBean id="sb" class="javaBean.SimpleBean" />
<jsp:setProperty name="sb" property="*"/>
<html>
	<body>
	<h1>������ �ڹٺ� ���α׷���</h1>
	<br>
	�̸�: <jsp:getProperty name="sb" property="name" /><br>
	�޽���: <jsp:getProperty name="sb" property="msg" /><br>
	</body>
</html>