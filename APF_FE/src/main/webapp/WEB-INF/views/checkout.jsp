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
<div class="col-xs-6 jumbtron">

<div class="head">
<label>Customer Shipping Details</label>

</div>

<div class="outer">
<div class="well" style="width:100%">
<form action="${pageContext.request.contextPath }/orderprocess" method="post">
<c:set var="gtot" value="0"></c:set>
<c:forEach var="c" items="${cart }">
<c:set var="gtot" value="${gtot+c.price*c.qty }"></c:set>
</c:forEach>
<div class="well">
<table>
<tr><td colspan="3">NAME</td><td>${users.fname }</td></tr>
<tr><td colspan="3">EMAIL</td><td>${users.email }</td></tr>
<tr><td colspan="3">ADDRESS</td><td>${users.address }</td></tr>
<tr><td colspan="3">PHONE</td><td>${users.number }</td></tr>
</table>

<div class="outer">
<h3>Enter Payment Details</h3>
<br>
<label>Select Payment</label>
<select name="payment">
<option value="COD">Cash On Delivery</option>
<option value="NET">Net Banking</option>
</select><br><br>
<div>

Name:<input type="text" name="name on card">
Card Number:<input type="number" name="card number">
<input type="hidden" name="total" value="${gtot }">
</div>
</div>
<input type="submit" value="Proceed" style="width:75%" class="btn btn-danger">
</div>
</form>

</div>

</div>
</div>
</div>

</body>
</html>