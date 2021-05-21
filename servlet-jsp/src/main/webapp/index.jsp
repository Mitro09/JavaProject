<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
</head>
<body>
	<h1>HomePage</h1>
	
	<p>this is my first JSP</p>
	
	<p>Hello 
	   <%//out.print("world"); %>
	   <% String name = request.getParameter("name"); %>
	   <%= name %>
	   Age :
	   <% String age = request.getParameter("age"); %>
	   <% request.setAttribute("age", age); %>
	   ${ age }
	!</p>
</body>
</html>