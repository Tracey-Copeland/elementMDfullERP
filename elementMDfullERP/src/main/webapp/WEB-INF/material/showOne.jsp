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

	<div class="border container text-center">
		<div class=" row justify-content-center">
			<h2>Name: <c:out value="${material.name}"/></h2>
			<h2>Id: <c:out value="${material.id }"/></h2>
			<h2>Description: <c:out value="${material.description}"/></h2>
			<h2>Amount In Stock: <c:out value="${material.amountInStock}"/></h2>
			
		</div>
	</div>
	<div>
	<h3>Single Production Orders</h3>
	<table class="table table-striped text-center">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Material Amount</th>
					<th scope="col">Production Order ID</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${material.singleproductionordermaterials}" var="spom">
						<tr>
							<td>${spom.id }</td>
							<td>${spom.materialAmount }</td>
							<td>${spom.productionorder.id }</td>
						</tr>
				
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<div>
	<h3>Products Used In</h3>
	<table class="table table-striped text-center">
			<thead>
				<tr>
					<th scope="col">Product Name</th>
					<th scope="col">Material Amount Needed</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${material.productmaterials}" var="pm">
						<tr>
							<td>${pm.product.name }</td>
							<td>${pm.amtNeeded }</td>
						</tr>
				</c:forEach>
				
			
			
			</tbody>
		</table>
	</div>
	
	<div>
	<h3>Purchase Orders</h3>
	<table class="table table-striped text-center">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Supplier</th>
					<th scope="col">quantity</th>
					<th scope="col">PPU</th>
					<th scope="col">total price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${material.purchaseOrders}" var="purchaseorder">
						<tr>
							<td>${purchaseorder.id }</td>
							<td>${purchaseorder.supplier.name }</td>
							<td>${purchaseorder.quantity }</td>
							<td>${purchaseorder.pricePerUnit }</td>
							<td>${purchaseorder.unitTotalPrice }</td>
						</tr>
				
				</c:forEach>
				
			
			
			</tbody>
		</table>
	</div>
	
	
		
		

</body>
</html>