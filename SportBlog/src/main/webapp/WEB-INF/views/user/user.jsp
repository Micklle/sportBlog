<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<link href="<c:url value="/resources/css/user.css" />" rel="stylesheet" />
</head>
<body>
<div class="cabinet">
	<h1>My cabinet</h1>
	<h4>Name: ${username}</h4>
	<a href="<c:url value="/j_spring_security_logout"/>">Log Out</a>
</div>
</body>
</html>