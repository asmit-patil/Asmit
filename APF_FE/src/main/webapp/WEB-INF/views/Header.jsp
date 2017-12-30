<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>AP Books</title>
</head>
<body>
<nav class="navbar navbar-default">
		<div class="container-fluid">
		<button type="button" class="navbar-toggle collapsed" 
   data-toggle="collapse" data-target="#collapse-example" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
			<div class="navbar-header">
				
				<a class="navbar-brand" href="#"><img src="<c:url value="/resources/images/logo.jpg" />" alt="apf" height="35px" width="70px"></a>
				<a class="navbar-brand" href="#">AP Books</a>
			</div>
			<div class="collapse navbar-collapse" id="collapse-example">
			
		
			<ul class="nav navbar-nav">
			
			 <li><a href="<c:url value="/" /> ">Home</a></li>
             <li><a href="<c:url value="adding" />"> Admin</a></li>
			 <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" 
                        href="#">Admin List<span class="caret"></span></a>
                        
                        	<ul class="dropdown-menu">
                        	<li><a href="${pageContext.request.contextPath }/productList">Product</a></li>
                      	 	<li><a href="${pageContext.request.contextPath }/supplierList">Supplier</a></li>
                        	<li><a href="${pageContext.request.contextPath }/categoryList">Category</a></li>
                       	</ul>
                        </li>	
                        
                         <li class="dropdown">
                         <a href="" class="dropdown-toggle" data-toggle="dropdown">
                     		Select by Category<b class="caret"></b></a>
							<ul  class="dropdown-menu">
								<c:forEach var="catVal" items="${catList }">
									<li><a href="${pageContext.request.contextPath }/productCustList?cid=${catVal.cid}">${catVal.cname}</a></li>
								</c:forEach>
							</ul>
						</li>



                        </ul>

			
			<ul class="nav navbar-nav navbar pull-right">
   					<li><a href="<c:url value="goToRegister" />">Signup</a></li>  
  					<li><a href="#">Login</a></li> 
    				<li><a href="#">Logout</a></li>
    				<li><a href="#">My Cart</a></li>
    			</ul>
			</div>
		</div>
	</nav>
</body>
</html>