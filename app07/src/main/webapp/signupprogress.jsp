<%@page import="app07.UserValidator"%>
<%@page import="java.util.Map"%>
<%@page import="app07.User"%>
<%@page import="app07.UserService"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String password = request.getParameter("password");
String pwConfirm = request.getParameter("pwConfirm");

UserValidator validator = new UserValidator();
Map<String, String> map = validator.validate(id, password, pwConfirm);
if (map.size() > 0) {
	session.setAttribute("map", map);
	response.sendRedirect("signup.jsp");
} else {
	UserService service = new UserService();
	int result = service.insertUser(new User(id, password));

	if (result == 1) {
		request.getRequestDispatcher("signupresult.jsp").forward(request, response);
	}
}
%>