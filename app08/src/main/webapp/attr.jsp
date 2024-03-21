<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>속성 값 활용</title>
</head>
<body>
	<%
		request.setAttribute("myAttr", "값");
	
		String attr = (String) request.getAttribute("myAttr");
	%>
	
	<p><%= attr %></p>
	<c:set var="testName" value="testValue" scope="request"></c:set>
	<p>${ testName }</p>
</body>
</html>