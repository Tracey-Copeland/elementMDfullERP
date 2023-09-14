<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<div>
	<h1 class="row justify-content-center py-2">Name: <c:out value="${product.name}"/></h1>
	</div>
	<div class="border container text-center">
		<div class=" row justify-content-center">
		<div class="d-flex flex-row p-2 justify-content-evenly">
			<h4>Id: <c:out value="${product.id }"/></h4>
			<h4>Amount In Stock: <c:out value="${product.amountInStock}"/></h4>
			</div>
			<h4><a href="/products/edit/${product.id }">Edit</a></h4>
		</div>
	</div>
	
	<div>
	<h3>Required Materials</h3>
	<table class="table table-striped text-center">
			<thead>
				<tr>
					<th scope="col">Product ID</th>
					<th scope="col">Product Name</th>
					<th scope="col">Product Amount</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${product.productmaterials}" var="pm">
						<tr>
							<td>${pm.material.id }</td>
							<td>${pm.material.name }</td>
							<td>${pm.amtNeeded }</td>
							
						</tr>
				
				</c:forEach>
				
			
			
			</tbody>
		</table>
	</div>
	
	<div>
	<h3>
	<a class="btn btn-success" data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
		Sales Orders</a>
		</h3>
	<table class="table table-striped text-center collapse" id="collapseExample">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Customer Name</th>
					<th scope="col">Product Amount</th>
					<th scope="col">PPU</th>
					<th scope="col">Total price</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${product.salesOrders}" var="so">
						<tr>
							<td>${so.id }</td>
							<td>${so.customer.name }</td>
							<td>${so.quantity }</td>
							<td>${so.pricePerUnit }</td>
							<td>${so.unitTotalPrice }</td>
						</tr>
				
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>