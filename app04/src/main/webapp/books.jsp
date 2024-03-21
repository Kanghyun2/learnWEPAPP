<%@page import="app04.Book"%>
<%@page import="java.util.List"%>
<%@page import="app04.BookRepo"%>
<%@ page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서버가 보관한 책목록</title>
</head>
<body>
	<%
	BookRepo repo = new BookRepo();
	List<Book> bookList = repo.getBookList();
	%>
	<ul>
		<%
			for (Book b : bookList) {
		%>
			<li><%= b.getTitle() %>, <%= b.getPrice() %></li>
		<%
			}
		%>
	</ul>
</body>
</html>




