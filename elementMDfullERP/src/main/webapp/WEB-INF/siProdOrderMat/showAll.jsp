<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
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
	<h2>All Single Production Orders</h2>
	<table class="table table-striped text-center">
	
	<thead>
		<tr>
		<th scope="col">id</th>
		<th scope="col">Material</th>
		<th scope="col">Production Order</th>
		<th scope="col">materialAmount</th>
		</tr>
	
	</thead>
	<tbody>
		<c:forEach items="${allSingleProductionOrderMaterials }" var="singleproductionordermaterial">
			<tr>
			<td>${singleproductionordermaterial.id }</td>
				<td>${singleproductionordermaterial.material.name }</td>
				<td>${singleproductionordermaterial.productionorder.name }</td>
				<td>${singleproductionordermaterial.materialAmount }</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	</div>

</body>
</html>