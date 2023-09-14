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

<form:form action="/products/process/edit/${product.id }" method="post" modelAttribute="product">
		<input type="hidden" name="_method" value="put"/>		
		<div class="form-group">
			<form:label path="name">Product Name </form:label>
			<form:input type="text" path="name" class="form-control"/>
			<form:errors path="name" />
		</div>
		<div class="form-group">
			<form:label path="avgPrice">Average Price</form:label>
			<form:input type="number" step="0.01" path="avgPrice" class="form-control"/>
			<form:errors path="avgPrice" />
		</div>
		<div class="form-group">
			<form:label path="amountInStock">amountInStock</form:label>
			<form:input type="number"  path="amountInStock" class="form-control"/>
			<form:errors path="amountInStock" />
		</div>
		
		<input type="submit" value="Edit product"/>


 	</form:form>

</body>
</html>