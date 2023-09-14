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

	<h2>Create Single Production Order</h2>
	
	<form:form action="/singprodordermat/process/create" method="post" modelAttribute="singleproductionordermaterial">
		
		<div class="form-group">
			<form:label path="material">Material ID</form:label>
			<form:input type="number" path="material" class="form-control"/>
			<form:errors path="material" />
		</div>
		<div class="form-group">
			<form:label path="productionorder">Production Order ID</form:label>
			<form:input type="number" path="productionorder" class="form-control"/>
			<form:errors path="productionorder" />
		</div>
		
		<div class="form-group">
			<form:label path="materialAmount">materialAmount</form:label>
			<form:input type="number"  path="materialAmount" class="form-control"/>
			<form:errors path="materialAmount" />
		</div>
		
		<div class="form-group">
			<form:label path="recipe">Price Per Unit</form:label>
			<form:input type="text"  path="recipe" class="form-control"/>
			<form:errors path="recipe" />
		</div>
		<input type="submit" value="Create Single Production Order"/>
	</form:form>

</body>
</html>