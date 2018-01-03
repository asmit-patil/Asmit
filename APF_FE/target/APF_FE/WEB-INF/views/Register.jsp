<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="url" %>
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

  
       <form:form method="post" modelAttribute="user"  action="saveRegister"> 
        <table align="center">
                    
                    
                    <tr>
                        <td>
                            <form:label path="username">Username(E-Mail)</form:label>
                        </td>
                        <td>
                            <form:input path="username" name="email" id="username" />
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
                            <form:label path="firstname">FirstName</form:label>
                        </td>
                        <td>
                            <form:input path="firstname" name="fname" id="firstname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="lastname">LastName</form:label>
                        </td>
                        <td>
                            <form:input path="lastname" name="lname" id="lastname" />
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
                            <form:input path="phone" name="number" id="phone" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <form:button id="register" name="register">Register</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                  
                </table>
            </form:form>   
        <%-- <table > 
        <tr>    
          <td>Id : </td>   
          <td><form:input path="id_no"  class="form-control" /></td>  
         </tr>     
         <tr>    
          <td>E-mail : </td>   
          <td><form:input path="username"  /></td>  
         </tr>    
         <tr>    
          <td>Password : </td>   
          <td><form:password path="password"  /></td>  
         </tr>  
         <tr>    
          <td>First Name : </td>   
          <td><form:input path="firstname"  /></td>  
         </tr> 
         <tr>    
          <td>Last Name : </td>   
          <td><form:input path="lastname"  /></td>  
         </tr>
         <tr>    
          <td>Address : </td>   
          <td><form:input path="address"  /></td>  
         </tr>  
         <tr>    
          <td>Contact Number : </td>   
          <td><form:input path="contactnumber"  /></td>  
         </tr>         
         <tr>    
          <td><input type="submit" value="Save" /></td>
            <td><input type="reset" value="Cancel" /></td>    
         </tr> 
       
        </table>    
       </form:form> --%>
        <%@ include file="Footer.jsp" %>    
</body>

</html>