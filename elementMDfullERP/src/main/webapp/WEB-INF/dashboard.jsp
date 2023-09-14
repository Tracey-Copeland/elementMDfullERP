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
<title>Dashboard</title>
</head>
<body>

<h1 class="border-bottom my-3">Welcome ${loggedInAdmin.adminFirstName}</h1>
<div>
	<div class="row my-3">
		<div class="col">
			<h2 class="text-success">Products</h2>
			<ul class="list-group">
				<li class="list-group-item"> <a href="/products/create">Create Product</a></li>
				<li class="list-group-item"> <a href="/products/all">Show All Products</a></li>
				<li class="list-group-item"> <a href="/productmaterials/create">Create Product Material</a></li>
				<li class="list-group-item"> <a href="/productmaterials/all">Show All Product Materials</a></li>
				<li class="list-group-item"> <a href="/products/inventory">Product Inventory</a></li>
			</ul>
		</div>
	
		<div class="col">
			<h2 class="text-success">Materials</h2>
			<ul class="list-group">
				<li class="list-group-item"><a href="/materials/create">Create Material</a></li>
				<li class="list-group-item"><a href="/materials/all">Show All Materials</a></li>
				<li class="list-group-item"><a href="/materials/inventory">Material Inventory</a></li>
			</ul>
		</div>
	</div>
	
	<div class="row my-3">
		<div class="col">
			<h2 class="text-success">Customers</h2>
			<ul class="list-group">
				<li class="list-group-item"><a href="/customers/create">Create New Customer</a></li>
				<li class="list-group-item"><a href="/customers/all">All Customers</a></li>
			</ul>
		</div>
	
		<div class="col">
			<h2 class="text-success">Suppliers</h2>
			<ul class="list-group">
				<li class="list-group-item"><a href="/suppliers/create">Create Supplier</a></li>
				<li class="list-group-item"><a href="/suppliers/all">Show All Suppliers</a></li>
			</ul>
		</div>
	</div>

	<div class="row my-3">
		<div class="col">
			<h2 class="text-success">Purchase Orders</h2>
			<ul class="list-group">
				<li class="list-group-item"><a href="/purchaseorders/create">Create Purchase Order</a></li>
				<li class="list-group-item"><a href="/purchaseorders/all">Show All Purchase Orders</a></li>
			</ul>
		</div>
	
		<div class="col">
			<h2 class="text-success">Production Orders</h2>
			<ul class="list-group">
				<li class="list-group-item"><a href="/singprodordermat/create"> Create Single Production Order</a></li>
				<li class="list-group-item"><a href="/singprodordermat/all">Show All Single Production Orders</a></li>
				<li class="list-group-item"><a href="/productionorders/create">Create Overall Production Order</a></li>
				<li class="list-group-item"><a href="/productionorders/all">All Production Orders</a></li>
			</ul>
		</div>
	
		<div class="col">
			<h2 class="text-success">Sales Orders</h2>
			<ul class="list-group">
				<li class="list-group-item"><a href="/salesorders/create">Create New Sales Order</a></li>
				<li class="list-group-item"><a href="/salesorders/all">All Sales Orders</a></li>
			</ul>
		</div>
	</div>
	<div class="row my-3">
		<div class="col">
			<h2 class="text-success">Assets</h2>
			<ul class="list-group">
				<li class="list-group-item"><a href="/assets/create">Create New Monthly Assets</a></li>
				<li class="list-group-item"><a href="/assets/all">All Monthly Assets</a></li>
			</ul>
		</div>
	
	</div>
	
	
</div>
</body>
</html>