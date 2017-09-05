<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>New message</title>
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<br/>
		<sf:form action="/app/newmessage" method="POST" modelAttribute="newmessage">
			<input type="hidden" name="_method" value="POST" />
			<label>Add your message: </label><br>
			<sf:input path="txt" size="25" id="txt"/><br><br>
			<input name="commit" type="submit" value="Post Message"/>
		</sf:form>
		
		<% if(session.getAttribute("MESSAGE_USER") != null){ %>
				<br>
				${newmessage}
		<% } %>
		
	</body>
</html>