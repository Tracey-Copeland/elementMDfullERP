<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
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

<form:form action="/purchaseorders/process/edit/${purchaseorder.id }" method="post" modelAttribute="purchaseorder">
		<input type="hidden" name="_method" value="put"/>		
		<div class="form-group">
			<form:label path="supplier">Supplier ID</form:label>
			<form:input type="number" path="supplier" class="form-control"/>
			<form:errors path="supplier" />
		</div>
		<div class="form-group">
			<form:label path="material">Material ID</form:label>
			<form:input type="number" path="material" class="form-control"/>
			<form:errors path="material" />
		</div>
		<div class="form-group">
			<form:label path="currProgressNum">Current Progress</form:label><br/>
			Open<form:radiobutton path="currProgressNum" value="1"/>
			Pending Payment<form:radiobutton path="currProgressNum" value="2"/>
			Pending Approval<form:radiobutton path="currProgressNum" value="3"/>
			Closed<form:radiobutton path="currProgressNum" value="4"/>
			
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
		<input type="submit" value="Edit Purchase Order"/>


 	</form:form>


</body>
</html>