<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<hr>
<h2> Request연습 Form(숫자입력은 정수형으로 입력하세요.)</h2>
<hr>

<form action="/webTest/requestTest02.do" method="post">
	<input type="text" name="front">
	<select name = "cal">
		<option value="+"> + </option>
		<option value="-"> - </option>
		<option value="/"> / </option>
		<option value="*"> * </option>
		<option value="%"> % </option>
	</select>
	<input type="text" name="back">
	<input type="submit" value="확인">

</form>

</body>
</html>