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
<form:form action="/productmaterials/process/create" method="post" modelAttribute="productmaterial">
		<div class="form-group">
			<form:label path="material">Material ID </form:label>
			<form:input type="number" path="material" class="form-control"/>
			<form:errors path="material" />
		</div>
		<div class="form-group">
			<form:label path="product">Product ID </form:label>
			<form:input type="number" path="product" class="form-control"/>
			<form:errors path="product" />
		</div>
		<div class="form-group">
			<form:label path="amtNeeded">Amount Needed </form:label>
			<form:input type="number" path="amtNeeded" class="form-control"/>
			<form:errors path="amtNeeded" />
		</div>
		<input type="submit" value="Create Product"/>
	

 	</form:form>

</body>
</html>