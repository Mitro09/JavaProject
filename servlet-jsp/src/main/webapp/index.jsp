<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	   ${ param.name }
	   Age:
	   ${ param.age }
	   <% String age = request.getParameter("age"); %>
	   <% request.setAttribute("age", age); %>
	   ${ age * 2 }
	   <c:out value="${ age*3 }" >No age specified</c:out>
	   <c:if test="${ age > 18 }">you are old</c:if>
	   <c:choose>
	   		<c:when test="${ age>18 }">Adult</c:when>
	   		<c:when test="${ age<18 }">Kid</c:when>
	   		<c:otherwise>You can vote</c:otherwise>
	   </c:choose>
	   
	   <c:forEach var="i" begin="1" end="${ age }">
	   		${ i }
	   </c:forEach>
	   
	!</p>
</body>
</html>