<%@ page contentType="text/html;charset=euc-kr"%>

<html>
	<script>
	
	function check(){
		var id = document.getElementById("id");
		var password = document.getElementById("password");
		if (id.value == ""){
			alert("ID�� �Է��ϼ���");
			id.focus();
			return false;
	}
		if (password.value==""){
			alert("��й�ȣ�� �Է��ϼ���");
			password.focus();
			return false;
		}
	
	}
	
	</script>
	<body>
	<h1>Forward ���� ����</h1>

	<form method=post action="forwardFrom1.jsp" onSubmit="return check()">
	���̵� : <input type="text" name="id" id="id"><p>
	�н����� : <INPUT TYPE="password" NAME="password" id="password"><p>
			   <input type="submit" value="������" onclick="idcheck">
	</form>

	</body>
	

</html>
