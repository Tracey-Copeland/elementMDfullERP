<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<h1>Create Assets</h1>

<form:form action="/assets/process/create" method="post" modelAttribute="assets">
		<div class="form-group">
			<form:label path="month">Month </form:label>
			<form:input type="text" path="month" class="form-control"/>
			<form:errors path="month" />
		</div>
		<div class="form-group">
			<form:label path="checkingAcct">Checking Account</form:label>
			<form:input type="number" step="0.01" path="checkingAcct" class="form-control"/>
			<form:errors path="checkingAcct" />
		</div>
		<div class="form-group">
			<form:label path="savingsAcct">Savings Account</form:label>
			<form:input type="number" step="0.01" path="savingsAcct" class="form-control"/>
			<form:errors path="savingsAcct" />
		</div>
		<div class="form-group">
			<form:label path="pettyCash">Petty Cash</form:label>
			<form:input type="number" step="0.01" path="pettyCash" class="form-control"/>
			<form:errors path="pettyCash" />
		</div>
		<div class="form-group">
			<form:label path="acctsRecievable">Accounts Receivable</form:label>
			<form:input type="number" step="0.01" path="acctsRecievable" class="form-control"/>
			<form:errors path="acctsRecievable" />
		</div>
		<div class="form-group">
			<form:label path="inventory">Inventory</form:label>
			<form:input type="number" step="0.01" path="inventory" class="form-control"/>
			<form:errors path="inventory" />
		</div>
		<input type="submit" value="Create Assets"/>
	

 	</form:form>

</body>
</html>