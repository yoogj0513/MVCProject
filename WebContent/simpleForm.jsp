<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.error {
		color:red;
		display: none;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(function(){
	
		
		$("form").submit(function(e){
			// 입력한 값이 없으면 sumbit을 막음
			//1번째 방법
			//e.preventDefault(); 
			
			var test = $("input[name='test']").val();
			if(test == "") {
				// 2번째 방법 : 전송이 완전히 막히는 것
				$(".error").show();
				return false; 				
			}
			
			
		})
	})
</script>
</head>
<body>
	<%-- post로 해야 result로 이동 --%>
	<form action="simple.do" method="post">
		아무 글자나 넣어세요<br>
		<input type="text" name="test" />
		<input type="submit" value="전송" />
		<span class="error">글자를 입력하세요.</span>
	</form>
</body>
</html>