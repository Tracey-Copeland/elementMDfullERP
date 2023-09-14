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
	<h2>All Purchase Orders</h2>
	<table class="table table-striped text-center">
	
	<thead>
		<tr>
		<th scope="col">Id</th>
		<th scope="col">Supplier</th>
		<th scope="col">Material</th>
		<th scope="col">Quantity</th>
		<th scope="col">Price Per Unit</th>
		<th scope="col">Total Price for Unit</th>
		<th scope="col">Current Progress</th>
		<th scope="col">Date Created</th>
		</tr>
	
	</thead>
	<tbody>
		<c:forEach items="${allPurchaseOrders }" var="purchaseorder">
			<tr>
				<td><a href="/purchaseorders/${purchaseorder.id }">${purchaseorder.id }</a></td>
				<td>${purchaseorder.supplier.name }</td>
				<td>${purchaseorder.material.name }</td>
				<td>${purchaseorder.quantity }</td>
				<td>${purchaseorder.pricePerUnit }</td>
				<td>${purchaseorder.unitTotalPrice }</td>
				<td>${purchaseorder.currProgressNum}</td>
				<td>${purchaseorder.createdAt }</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	</div>


</body>
</html>