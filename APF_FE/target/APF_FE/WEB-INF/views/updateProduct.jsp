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
<div class="container">
<c:url value="/productUpdate" var="pru"></c:url>
<form method="POST" action="<c:url value="/productUpdate"/>" enctype="multipart/form-data">
<span id="reauth-email" class="reauth-email"></span>

<input type="hidden" name="pid" value="${prod.pid }">
<h4 class="input-title">Product Name</h4>
<input value="${prod.pname }" type="text" name="pName" required>

<h4 class="input-title">Product Description</h4>
<input value="${prod.description }" type="text" name="pDescription" required>

<h4 class="input-title">Product Price</h4>
<input value="${prod.price }" type="text" name="pPrice" required>

<h4 class="input-title">Product Stock</h4>
<input value="${prod.stock }" type="text" name="pStock" required>

<div class="form-group">
<table>
<tr>
<td>Select Supplier</td>
<td>
<select class="form-control" name="pSupplier" required>
<option value="">----Select----</option>
<c:forEach items="${satList}" var="sat">
<option value="${sat.sid }">${sat.sname}</option>
</c:forEach>
</select></td></tr>
</table>
</div>

<div class="form-group">
<table>
<tr>
<td>Select Category</td>
<td>
<select class="form-control" name="pCategory" required>
<option value="">----Select----</option>
<c:forEach items="${catList}" var="cat">
<option value="${cat.cid }">${cat.cname}</option>
</c:forEach>
</select></td></tr>
</table>
</div>
<div class="fileinput fileinput-new" data-provides="fileinput">
<td>Product Image</td>
<td><input class="form-coontrol" type="file" name="file" accept="image/*"></td>
</div>
<button class="btn btn-lg btn-primary" type="submit">Save</button>
<button class="btn btn-lg btn-warning" type="reset">Cancel</button>
</form>
</div>
<%@include file="/WEB-INF/views/Footer.jsp" %>
</body>
</html>