<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>
<body>
<%@include file="/WEB-INF/views/Header.jsp" %>
<div class="container"><br>
<h2>WELCOME TO LOGIN PAGE!!!</h2>
<form action="${pageContext.request.contextPath }/login" class="form-signin" method="post">

<h3><label>Email:</label></h3>
<input type="text" name="username" class="login-box" required>

<h3><label>Password:</label></h3>
<input type="password" name="password" class="login-box" required>
<br><br>

<button class="btn btn-lg btn-primary" type="submit">LOGIN</button>
<button class="btn btn-lg btn-warning" type="reset">CANCEL</button>
</form>
</div>