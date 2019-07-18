<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>jsp scripting</h4>
<%! 
	int a = 3;
	int x=0;
%>

<%
	int b = 10;
%>

Value of a is <%= a %><br>
value of b is <%= b %><br><br>
Add <%= a+b %>
<%= ++x %>
</body>
</html>