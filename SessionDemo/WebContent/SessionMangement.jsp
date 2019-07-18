<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.Date" %>
<h3>session Time</h3>
<h3>Session id : <%= session.getId() %></h3>
<h3>time started : <%= new Date(session.getCreationTime()) %></h3>
<h3>time current : <%= new Date() %></h3>
<h3>last access : <%= new Date(session.getLastAccessedTime()) %></h3>

<% session.setMaxInactiveInterval(10); %>
</body>
</html>