<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
	<td>Emp id</td>
	<td>Emp Name</td>
	<td>Emp Age</td>
	<td>Emp salary</td>	
</tr>
<tr>
<td>${e.id}</td>
<td>${e.name}</td>
<td>${e.age}</td>
<td>${e.salary}</td>
</tr>
</table>
<form:form action="springmvc/employee/deletebyid/{id}" method="post">
<button type="submit">delete</button>
</form:form>
</body>
</html>