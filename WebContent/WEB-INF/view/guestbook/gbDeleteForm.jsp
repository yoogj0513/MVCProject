<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<form action="delete.do" method="post">
		<input type="hidden" name="id" value="${id }" />
		메시지를 삭제하려면 암호를 입력하세요.<br>
		암호 : <input type="password" name="pass"/><br>
		<input type="submit" value="메시지 삭제하기"/>
	</form>
	<c:if test="${error != null }">	
		<span class="error">비밀번호가 틀렸습니다. 다시 입력하세요.</span>
	</c:if>
</body>
</html>