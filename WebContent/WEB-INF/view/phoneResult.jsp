<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>휴대폰 os : ${os }</p>
	<p>휴대폰 제조 회사 : ${company }</p>
	<p>자주 사용하는 APP : 
		<c:forEach var="app" items="${apps }">
			${app },
		</c:forEach>
	</p>
</body>
</html>