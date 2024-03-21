<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>컨텐츠 입력 폼</title>
</head>
<body>
	<%-- 역할 확인이 없음 --%>
	<%
	String role = (String) session.getAttribute("role");
	if (role == null || !role.equals("ADMIN")) {
	%>
		<p>관리자만 사용할 수 있습니다</p>
	<%
	} else {
	%>
	<form action="contentwrite.jsp" method="post">
		<label>글제목<input type="text" name="heading"></label>
		<label>글내용<textarea rows="5" cols="50" name="text"></textarea></label>
		<input type="submit" value="작성">
	</form>
	<%
	}
	%>
</body>
</html>

