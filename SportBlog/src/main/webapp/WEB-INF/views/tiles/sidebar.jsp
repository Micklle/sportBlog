<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<nav class="navbar">
	<ul class="nav nav-sidebar">
		<li class="active"><a href="/SportBlog/home">Home</a></li>
		<sec:authorize access="hasRole('user')"><li><a href="/SportBlog/users/user">My cabinet</a></li></sec:authorize>
		<sec:authorize access="isAnonymous()"><li class=""><a href="/SportBlog/login">Login</a></li></sec:authorize>
		<li><a href="/SportBlog/posts">Posts</a></li>
		<li><a href="/SportBlog/users">Users</a></li>

	</ul>
</nav>
