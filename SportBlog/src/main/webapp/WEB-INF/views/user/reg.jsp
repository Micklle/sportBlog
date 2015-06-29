<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>registration</title>
<link href="<c:url value="/resources/css/user.css" />" rel="stylesheet">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<ul class="nav nav-pills" role="tablist">
			<li><a data-toggle="tab" href="#reg">Registration</a></li>
			<li class="active"><a data-toggle="tab" href="#login">Login</a></li>
		</ul>
	</div>

	<div class="tab-content">
		<div id="reg" class="tab-pane fade">
			<form class="form-horizontal" role="form" action="users/create"
				method="POST">
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Email:</label>
					<div class="col-sm-10">
						<input id="email" type="email" name="email" class="form-control"
							placeholder="Enter email">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="userName">Name:</label>
					<div class="col-sm-10">
						<input id="userName" type="text" name="userName"
							class="form-control" placeholder="Enter name">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="password">Password:</label>
					<div class="col-sm-10">
						<input id="password" type="password" name="password"
							class="form-control" placeholder="Enter password">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">Submit</button>
					</div>
				</div>
			</form>
		</div>
		
		<div id="login" class="tab-pane fade in active">
			<form class="form-horizontal" role="form"
				action="j_spring_security_check" method="post">
				<div class="form-group">
					<label class="control-label col-sm-2" for="userName">Name:</label>
					<div class="col-sm-10">
						<input name="j_username" type="text" class="form-control"
							id="name" placeholder="Enter name" required />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="password">Password:</label>
					<div class="col-sm-10">
						<input name="j_password" type="password" class="form-control"
							placeholder="Enter password" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<input type="submit" class="btn btn-default" value="LOGIN" />
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
