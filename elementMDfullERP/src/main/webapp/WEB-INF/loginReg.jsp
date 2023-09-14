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

<h1>login and reg page</h1>
	
	<div class="container">
		<div class="row">
			<div class="col">
				<h1>Register</h1>
					<form:form action="/admins/process/register" method="post" modelAttribute="newAdmin">
						<div class="form-group">
							<label>First Name</label>
							<form:input path="adminFirstName" class="form-control" />
							<form:errors path="adminFirstName" class="text-danger"/>
							</div>
							<div class="form-group">
							<label>Last Name</label>
							<form:input path="adminLastName" class="form-control" />
							<form:errors path="adminLastName" class="text-danger"/>
							</div>
							
						<div class="form-group">
							<label>Email</label>
							<form:input path="email" class="form-control" />
							<form:errors path="email" class="text-danger"/>
						</div>
						<div class="form-group">
							<label>Password</label>
							<form:input path="password" class="form-control" />
							<form:errors path="password" class="text-danger"/>
						</div>
						<div class="form-group">
							<label>Confirm Password</label>
							<form:input path="confirm" class="form-control" />
							<form:errors path="confirm" class="text-danger"/>
						</div>
						<input type="submit" value="register admin" class="btn btn-primary"/>
					</form:form>
			</div>
			<div class="col">
				<h1>login</h1>
				<form:form action="/admins/process/login" method="post" modelAttribute="loginAdmin">
					<div class="form-group">
						<label>Email</label>
						<form:input path="email" class="form-control"/>
						<form:errors path="email" class="text-danger"/>
					</div>
					<div class="form-group">
						<label>Password</label>
						<form:input path="password" class="form-control"/>
						<form:errors path="password" class="text-danger"/>
					</div>
					<input type="submit" value="login" class="btn btn-primary"/>
				</form:form>
			</div>
		</div>
	</div>

</body>
</html>