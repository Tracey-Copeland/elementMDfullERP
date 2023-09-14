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
<h1>Create A Product</h1>
<form:form action="/products/process/create" method="post" modelAttribute="product">
		<form:input type="hidden" path="amountInStock" value="0"/>
		<div class="form-group">
			<form:label path="name">Product Name </form:label>
			<form:input type="text" path="name" class="form-control"/>
			<form:errors path="name" />
		</div>
		
		<div class="form-group">
			<form:label path="avgPrice">Price </form:label>
			<form:input type="number" step="0.01" path="avgPrice" class="form-control"/>
			<form:errors path="avgPrice" />
		</div>
		<input type="submit" value="Create Product"/>
	

 	</form:form>

</body>
</html>