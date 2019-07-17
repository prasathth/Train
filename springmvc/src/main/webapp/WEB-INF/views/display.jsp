<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<table>
<tr>
	<td>Emp id</td>
	<td>Emp Name</td>
	<td>Emp Age</td>
	<td>Emp salary</td>	
</tr>
<c:forEach items="${empAll}" var="a">
<tr>
<td>${a.id}</td>
<td>${a.name}</td>
<td>${a.age}</td>
<td>${a.salary}</td>
</tr>
</c:forEach>
</table>
</body>
</html>