<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 목록</title>
</head>
<body>
	<c:if test="${ not empty fileNames }">
		<c:forEach var="name" items="${ fileNames }">
			<c:url var="url" value="/file/download">
				<c:param name="fileName" value="${ name }"></c:param>
			</c:url>
			<div>
				<a href="${ url }">${ name }</a>
			</div>
		</c:forEach>
	</c:if>
</body>
</html>