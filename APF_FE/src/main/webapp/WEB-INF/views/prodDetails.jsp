<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="/WEB-INF/views/Header.jsp" %>


<div class="container">

<div class="row">
<div class="col-md-4 item-photo">

<img style="max-width:100%; margin-top:30px;" src="${pageContext.request.contextPath }/resources/images/${prod.imgName}"/>
</div>

<div class="col-md-5" style="border:opx solid  gray">
<h3>${prod.pname }</h3>
<h4>${prod.description }</h4>
<h4>${prod.price }</h4>
<h5>${prod.sname }</h5>
<div class="section" style="padding-bottom:20px;">
<form action="${pageContext.request.contextPath }/addToCart" method="post">
<input type="hidden" value="${prod.pid }" name="pid"/> 
<input type="hidden" value="${prod.price }" name="pPrice"/> 
<input type="hidden" value="${prod.pname}" name="pName"/> 
<input type="hidden" value="${prod.imgName }" name="imgName"/> 
<label>Qty:</label>
<input type="number" class="form-control" name="pQty" required/><br><br>
<input class="btn btn-warning btn-lg" type="submit" value="Add To Cart">
<h6><span class="glyphicon-heart-empty" style="cursor:pointer; color:red;"></span>Wish List</h6> 
</form>

</div>
</div>

<hr>
<div class="col-sm-9">
<h3>Product Details</h3>
<ul class="menu-item">
<li> </li>
<li> </li>
<li> </li>

</ul>


</div>
<br>
<hr>
<h6> We are Authorized company by Indian Government</h6>
</div>
</div>
<%@include file="/WEB-INF/views/Footer.jsp" %>
</body>
</html>