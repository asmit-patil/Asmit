<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="url" %>
    <title>AP Footwears</title>
<!-- <head> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css"
href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- Angular Js -->
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>

<!-- JQuery -->
<script src="https://code.jquery.com/jquery-2.2.1.min.js"></script>
<script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>

<link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">



<nav id="navbar-red" class="navbar navbar-default navbar-static-top " role="navigation">

	<div class="container">
	<ul class="nav navbar-nav">
	<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navDemo">
	<span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button></ul></div>

  <div class="container-fluid">
   
    <div class="navbar-header">
    <div  class="nav navbar-nav pull-left" > <url:url value="/resources/images/logo.png" var="url"></url:url>
	  <img src="${url }" height="50" width="50" ></div>
      <a class="navbar-brand" href="#">AP Footwears</a>
      <ul class="nav navbar-nav" >
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Product</a></li>
      <li><a href="#">Category</a></li>
      </ul>
    </div>
    <div class="collapse navbar-collapse" id="navDemo">
    <ul class="nav navbar-nav pull-right" >
      <li><a href="#">Register</a></li>
      <li><a href="#">Login</a></li>
      <li><a href="#">Logout</a></li>
      <li><a href="#">My Cart</a></li>
      
    </ul>
  </div>
  </div>
</nav>


