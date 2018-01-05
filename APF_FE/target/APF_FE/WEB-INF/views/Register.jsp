<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Registration page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

</head>
<body>
<%@ include file="Header.jsp" %>
 <div class="container">
 <h2>Registration form</h2>
 <div class="col-lg-12">
 <div class="row">
 <form:form modelAttribute="user" action="${pageContext.request.contextPath }/saveRegister" method="post">
 
  
 <div class="form-group">
 <label>Email:</label><br>
 <input  type="email" name="email" class="form-control" placeholder="enter email"/>
 </div>
 
 <div class="form-group">
 <label>Password:</label><br>
 <input type="password" name="password" class="form-control" placeholder="enter password"/>
 </div>
 
 <div class="form-group">
 <label>First Name:</label><br>
 <input type="text" name="fname" class="form-control" placeholder="enter first name"/>
 </div>
 
 <div class="form-group">
 <label>Last Name:</label><br>
 <input  type="text" name="lname" class="form-control" placeholder="enter last name"/>
 </div>
 

 
 <div class="form-group">
 <label>Address:</label><br>
 <input  type="text" name="address" class="form-control" placeholder="enter address"/>
 </div>
 
 <div class="form-group">
 <label>Mobile Number:</label><br>
 <input type="text" name="number" class="form-control" placeholder="enter number"/>
 </div>
 
 <br><br>
 
 <button type="submit" class="btn btn-lg btn-info">Register</button>
 <button type="reset" class="btn btn-lg btn-danger">Cancel</button>
 
 </form:form>
 </div>
 </div>
 </div>
  
  
  
  
</body>
<%@ include file="Footer.jsp" %>  
</html>