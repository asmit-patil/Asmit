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
<script
src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@ include file="Header.jsp" %>

  
       <form:form method="post" modelAttribute="user"  action="saveRegister">    
        <table > 
        <tr>    
          <td>Id : </td>   
          <td><form:input path="id"  /></td>  
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
       </form:form>
        <%@ include file="Footer.jsp" %>    
</body>

</html>