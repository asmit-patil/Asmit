<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
			
		
			<ul class="nav navbar-nav navbar">
			
			 <li><a href="<c:url value="/" /> ">Home</a></li>
             <li><a href="<c:url value="admin/adding" />"> Admin</a></li>
			 <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" 
                        href="#" id="navbarDropdown" aria-haspopup="true">Admin List<span class="caret"></span></a>
                        
                        	<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        	<li><a href="${pageContext.request.contextPath }/admin/productList">Product</a></li>
                      	 	<li><a href="${pageContext.request.contextPath }/admin/supplierList">Supplier</a></li>
                        	<li><a href="${pageContext.request.contextPath }/admin/categoryList">Category</a></li>
                       	</ul>
                        </li>	
                        
                         <li class="dropdown">
                         <a href="" class="dropdown-toggle" data-toggle="dropdown" id="navbarDropdown" aria-haspopup="true">
                     		Select by Category<b class="caret"></b></a>
							<ul  class="dropdown-menu" aria-labelledby="navbarDropdown">
								<c:forEach var="catVal" items="${catList }">
									<li><a href="${pageContext.request.contextPath }/productCustList?cid=${catVal.cid}">${catVal.cname}</a></li>
								</c:forEach>
							</ul>
						</li>



                        </ul>

			
			<ul class="nav navbar-nav navbar pull-right">
				<c:if test="${pageContext.request.userPrincipal.name==null }">
   					<li><a href="<c:url value="goToRegister" />">Signup</a></li>  
  					<li><a href="${pageContext.request.contextPath }/goToLogin">Login</a></li> 
  				</c:if>
  				
  				<c:if test="${pageContext.request.userPrincipal.name != null }">
  					<li><a>Welcome ${pageContext.request.userPrincipal.name }</a></li>
  					<li><a href="${pageContext.request.contextPath }/logout">Logout</a></li>
  				</c:if>
    				
    				
    			</ul>
			</div>
		</div>
	</nav>

<!--  
 <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      <li><a href="#">Page 2</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav> -->
 