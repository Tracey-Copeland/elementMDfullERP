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
			<h2>Customer: <c:out value="${salesorder.customer.name}"/></h2>
			<h2>Product: <c:out value="${salesorder.product.name}"/></h2>
			<h2>Progress Num: <c:out value="${salesorder.currProgressNum}"/></h2>
			
		</div>
	</div>
	<div>
	<h3>Quantity: <c:out value="${salesorder.quantity}"/></h3>
	<h3>Price Per Unit: <c:out value="${salesorder.pricePerUnit}"/></h3>
	<h3>Total Price: <c:out value="${salesorder.unitTotalPrice}"/> </h3>
	
	</div>
	
		<h2><a href="/salesorders/edit/${ salesorder.id}">Edit</a></h2>

</body>
</html>