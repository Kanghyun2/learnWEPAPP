<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.setAttribute("mySession", "사용자별 상태 값 보관이 가능");
		request.setAttribute("myRequest", "요청 객체 속성");
	%>
	<p>설정</p>
</body>
</html>