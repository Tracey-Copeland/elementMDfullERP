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
	<h2>All Customers</h2>
	<table class="table table-striped text-center">
	
	<thead>
		<tr>
		<th scope="col">Company ID</th>
		<th scope="col">Company Name</th>
		<th scope="col">Company Phone Number</th>
		<th scope="col">Location</th>
		</tr>
	
	</thead>
	<tbody>
		<c:forEach items="${allCustomers }" var="customer">
			<tr>
				<td>${customer.id }</td>
				<td><a href="/customers/${customer.id }">${customer.name }</a></td>
				<td>${customer.companyPhoneNum }</td>
				<td>${customer.location }</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	</div>

</body>
</html>