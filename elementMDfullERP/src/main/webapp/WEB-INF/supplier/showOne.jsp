<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/supplier/showOne.css"/>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="row">

	<div class="col-2 container p-1 border text-center">
	
	<h2>Testing</h2>
	<h2>Something</h2>
	</div>
	
	
	<div class="col-9">
	<div>
	<h1 class="row justify-content-center py-2"><c:out value="${supplier.name }"/></h1>
	</div>
	<div class="border container text-center">
		<div class="row justify-content-center">
			<div class="d-flex flex-row p-2 justify-content-evenly">
			<h4>Location: <c:out value="${supplier.location}"/></h4>
			<h4>Company Phone Number: <c:out value="${supplier.companyPhoneNum}"/> </h4>
			</div>
			<div class="d-flex flex-row p-2 justify-content-evenly">
			<h4>Contact: <c:out value="${supplier.contactName}"/></h4>
			<h4>Contact Phone Number: <c:out value="${supplier.contactPhoneNum}"/> </h4>
			</div>
			<h3><a href="/suppliers/edit/${supplier.id }">Edit</a></h3>
		</div>
		
	</div>
	
	<div class="m-3">
		<h4>
		<a class="btn btn-success" data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
			Purchase Orders
		</a>
		</h4>
		
			<table class="table table-striped text-center collapse" id="collapseExample">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Material</th>
					<th scope="col">Quantity</th>
					<th scope="col">PPU</th>
					<th scope="col">Total Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${supplier.purchaseOrders}" var="purchaseorder">
						<tr>
							<td>${purchaseorder.id }</td>
							<td>${purchaseorder.material.name }</td>
							<td>${purchaseorder.quantity }</td>
							<td>${purchaseorder.pricePerUnit }</td>
							<td>${purchaseorder.unitTotalPrice }</td>
						</tr>
				
				</c:forEach>
			</tbody>
		</table>
	</div>
	</div>
	

	</div>


</body>
</html>