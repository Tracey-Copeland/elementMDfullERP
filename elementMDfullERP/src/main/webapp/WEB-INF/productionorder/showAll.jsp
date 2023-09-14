<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="border container">
	<h2>All Saved Production Orders</h2>
	<table class="table table-striped text-center">
	
	<thead>
		<tr>
		<th scope="col">ID</th>
		<th scope="col">Name</th>
		</tr>
	
	</thead>
	<tbody>
		<c:forEach items="${allProductionOrder }" var="productionorder">
			<tr>
				<td>${productionorder.id }</td>
				<td>${productionorder.name }</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	</div>


</body>
</html>