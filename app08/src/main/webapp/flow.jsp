<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조건 분기</title>
</head>
<body>
	<c:if test="true">
		<p>조건 분기</p>
	</c:if>

	<c:set var="v" value="1"></c:set>
	<c:choose>
		<c:when test="${ v == 1 }">
			<p>1입니다.</p>
		</c:when>
		<c:when test="${ v == 2 }">
			<p>2입니다.</p>
		</c:when>
		<c:otherwise>
			<p>1, 2가 아닙니다.</p>
		</c:otherwise>
	</c:choose>
</body>
</html>