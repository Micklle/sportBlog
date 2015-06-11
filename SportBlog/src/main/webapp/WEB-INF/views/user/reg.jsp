<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>registration</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="reg">
		<h1>REGISTRATION</h1>
		<form action="users/create" method="post">
			<div class="form-group">
				<label for="name">Name:</label><input name="name" type="text" class="form-control" id="name" placeholder="Enter name" />
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input name="email" type="email" class="form-control" placeholder="Enter email" />
			</div>
			<div class="form-group">
				<label for="password">Password:</label><input name="pwd" type="password" class="form-control" placeholder="Enter password" />
			</div>
			<input type="submit" class="btn btn-default" value="REGISTRATION" />
		</form>
	</div>
</body>
</html>
