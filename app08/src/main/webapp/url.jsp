<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동적 url 구성</title>
</head>
<body>
	<%
	String url = "url.jsp?";
	String paramName = "name";
	String paramValue = "길동";
	url = url + paramName + "=" + URLEncoder.encode(paramValue, "UTF-8");
	%>
	<a href=<%=url%>>링크</a>
	<c:url var="linkurl" value="url.jsp">
	<c:param name="name" value="길동"></c:param>
	</c:url>
	<a href="${ linkurl }">링크2</a>
</body>
</html>