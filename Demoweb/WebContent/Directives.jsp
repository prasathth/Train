<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page import="java.util.Date" %>
<%@page isErrorPage="true" %>
<%@page info="just demo here" %>
<%@page session="true" %>
<body>
<h3>Directive Demo</h3>
<hr>
Today's date : <%= new Date() %><br>
Exception : <%= exception %><br>
information : <%= getServletInfo() %><br>
Session : <%= session.getId() %>
<hr>
<%@include file = "login.html" %>
<%@include file = "Abc.jsp" %>
 
</body>
</html>