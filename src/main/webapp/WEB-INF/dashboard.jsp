<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Lookify</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <main class="container justify-content-center mt-5">
   		<div class="row">
   			<a class="col-2">Add new</a>
   			<a class="col-2">Add new</a>
   			<form class="col-6">
   				<input>
   				<button class="btn btn-primary">Search Artist</button>
   			</form>
   		</div>
   		<table class="table table-striped mt-5">
	   		<thead>
		   		<tr>
		   			<th>Name</th>
		   			<th>Rating</th>
		   			<th>Action</th>
		   		</tr>
		   	</thead>
		   	<tbody>
		   		<c:forEach items="${list}" var="item">
		        <tr>
		            <td><c:out value="${item.title}"/></td>
		            <td><c:out value="${book.rating}"/></td>
		            <td>sadlasdj</td>
		        </tr>
		        </c:forEach>
		   	</tbody>
	   	</table>
   </main>
</body>
</html>