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
	<h2>All Monthly Assets</h2>
	<table class="table table-striped text-center">
	
	<thead>
		<tr>
		<th scope="col">Month</th>
		<th scope="col">Checking Account</th>
		<th scope="col">Savings Account</th>
		<th scope="col">Petty Cash</th>
		<th scope="col">Accounts Receivable</th>
		<th scope="col">Inventory</th>
		
		</tr>
	
	</thead>
	<tbody>
		<c:forEach items="${allAssets }" var="as">
			<tr>
				<td><a href="/assets/${as.id}">${as.month }</a></td>
				<td>${as.checkingAcct }</td>
				<td>${as.savingsAcct }</td>
				<td>${as.pettyCash }</td>
				<td>${as.acctsRecievable }</td>
				<td>${as.inventory }</td>
				
			</tr>
		</c:forEach>
	</tbody>
	</table>
	</div>

</body>
</html>