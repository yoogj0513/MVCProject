<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.red {
		color: red;
		display: none;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(function(){
		
		$("form").submit(function(){
			
			var num1 = $("input[name='num1']").val();
			var num2 = $("input[name='num2']").val();
			var cal = $("input[name='cal']:checked").length;
			
			if(num1 == "" || num2 == "") {
				
				$(".inputError").show();
				return false;
			} 
			
			if (cal == 0) {
				$(".radioError").show();
				return false;
			}
			
		})
		
	})
</script>
</head>
<body>
	<form action="calculator.do" method = "post">
		숫자 1 : <input type="text" name="num1"/>
		숫자 2 : <input type="text" name="num2"/><br>
		<input type="radio" name="cal" value="plus"/> 더하기
		<input type="radio" name="cal" value="minus"/> 빼기
		<input type="radio" name="cal" value="multi"/> 곱하기
		<input type="radio" name="cal" value="division"/> 나누기
		<br>
		<input type="submit" value="계산"/>
		<span class="inputError red">숫자를 입력해주세요.</span>
		<span class="radioError red">계산을 선택해주세요.</span>
	</form>
</body>
</html>