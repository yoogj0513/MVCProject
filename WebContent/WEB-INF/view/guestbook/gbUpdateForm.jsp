<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.error {
		color: red;
	}
</style>
</head>
<body>
	<form action="update.do" method="post">
		번호 : ${gb.id }<br>
		<input type="hidden" name="id" value="${gb.id }"/> <!-- 클라이언트에게는 안보이지만 input은 살아있어서 전송 가능 -->
		이름 : <input type="text" name="name" value="${gb.name }"/><br>
		비밀번호 : <input type="text" name="password" /><br>
		메시지 : <textarea name="message" cols="50" rows="5">${gb.message }</textarea><br>
		<input type="submit" value="등록"/>
	</form>
	<c:if test="${error != null }">
		<script>
			alert("비밀번호가 일치하지 않습니다.");
		</script>
		<!-- <span class="error">비밀번호가 일치하지 않습니다.</span> -->
	</c:if>
</body>
</html>