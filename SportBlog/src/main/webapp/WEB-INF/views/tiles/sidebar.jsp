<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<div class="internal-buttons">
	<ul class="nav nav-sidebar">
		<li><a href="/SportBlog/home">Home</a></li>
		<sec:authorize access="hasRole('user')"><li><a href="/SportBlog/users/user">My cabinet</a></li></sec:authorize>
		<sec:authorize access="isAnonymous()"><li><a href="/SportBlog/login">Login</a></li></sec:authorize>
		<li><a href="/SportBlog/posts">Posts</a></li>
		<li><a href="/SportBlog/users">Users</a></li>
		<li><a href="/SportBlog/reward">Reward</a></li>
		
		
	</ul>
</div>
