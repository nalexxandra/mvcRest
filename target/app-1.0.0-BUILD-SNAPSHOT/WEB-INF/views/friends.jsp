<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Friends</title>
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<hr/>
			<ul>
				<c:forEach var="userList" items="${users}">
					<li> Username: <c:out value="${userList.username}"/> </li><br/>
					<li> Password: <c:out value="${userList.password}"/> </li><br/>
					<li> Email: <c:out value="${userList.email}"/> </li><br/>
					<% if(session.getAttribute("LOGGEDIN_USER") != null){ %>
					
					<% } %>
					<br/>
				</c:forEach>
			</ul>
		<hr/>
	</body>
</html>