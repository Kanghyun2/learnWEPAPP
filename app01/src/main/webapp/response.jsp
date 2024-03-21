<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response 기본 객체</title>
</head>
<body>
	<%
		// response : 응답 기본 객체. 개발자가 사용자(client)에게 보낼 응답 내용을 조작할 수 있는 객체.
		response.sendRedirect("http://www.naver.com");
	%>
	<p>해당 내용을 볼 수 없어요</p>
</body>
</html>