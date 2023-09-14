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

<form:form action="/suppliers/process/edit/${supplier.id }" method="post" modelAttribute="supplier">
<input type="hidden" name="_method" value="put"/>
		<div class="form-group">
			<form:label path="name">Supplier Name </form:label>
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
			<form:label path="location"> Supplier Location </form:label>
			<form:input type="text" path="location" class="form-control"/>
			<form:errors path="location" />
		</div>
		<input type="submit" value="Edit Supplier"/>
	

 	</form:form>

</body>
</html>