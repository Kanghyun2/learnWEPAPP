<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 설정</title>
</head>
<body>
	<%
	Cookie cookie = new Cookie("cname", "cvalue");
	cookie.setMaxAge(60 * 60 * 2);
	response.addCookie(cookie);
	%>
	<p>클라이언트에 쿠키를 응답으로 전송합니다.</p>
</body>
</html>