<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>AP Books</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
</head>
<body>

	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
<div class="container">
<c:url value="/admin/supplierUpdate" var="pru"></c:url>
<form method="POST" action="<c:url value="/admin/supplierUpdate"/>" >
<span id="reauth-email" class="reauth-email"></span>
<h4 class="input-title">Supplier Id</h4>
<input  value="${sat.sid }" type="number" name="sid" readonly>

<h4 class="input-title">Supplier Name</h4>
<input  value="${sat.supplierName}" type="text" name="supplierName" required><br>
<br>
<button class="btn btn-lg btn-primary" type="submit">Save</button>
<button class="btn btn-lg btn-warning" type="reset">Cancel</button>

</form>
</div>
</body>
</html>