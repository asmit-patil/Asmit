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
<h2>Product List</h2>
<table class="table table-hover" id="apl" class="display" border="2" width="80" align="center">
<tr><th>PID</th>
<th>Product Name</th>
<th>Product Supplier</th>
<th>Product Category</th>
<th>Description</th>
<th>Price</th>
<th>Stock</th>
<th>Image</th>
<th>Action</th>
</tr>

<c:if test="${empty prodList }">
<tr>
<td colspan="10" align="center">No Record Exists!!</td>
</tr>
</c:if>
<c:forEach varStatus="st" var="p"  items="${prodList}">
<tr>
<td><c:out value="${p.pid }"></c:out></td>
<td><c:out value="${p.pname }"></c:out></td>
<td><c:out value="${p.supplier.sname }"></c:out></td>
<td><c:out value="${p.category.cname}"></c:out></td>
<td class="span3"><c:out value="${p.description }"></c:out></td>
<td><c:out value="${p.price }"></c:out></td>
<td><c:out value="${p.stock }"></c:out></td>
<td><img src="${pageContext.request.contextPath }/resources/images/${p.imgName}" height="50px" width="50px"></td>
<td class="span2">
<c:set var="contextRoot" value="${pageContext.request.contextPath }"></c:set>
<a class="btn btn-info" role="button" href="<c:url value="/prodDetails/${ p.pid}"/>">Details</a>
<td>

</tr>
</c:forEach>
</table>
</div>
<%@include file="/WEB-INF/views/Footer.jsp" %>
</body>
</html>