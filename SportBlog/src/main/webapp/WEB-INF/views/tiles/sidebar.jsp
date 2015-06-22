<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script> 
<script>
	$(document).ready(function() {
		$('.menu').click(function() {
			$('.panel').toggle("slow");
		});
	});
</script>
<nav class="navbar">
	<div class="menu">
		<p>Menu</p>
	</div>
	<div class="panel">
		<ul class="nav nav-sidebar">
			<li class="active"><a href="/SportBlog/home">Home</a></li>
			<sec:authorize access="hasRole('user')">
				<li><a href="/SportBlog/users/user">My cabinet</a></li>
			</sec:authorize>
			<sec:authorize access="isAnonymous()">
				<li class=""><a href="/SportBlog/login">Login</a></li>
			</sec:authorize>
			<li><a href="/SportBlog/posts">Posts</a></li>
			<li><a href="/SportBlog/users">Users</a></li>
			<li><a href="/SportBlog/reward">Reward</a></li>
		</ul>
	</div>
</nav>


