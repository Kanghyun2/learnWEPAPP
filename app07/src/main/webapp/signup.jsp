<%@page import="java.util.Map"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 입력 폼</title>
</head>
<body>
	<%
	Map<String, String> map = (Map) session.getAttribute("map");
	session.removeAttribute("map");
	%>
	<%
	if (map != null) {
		for (String value : map.values()) {
	%>
	<p><%=value%></p>
	<%
	}
	}
	%>
	<c:if test="${ map != null }">
		<c:forEach var="entry" items="${map}">
			<p>${ entry.value }</p>
		</c:forEach>
		<c:remove var="map" scope="session" />
	</c:if>
	<form action="signupprogress.jsp" method="post">
		<label>아이디<input type="text" name="id"></label> <label>비밀번호<input
			type="password" name="password"></label> <label>비밀번호 확인<input
			type="password" name="pwConfirm"></label> <input type="submit"
			value="회원가입">
	</form>
</body>
</html>