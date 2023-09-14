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

<h1>Create New Customer</h1>

<form:form action="/customers/process/create" method="post" modelAttribute="customer">
		<div class="form-group">
			<form:label path="name">Customer Name </form:label>
			<form:input type="text" path="name" class="form-control"/>
			<form:errors path="name" />
		</div>
		<div class="form-group">
			<form:label path="companyPhoneNum">Company Phone Number </form:label>
			<form:input type="tel" path="companyPhoneNum" class="form-control"/>
			<form:errors path="companyPhoneNum" />
		</div>
		<div class="form-group">
			<form:label path="contactName">Contact Name </form:label>
			<form:input type="text" path="contactName" class="form-control"/>
			<form:errors path="contactName" />
		</div>
		<div class="form-group">
			<form:label path="contactPhoneNum">Contact Phone Number </form:label>
			<form:input type="tel" path="contactPhoneNum" class="form-control"/>
			<form:errors path="contactPhoneNum" />
		</div>
		<div class="form-group">
			<form:label path="location"> Customer Location </form:label>
			<form:input type="text" path="location" class="form-control"/>
			<form:errors path="location" />
		</div>
		<input type="submit" value="Create Customer"/>
	

 	</form:form>

</body>
</html>