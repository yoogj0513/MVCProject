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
	<c:forEach var="song" items="${songs }">
		<h3>${song }</h3>
		<audio src="audio/${song }" controls autoplay></audio>
	</c:forEach>
</body>
</html>