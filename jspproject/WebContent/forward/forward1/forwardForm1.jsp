<%@ page contentType="text/html;charset=euc-kr"%>

<html>
	<script>
	
	function check(){
		var id = document.getElementById("id");
		var password = document.getElementById("password");
		if (id.value == ""){
			alert("ID를 입력하세요");
			id.focus();
			return false;
	}
		if (password.value==""){
			alert("비밀번호를 입력하세요");
			password.focus();
			return false;
		}
	
	}
	
	</script>
	<body>
	<h1>Forward 사용법 예제</h1>

	<form method=post action="forwardFrom1.jsp" onSubmit="return check()">
	아이디 : <input type="text" name="id" id="id"><p>
	패스워드 : <INPUT TYPE="password" NAME="password" id="password"><p>
			   <input type="submit" value="보내기" onclick="idcheck">
	</form>

	</body>
	

</html>
