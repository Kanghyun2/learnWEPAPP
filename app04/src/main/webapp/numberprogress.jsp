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
	// request 기본 객체
	String gimoddi = request.getParameter("gimoddi");
	if (gimoddi == null || gimoddi.trim().equals("")) {
		response.sendRedirect("numberform.html");
	} else {

		System.out.println("사용자의 입력값: " + gimoddi);
		int num = Integer.parseInt(gimoddi);
		if (num > 0) {
	%>
	<p>양수를 입력했습니다</p>
	<%
	} else if (num < 0) {
	%>
	<p>음수를 입력했습니다</p>
	<%
	} else {
	%>
	<p>0을 입력했습니다</p>
	<%
	}
	}
	%>
	<%-- 양수, 0, 음수 확인 후 동적 페이지 출력 --%>
</body>
</html>