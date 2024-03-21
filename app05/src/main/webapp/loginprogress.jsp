<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과 페이지</title>
</head>
<body>
	<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");

	boolean result = false;
	if (id.equals(password)) {
		Cookie cookie = new Cookie("Auth", id);
		response.addCookie(cookie);
		result = true;
	}
	%>

	<p>
		로그인 성공 여부:<%=result%></p>
	<%
	if (result) {
	%>
	<a href="preservice.jsp?page=1">서비스1</a>
	<a href="preservice.jsp?page=2">서비스2</a>
	<a href="preservice.jsp?page=3">서비스3</a>
	<%
	} else {
	%>
	<a href="loginform.html">다시 로그인하러가기</a>
	<%
	}
	%>
</body>
</html>