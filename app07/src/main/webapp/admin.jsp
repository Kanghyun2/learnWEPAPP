<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="roleerror.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 전용 페이지</title>
</head>
<body>
	<%

		String role = (String) session.getAttribute("role");
		if (role.equals("ADMIN")) {
	%>
	<p>관리자만 볼 수 있는 메뉴</p>
	<a href="contentcontrol.jsp">글 삭제하러 ㄱㄱ</a>
	<%
		} else {
	%>
	<p>권한이 없습니다.</p>
	<%
		}
	%>
</body>
</html>