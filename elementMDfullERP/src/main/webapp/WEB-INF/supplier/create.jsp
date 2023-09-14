<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>


<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/supplier/create.css"/>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create New Supplier</h1>

<form:form action="/suppliers/process/create" method="post" modelAttribute="supplier">
		<div class="form-group">
			<form:label path="name">Company Name </form:label>
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
			<form:label path="location">Location </form:label>
			<form:input type="text" path="location" class="form-control"/>
			<form:errors path="location" />
		</div>
		<input type="submit" value="Create Supplier"/>
	

 	</form:form>

</body>
</html>