<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add.do" method="post">
		이름 : <input type="text" name="name"/><br>
		비밀번호 : <input type="text" name="password" /><br>
		메시지 : <textarea name="message" cols="50" rows="5"></textarea><br>
		<input type="submit" value="등록"/>
	</form>
</body>
</html>