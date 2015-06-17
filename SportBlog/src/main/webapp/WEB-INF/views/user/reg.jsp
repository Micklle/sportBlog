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
	<div class="container">
		<ul class="nav nav-tabs">
			<li><a data-toggle="tab" href="#reg">Registration</a></li>
			<li class="active"><a data-toggle="tab" href="#login">Login</a></li>
		</ul>
	</div>

	<div class="tab-content">
		<div id="reg" class="tab-pane fade">
			<h1>REGISTRATION</h1>
			<form action="users/create" method="POST">
				<div id="user_create">
					<div>
						<label for="userName">Name</label> <input id="userName"
							type="text" name="userName" class="form-control"
							placeholder="name">
					</div>
					<div>
						<label for="email">Email</label> <input id="email" type="email"
							name="email" class="form-control" placeholder="example@mail.com">
					</div>
					<div>
						<label for="password">Password</label> <input id="password"
							type="password" name="password" class="form-control"
							placeholder="password">
					</div>

					<button class="btn btn-sample" type="submit">Submit</button>
				</div>
		</form>
		</div>
		<div id="login" class="tab-pane fade in active">
			<h1>Login</h1>
			<form action="users/login" method="post">
				<div class="form-group">
					<label for="name">Name:</label><input name="name" type="text"
						class="form-control" id="name" placeholder="Enter name" />
				</div>
				<div class="form-group">
					<label for="password">Password:</label><input name="pwd"
						type="password" class="form-control" placeholder="Enter password" />
				</div>
				<input type="submit" class="btn btn-default" value="LOGIN" />
			</form>
		</div>
	</div>
</body>
</html>
