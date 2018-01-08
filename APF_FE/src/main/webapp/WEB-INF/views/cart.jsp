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
<div class="container">

<table class="table table-hover" id="cart" class="display" border="2" width="80" align="center">
<tr>
<th>Product Name</th>
<th>Product Quantity</th>
<th>Product Price</th>
<th>Product Image</th>
<th>Sub Total</th>
<th>Action</th>
</tr>

<c:if test="${empty prodList }">
<tr>
<td colspan="10" align="center">No Record Exists!!</td>
</tr>
</c:if>
<c:forEach varStatus="st" var="p"  items="${cartInfo}">
<tr>
<td><c:out value="${p.pname }"></c:out></td>
<td><c:out value="${p.qty }"></c:out></td>
<td><c:out value="${p.price }"></c:out></td>
<td><img src="${pageContext.request.contextPath }/resources/${p.imgname}" height="50px" width="50px"></td>
<td><c:out value="${p.qty * p.price }"></c:out></td>
<td class="span2">
<c:set var="contextRoot" value="${pageContext.request.contextPath }"></c:set>
<a class="btn btn-danger" role="button" href="<c:url value="/deletePCart/${ p.cartId}"/>">Delete</a>
<td>

</tr>
</c:forEach>
<td>
<c:set var="gtot" value="${gtot+p.price*p.qty }"></c:set>
<span class="col-lg-9" align="right"><label>Grand Total</label><c:out value="${gtot }"></c:out></span></td>


<tfoot>
<td><a class="btn btn-warning btn-lg" href="${pageContext.request.contextPath }/index">Continue Shopping</a></td>
<td><a class="btn btn-success btn-lg" href="${pageContext.request.contextPath }/checkout">Checkout</a></td>
</table>
</div>


<%@include file="/WEB-INF/views/Footer.jsp" %>
</body>
</html>