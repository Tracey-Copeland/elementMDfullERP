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
			<h2>Name: <c:out value="${customer.name }"/></h2>
			<h3>Location: <c:out value="${customer.location}"/></h3>
			<h3>Company Phone Number: <c:out value="${customer.companyPhoneNum}"/> </h3>
			<h3>Contact: <c:out value="${customer.contactName}"/></h3>
			<h3>Contact Phone Number: <c:out value="${customer.contactPhoneNum}"/> </h3>
		</div>
	</div>
	
	<div>
	<h3>Sales Orders</h3>
	<table class="table table-striped text-center">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Product Name</th>
					<th scope="col">Product Amount</th>
					<th scope="col">PPU</th>
					<th scope="col">Total price</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${customer.salesOrders}" var="so">
						<tr>
							<td>${so.id }</td>
							<td>${so.product.name }</td>
							<td>${so.quantity }</td>
							<td>${so.pricePerUnit }</td>
							<td>${so.unitTotalPrice }</td>
						</tr>
				
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<h2><a href="/customers/edit/${customer.id }">Edit</a></h2>

</body>
</html>