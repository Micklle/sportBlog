<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body>
	<div class="tab-content">
		<div id="all" class="tab-pane fade in active">

			<table id="users_table" class="table table-bordered table-striped">
				<thead>
					<tr  class="table-hover">
						<th>Title</th>
						<th>Text</th>
						<th>#</th>
						<th>Author</th>
					</tr>
				</thead>
				<c:forEach items="${posts}" var="post">
					<tr>
						<td>${post.title }</td>
						<td>${post.text }</td>
						<td><c:forEach items="${post.hashTags}" var="hashtag"> ${hashtag } </c:forEach></td>
						<td>${post.author }</td>
					</tr>
				</c:forEach>
			</table>

		</div>

	</div>
</body>