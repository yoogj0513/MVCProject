<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="phone.do" method="post">
		<fieldset>
			<p>
				<label>휴대폰 os</label>
				<select name="phone" id="phone">
					<option value="os선택">os선택</option>
					<option value="안드로이드">안드로이드</option>
					<option value="아이폰">아이폰</option>
				</select>
			</p>
			<p>
				<label>제조회사</label>
				<input type="radio" name="company" value="삼성"/> 삼성
				<input type="radio" name="company" value="LG"/> LG
				<input type="radio" name="company" value="apple"/> apple
				<input type="radio" name="company" value="기타"/> 기타
			</p>
			<p>
				<label>자주 사용하는 APP</label>
				<input type="checkbox" name="app" value="전화"/> 전화
				<input type="checkbox" name="app" value="문자"/> 문자
				<input type="checkbox" name="app" value="카카오톡"/> 카카오톡
				<input type="checkbox" name="app" value="게임"/> 게임
				<input type="checkbox" name="app" value="인터넷"/> 인터넷
				<input type="checkbox" name="app" value="유튜브"/> 유튜브
				<input type="checkbox" name="app" value="기타"/> 기타
			</p>
			<input type="submit" value="결과"/>
		</fieldset>
	</form>
</body>
</html>