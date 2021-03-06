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
		
		<input type="text" id="content" />
		<input type="submit" id="submit"/>
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script>
			$('#submit').click( function(){
				var content = document.getElementById('content').value;
				$.ajax({
					url: 'http://localhost:8080/app/message',
					type: 'post',
					async: true,
					data: JSON.stringify(content),
					contentType: 'application/json; charset=utf-8',
					success: function(data)
					{
						location.reload();
					},
					failure: function(data){
						
					}
				});
			});
		</script>
		${message}
	</body>
</html>