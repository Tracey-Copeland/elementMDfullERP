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
	<h2>All Sales Orders</h2>
	<table class="table table-striped text-center">
	
	<thead>
		<tr>
		<th scope="col">Id</th>
		<th scope="col">Customer</th>
		<th scope="col">Product</th>
		<th scope="col">Quantity</th>
		<th scope="col">Price Per Unit</th>
		<th scope="col">Total Price for Unit</th>
		<th scope="col">Date Created</th>
		</tr>
	
	</thead>
	<tbody>
		<c:forEach items="${allSalesOrders }" var="salesorder">
			<tr>
				<td><a href="/salesorders/${salesorder.id }">${salesorder.id }</a></td>
				<td>${salesorder.customer.name }</td>
				<td>${salesorder.product.name }</td>
				<td>${salesorder.quantity }</td>
				<td>${salesorder.pricePerUnit }</td>
				<td>${salesorder.unitTotalPrice }</td>
				<td>${salesorder.createdAt }</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	</div>


</body>
</html>