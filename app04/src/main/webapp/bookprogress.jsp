<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선택한 책</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String price = request.getParameter("price");
	%>
	<p>선택한 책은 <%= title %> <%= price %> 입니다.</p>
</body>
</html>