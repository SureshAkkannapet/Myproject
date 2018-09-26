<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<!-- 
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Practice Boot**</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="welcome.jsp">Home</a></li>
					<li><a href="/register">Register</a></li>
					<li><a href="/view">Show All</a></li>
					<li><a href="/dtview">datatable</a></li>
					<li><a href="/logout">Exit</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">

		<div class="starter-template">
			<table border="2" width="70%" cellpadding="2">  
<tr bgcolor="cyan"><th>Name</th><th>Email</th><th>birthdate</th><th>Designation</th></tr>  
   <c:forEach var="user" items="${list}">   
   <tr>  
   <td>${user.username}</td>  
   <td>${user.email}</td>  
   <td>${user.birthDate}</td>  
   <td>${user.profession}</td>  
   </tr>  
   </c:forEach>  
   </table>  
		</div>

	</div>
	<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
