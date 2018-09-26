<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

 <!-- <link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.18/css/jquery.dataTables.min.css" />-->
	<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/buttons/1.5.2/css/buttons.dataTables.min.css" />
	
	<link rel="stylesheet" type="text/css"
	href="../css/dataTables.min.css" />
	
	
<!-- 
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />




<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.5.2/js/dataTables.buttons.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.html5.min.js"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"> </script>
  

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
					<li><a href="/logout">Exit</a></li>
				</ul>
			</div>
		</div>
	</nav>
    <div align="center">
        
           <table id="example" class="display" style="width:100%">
        <thead>
            <tr>
                <th>Name</th>
                <th>email</th>
                <th>DOB</th>
                <th>Designation</th>
                <th>EDIT/DELETE</th>
                
            </tr>
        </thead>
        <tbody>
           
             <c:forEach var="user" items="${list}">   
   <tr>  
   <td>${user.username}</td>  
   <td>${user.email}</td>  
   <td>${user.birthDate}</td>  
   <td>${user.profession}</td>  
  <td><a href="<c:url value='/edit/${user.username}' />" >Edit</a>
			<a class="alertbox" href="<c:url value='/remove/${user.username}' />" >Delete</a></td>
   </tr>  
   </c:forEach>  
   
        
       

</tbody>
</table>

    </div>
    <script>
    $(document).ready(function() {
        $('#example').DataTable( {
            dom: 'Bfrtip',
            buttons: [
                'copyHtml5',
                'excelHtml5',
                'csvHtml5',
                'pdfHtml5'
            ]
        } );
    } );
 
    $(window).load(function(){
    	  $('.alertbox').click(function(){
    	    alert('Are you sure want to delete !!');
    	    });
    	  })
    </script>
</body>
</html>