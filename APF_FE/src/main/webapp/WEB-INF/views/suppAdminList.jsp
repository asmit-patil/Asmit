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
<h2>Supplier List for Admin</h2>
<table class="table table-hover" id="asl" class="display" border="2" width="80" align="center">
<tr><th>Sr. No</th>
<th>SID</th>
<th>Supplier Name</th>
<th class="span2">Action</th>
</tr>

<c:if test="${empty satList }">
<tr>
<td colspan="10" align="center">No Record Exists!!</td>
</tr>
</c:if>
<c:forEach varStatus="st" var="p"  items="${satList}">
<tr>
<td><c:out value="${st.count }"></c:out></td>
<td><c:out value="${p.sid }"></c:out></td>
<td><c:out value="${p.sname }"></c:out></td>
<td><c:set var="contextRoot" value="${pageContext.request.contextPath }"></c:set>
<a class="btn btn-info" role="button" href="#">Edit</a>
<a class="btn btn-danger" role="button" href="#">Delete</a></td>
</tr>
</c:forEach>
</table>
</div>
<%@include file="/WEB-INF/views/Footer.jsp" %>
</body>
</html>