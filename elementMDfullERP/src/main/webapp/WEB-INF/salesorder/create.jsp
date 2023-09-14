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

<h2>Create Sales Order</h2>
	
	<form:form action="/salesorders/process/create" method="post" modelAttribute="salesorder">
		<form:input type="hidden" path="currProgressNum" value="1"/>
		<div class="form-group">
			<form:label path="customer">Customer ID</form:label>
			<form:input type="number" path="customer" class="form-control"/>
			<form:errors path="customer" />
		</div>
		<div class="form-group">
			<form:label path="product">Product ID</form:label>
			<form:input type="number" path="product" class="form-control"/>
			<form:errors path="product" />
		</div>
		
		<div class="form-group">
			<form:label path="quantity">Quantity</form:label>
			<form:input type="number"  path="quantity" class="form-control"/>
			<form:errors path="quantity" />
		</div>
		
		<div class="form-group">
			<form:label path="pricePerUnit">Price Per Unit</form:label>
			<form:input type="number" step="0.01" path="pricePerUnit" class="form-control"/>
			<form:errors path="pricePerUnit" />
		</div>
		
		<div class="form-group">
			<form:label path="unitTotalPrice">Total price for unit</form:label>
			<form:input type="number" step="0.01" path="unitTotalPrice" class="form-control"/>
			<form:errors path="unitTotalPrice" />
		</div>
		<input type="submit" value="Create Sales Order"/>
	</form:form>


</body>
</html>