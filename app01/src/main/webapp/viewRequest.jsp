<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기본 객체 request</title>
</head>
<body>
	<%
		// request : 클라이언트에서 전송한 요청 정보를 객체화한 것
		String uri = request.getRequestURI(); // 요청한 URL
		out.println(uri);
		out.println("<hr>");
		Enumeration<String> names = request.getHeaderNames();
		while (names.hasMoreElements()) {
			out.println(request.getHeader(names.nextElement()));
			out.println("<br>");
		}
	%>
</body>
</html>