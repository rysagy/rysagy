<%@ page contentType="text/html; charset=euc-kr" %>
<% request.setCharacterEncoding("euc-kr");%>

<%-- <%@page import="javaBean.SimpleBean"%>
<%
      SimpleBean sb1= new SimpleBean();
      sb1.setMsg("안녕");
      sb1.setName("홍길동");
%>
이름 : <%=sb1.getName() %><br>
메시지 : <%=sb1.getMsg() %> --%>

<jsp:useBean id="sb" class="javaBean.SimpleBean" />
<jsp:setProperty name="sb" property="*"/>
<html>
	<body>
	<h1>간단한 자바빈 프로그래밍</h1>
	<br>
	이름: <jsp:getProperty name="sb" property="name" /><br>
	메시지: <jsp:getProperty name="sb" property="msg" /><br>
	</body>
</html>