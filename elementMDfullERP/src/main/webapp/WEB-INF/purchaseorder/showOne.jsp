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
			<h2>Supplier: <c:out value="${purchaseorder.supplier.name}"/></h2>
			<h2>Material: <c:out value="${purchaseorder.material.name}"/></h2>
		</div>
	</div>
	<div>
	<h3>Quantity: <c:out value="${purchaseorder.quantity}"/></h3>
	<h3>Price Per Unit: <c:out value="${purchaseorder.pricePerUnit}"/></h3>
	<h3>Total Price: <c:out value="${purchaseorder.unitTotalPrice}"/> </h3>
	
	</div>
	
	<h2><a href="/purchaseorders/edit/${ purchaseorder.id}">Edit</a></h2>
	

</body>
</html>