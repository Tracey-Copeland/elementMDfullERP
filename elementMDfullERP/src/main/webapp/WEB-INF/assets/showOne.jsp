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
			<h2>Month: <c:out value="${assets.month }"/></h2>
			<h3>Checking Account: <c:out value="${assets.checkingAcct}"/></h3>
			<h3>Savings Account: <c:out value="${assets.savingsAcct}"/> </h3>
			<h3>Petty Cash: <c:out value="${assets.pettyCash}"/></h3>
			<h3>Accounts Receivable: <c:out value="${assets.acctsRecievable}"/> </h3>
			<h3>Inventory: <c:out value="${assets.inventory}"/> </h3>
		</div>
	</div>

</body>
</html>