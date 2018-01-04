<html>
<head>
<title>Registration page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>
<body>
<%@ include file="Header.jsp" %>

  
 <%--      <form:form method="post"   action="${pageContext.request.contextPath }/saveRegister" align="center"> 
      
        

 
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
                    
		</form:form> --%>
		
		<%-- <div class="container">

<div class="row">
    <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
		<form  method="post" ModelAttribute="user"  action="${pageContext.request.contextPath }/saveRegister" >
			 
                <table align="center">
                     <tr>
                        <td>
                            <form:label path="email">Email</form:label>
                        </td>
                        <td>
                            <form:input path="email" name="email" id="email" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="fname">FirstName</form:label>
                        </td>
                        <td>
                            <form:input path="fname" name="fname" id="fname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="lname">LastName</form:label>
                        </td>
                        <td>
                            <form:input path="lname" name="lname" id="lname" />
                        </td>
                    </tr>
                   
                    <tr>
                        <td>
                            <form:label path="address">Address</form:label>
                        </td>
                        <td>
                            <form:input path="address" name="address" id="address" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="phone">Phone</form:label>
                        </td>
                        <td>
                            <form:input path="phone" name="phone" id="phone" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <form:button id="register" name="register">Register</form:button>
                        </td>
                    </tr>
		</form>
	</div>
</div>
</div> --%>
 <div class="container">
 <h2>Registration form</h2>
 <div class="col-lg-12">
 <div class="row">
 <form:form modelAttribute="user" action="${pageContext.request.contextPath }/saveRegister" method="post">
 <div class="form-group">
 <label>Email:</label><br>
 <form:input path="email" class="form-control" placeholder="enter email"></form:input>
 </div>
 
 <div class="form-group">
 <label>Password:</label><br>
 <form:input path="password" class="form-control" placeholder="enter password"/>
 </div>
 
 <div class="form-group">
 <label>First Name:</label><br>
 <form:input path="fname" class="form-control" placeholder="enter first name"/>
 </div>
 
 <div class="form-group">
 <label>Last Name:</label><br>
 <form:input path="lname" class="form-control" placeholder="enter last name"/>
 </div>
 
 <div class="form-group">
 <label>Address:</label><br>
 <form:input path="address" class="form-control" placeholder="enter address"/>
 </div>
 
 <div class="form-group">
 <label>Mobile Number:</label><br>
 <form:input path="number" class="form-control" placeholder="enter number"/>
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