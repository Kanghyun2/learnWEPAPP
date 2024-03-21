<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 확인</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			out.println(c.getName() + " : " + c.getValue());
		}
	%>
	<p>브라우저가 전송한 쿠키를 확인했습니다.</p>
</body>
</html>