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
		$("form").submit(function(){
			
		})
	})
</script>
</head>
<body>
	<form action="join.do" method="post">
		<fieldset>
			<legend>회원가입</legend>
			<p>
				이름 : <input type="text" name="name"/>
			</p>
			<p>
				생년월일 : <input type="text" name="birthday"/>
			</p>
			<p>
				전화번호 : <input type="text" name="tel" />
			</p>
			<div>
				<input type="submit" value="가입" />
				<input type="reset" value="취소"/>
			</div>
		</fieldset>
	</form>
</body>
</html>