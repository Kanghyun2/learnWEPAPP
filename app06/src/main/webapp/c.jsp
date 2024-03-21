<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// 사용자 요청 한 번이 처리되는 동안 유지되는 객체.
	request.setAttribute("요청 처리중 필요할 때", "응답을 구성하며 사용할 값");
	// 각 브라우저(사용자)별 유지되는 객체.
	session.setAttribute("사용자별 식별이 가능한 상태 값", "로그인 상태 등");
	// 하나의 웹 어플리케이션이 동작하는 동안 유지되는 객체.
	application.setAttribute("어플리케이션 전역에서", "필요한 앱 설정 값");
	%>
</body>
</html>