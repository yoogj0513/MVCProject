<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.error {
		color: red;
		display: none;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(function(){
		
		$("form").submit(function(){			
			var selectVal = $("#site").val();
			
			if(selectVal == "선택") {
				$(".error").show();
				return false;
			}
		})
	})
</script>
</head>
<body>
	<h3>당신이 좋아하는 사이트를 선택하세요.</h3>
	<form action="select.do" method="post">
		<select name="site" id="site">
			<option value="선택">선택하세요.</option>
			<option value="naver">naver</option>
			<option value="google">google</option>
			<option value="daum">daum</option>
		</select>
		<input type="submit" value="전송"/> 
		<span class="error">사이트를 선택해주세요.</span>
	</form>
</body>
</html>