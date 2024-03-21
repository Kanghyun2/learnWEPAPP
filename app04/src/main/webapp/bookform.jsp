<%@page import="app04.Book"%>
<%@page import="java.util.List"%>
<%@page import="app04.BookRepo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 선택</title>
</head>
<body>
	<form action="bookprogress.jsp" method="post">
		<%
		BookRepo repo = new BookRepo();
		List<Book> list = repo.getBookList();
		for (Book b : list) {
		%>
		<label><input type="radio" name="title"
			value="<%=b.getTitle()%>"><%=b.getTitle()%></label> <input
			type="hidden" name="price" value="<%=b.getPrice()%>">
		<!-- 가격을 폼으로 전달 -->
		<%
		}
		%>
		<input type="submit" />

	</form>
</body>
</html>