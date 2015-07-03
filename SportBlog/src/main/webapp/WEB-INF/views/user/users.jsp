<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div>
		<button id="show-user">Show User</button>
		<div id="all">
			<table id="users_table" data-toggle="table"
				class="table table-bordered table-striped">
				<thead>
					<tr class="table-hover">
						<th>Id</th>
						<th>Name</th>
						<th>Email</th>
					</tr>
				</thead>
				<tbody id="content">

				</tbody>
			</table>
		</div>
	</div>
</body>
<script src="resources/js/user.js"></script>
</html>