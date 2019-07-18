<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>java bean demo</h3>
<jsp:useBean id="p1" class="com.person"></jsp:useBean> <!-- object p1 -->
<jsp:setProperty property="name" name="p1" value="jadeja"/><!-- p1.setname("jadeja") -->
<jsp:setProperty property="age" name="p1" value="15"/>
name <jsp:getProperty property="name" name="p1"/>
age <jsp:getProperty property="age" name="p1"/>
<hr>
<%
com.person a = new com.person();
a.setName("sachin");
a.setAge(9);
out.println("name : "+a.getName());
out.println("age: "+a.getAge());
%>
</body>
</html>