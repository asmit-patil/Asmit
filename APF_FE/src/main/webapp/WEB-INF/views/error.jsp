 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>AP Books</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  

</head>
<body>
<%@include file="/WEB-INF/views/Header.jsp" %>
<div class="container"><br>
<h1>Authentication Error!!!</h1>
<h3>Go back to Home or <a href="${pageContext.request.contextPath }/goToLogin">Login</a> page.</h3>
<br><br>
<img src="<c:url value="/resources/images/error.jpg" />" alt="error" height="35%" width="70%">


</div>