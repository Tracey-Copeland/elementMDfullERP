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
<h1>Create New Material</h1>
<form:form action="/materials/process/create" method="post" modelAttribute="material">
		<form:input type="hidden" path="amountInStock" value="0"/>
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
		<input type="submit" value="Create Material"/>
	

 	</form:form>


</body>
</html>