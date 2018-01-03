<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
<%@ include file="Header.jsp" %>

  
       <form:form method="post"   action="${pageContext.request.contextPath }/saveRegister" align="center"> 
      
        


<!-- Form Name -->
<legend>Registration</legend>



<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="Email">Email</label>
  <div class="controls">
    <input id="email" name="email" type="text" placeholder="abc@gmail.com" class="input-large" required="">
    
  </div>
</div>

<!-- Password input-->
<div class="control-group">
  <label class="control-label" for="Password">Password</label>
  <div class="controls">
    <input id="password" name="password" type="password" placeholder="**********" class="input-large" required="">
    
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="Name">First Name</label>
  <div class="controls">
    <input id="fname" name="fname" type="text" placeholder="First Name" class="input-large" required="">
    
  </div>
</div>
 <!-- Text input-->
<div class="control-group">
  <label class="control-label" for="Name">Last Name</label>
  <div class="controls">
    <input id="lname" name="lname" type="text" placeholder="Last Name" class="input-large" required="">
    
  </div>
</div>
<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="Name">Address</label>
  <div class="controls">
    <input id="address" name="address" type="text"  class="input-large" required="">
    
  </div>
</div>
<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="Name">Phone Number</label>
  <div class="controls">
    <input id="number" name="number" type="text" class="input-large" required="">
    
  </div>
</div>
<br>
<!-- Button (Double) -->
<div class="control-group">
  
  <div class="controls">
    <button name="register" type="submit" btn btn-success">Register</button>
    <button  name="cancel" type="reset"  btn btn-warning">Cancel</button>
  </div>
</div>
                    
		</form:form>

  
</body>
<%@ include file="Footer.jsp" %>  
</html>