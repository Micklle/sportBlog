<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>

<body>
	<h1>Home page</h1>
	<sec:authorize access="isAnonymous()">
		sdfs
	</sec:authorize>
</body>