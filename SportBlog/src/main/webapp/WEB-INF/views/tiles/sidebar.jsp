<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<div class="internal-buttons">
	<ul class="nav nav-sidebar">
		<li><a href="/SportBlog/home">Home</a></li>
		<li><a href="/SportBlog/posts">Posts</a></li>
		<sec:authorize access="isAnonymous()">
			<li><a href="/SportBlog/login">Login</a></li>
		</sec:authorize>
		<sec:authorize access="hasRole('ROLE_USER')">
			<li><a href="/SportBlog/user">My cabinet</a></li>
		</sec:authorize>

	</ul>
</div>
