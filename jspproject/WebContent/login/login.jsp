<%@ page import ="beans.LoginBean" %>
<%@ page contentType="text/html;charset=euc-kr" %>

<% request.setCharacterEncoding("euc-kr"); %>

<%
 LoginBean login1 = new LoginBean();
//                       ������ ȣ��

%>

<jsp:useBean id="login" class="beans.LoginBean" />
<jsp:setProperty name="login" property="*" />

<HTML>
	<HEAD><TITLE> �α��� ���� </TITLE></HEAD>
<BODY>
<center>
<H2>�α��� ����</H2>
<HR>

<% 
	if(!login.checkUser()) {
		out.println("�α��� ���� !!");	
	}else {
		out.println("�α��� ���� !!");
	}
%>

<HR>
����� ���̵� : <jsp:getProperty name="login"  property="userid" /><BR>
            <%=login.getUserid() %><BR>
����� �н����� : <jsp:getProperty name="login" property="passwd" /><BR>
           <%=login.getPasswd() %><BR>
</BODY>
</HTML>