<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(function(){
		$(".error").hide();
		$(".error").css("color", "red");
		
		$("form").submit(function(){
			var id = $("input[name='id']").val();
			var pw = $("input[name='password']").val();
			
			if(id == "" || pw == "") {
				$(".error").show();
				return false;
			}
		})
	})
</script>
</head>
<body>
	<form action="login.do" method="post">  <!-- login.do -> MainController 실행됨 -->
		아이디 : <input type="text" name="id" /><br>
		비밀번호 : <input type="password" name="password" /><br>
		<input type="submit" value="로그인" />
		<span class="error">아이디/비밀번호 모두 작성해주세요.</span>
	</form>
</body>
</html>