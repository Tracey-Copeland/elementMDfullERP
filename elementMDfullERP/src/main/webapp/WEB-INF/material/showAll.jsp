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
	<h2>All Materials</h2>
	<table class="table table-striped text-center">
	
	<thead>
		<tr>
		<th scope="col">Material ID</th>
		<th scope="col">Material Name</th>
		<th scope="col">Description</th>
		<th scope="col">Actions</th>
		</tr>
	
	</thead>
	<tbody>
		<c:forEach items="${allMaterials }" var="material">
			<tr>
				<td>${material.id }</td>
				<td><a href="/materials/${material.id }">${material.name }</a></td>
				<td>${material.description }</td>
				<td>
				<a href="/materials/edit/${material.id }">Edit</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	</div>


</body>
</html>