<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Login</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">
        .error {
            color: red;
        }
    </style>
</head>
<body>
<div class="container">
    <h2 align="center" class="text-primary">Register</h2>
    <hr />
    <div> </div>

    <form:form action="/springmvc/employee/register" method="POST" modelAttribute="emp">
        <div class="form-group">
            <label>Id:</label><form:input path="id" size="30" cssClass="form-control" placeholder="Enter name" />
            <small><form:errors path="id" cssClass="errormsg" color="blue"/></small>
        </div>
        <div class="form-group">
            <label>Name:</label><form:input path="name" size="30" cssClass="form-control" placeholder="Enter name" />
            <small><form:errors path="name" cssClass="errormsg" /></small>
        </div>
        <div class="form-group">
            <label>Age:</label><form:input path="age" cssClass="form-control" placeholder="Enter age" />
            <small><form:errors path="age" cssClass="errormsg" /></small>
        </div>
        <div class="form-group">
            <label>Salary:</label><form:input path="salary" cssClass="form-control" placeholder="Enter Salary" />
            <small><form:errors path="salary" cssClass="errormsg" /></small>
        </div>
        <div class="form-group">
            <button type="submit" >Submit</button>
        </div>
    </form:form>
</div>
</body>
</html>