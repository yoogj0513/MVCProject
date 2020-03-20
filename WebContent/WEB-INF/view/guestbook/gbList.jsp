<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border-collapse: collapse;
	}
	
	td {
		border: 1px solid #000;
		padding: 5px;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(function(){
		$(".btnMod").click(function(){
			//var id = $(this).parent().prev().prev().prev().html();
			var id = $(this).attr("data-id");
			location.href = "update.do?id="+id;
		})
		
		$('.btnDel').click(function(){
			var id = $(this).attr("data-id");
			location.href = "delete.do?id="+id;
		})
	})
</script>
</head>
<body>
	<!-- 제일 마지막 /를 기점의 주소 href에 작성 -->
	<a href="add.do">방명록 등록</a>
	<table>
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>방명록 내용</td>
			<td></td>
		</tr>
		<!-- 여기에 db 내용 추가 -->
		<c:forEach var="gb" items="${list }">
			<tr>
				<td>${gb.id }</td>
				<td>${gb.name }</td>
				<td>${gb.message }</td>
				<td>
					<button class="btnMod" data-id="${gb.id }">수정</button>
					<button class="btnDel" data-id="${gb.id }">삭제</button>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>