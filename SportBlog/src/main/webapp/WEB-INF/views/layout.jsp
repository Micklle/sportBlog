<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><tiles:getAsString name="title" /></title>
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<link
	href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap-theme.min.css" />"
	rel="stylesheet">
<script type="text/javascript"
	src="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js" />"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script> 
<script>
	$(document).ready(function() {
		$('.hide_menu').click(function() {
			$('.sidebar').hide();
			$('.content').css('left', '0');
		});
		$('.show_menu').click(function() {
			$('.content').css('left', '170px');
			$('.sidebar').show('slow');
		});
	});
</script>

</head>
<body>
	<div class="header">
		<tiles:insertAttribute name="header" />
	</div>
	<div class="sidebar">
		<tiles:insertAttribute name="sidebar" />
	</div>
	<div class="content">
		<tiles:insertAttribute name="main_content" />
	</div>
	<div class="hide_menu">
		<tiles:insertAttribute name="hide_menu" />
	</div>
	<div class="show_menu">
		<tiles:insertAttribute name="show_menu" />
	</div>
</body>
</html>

