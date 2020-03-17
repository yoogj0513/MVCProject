<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>당신이 듣고 싶은 음악을 선택하세요. (중복선택 가능)</h1>
	<form action="song.do" method="post">
		<input type="checkbox" name="song" value="always.mp3"/> always.mp3-윤미래<br>
		<input type="checkbox" name="song" value="다시_너를.mp3"/> 다시_너를.mp3-매드크라운, 김나영<br>
		<input type="checkbox" name="song" value="말해_뭐해.mp3"/> 말해_뭐해.mp3-케이윌<br>
		<input type="checkbox" name="song" value="You_are_my_everything.mp3"/> You_are_my_everything.mp3-거미<br>
		<input type="checkbox" name="song" value="이사랑.mp3"/> 이사랑.mp3-다비치<br>
		<input type="submit" value="선택완료" />
	</form>
</body>
</html>