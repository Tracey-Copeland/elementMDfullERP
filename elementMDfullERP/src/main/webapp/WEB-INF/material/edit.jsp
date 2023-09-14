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

<form:form action="/materials/process/edit/${material.id }" method="post" modelAttribute="material">
		<input type="hidden" name="_method" value="put"/>		
		<div class="form-group">
			<form:label path="name">Material Name </form:label>
			<form:input type="text" path="name" class="form-control"/>
			<form:errors path="name" />
		</div>
		<div class="form-group">
			<form:label path="description">Material description </form:label>
			<form:input type="text" path="description" class="form-control"/>
			<form:errors path="description" />
		</div>
		<div class="form-group">
			<form:label path="amountInStock">amountInStock</form:label>
			<form:input type="number" path="amountInStock" class="form-control"/>
			<form:errors path="amountInStock" />
		</div>
		
		<input type="submit" value="Edit Material"/>


 	</form:form>

</body>
</html>