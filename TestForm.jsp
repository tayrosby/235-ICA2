<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Form</title>
</head>
<body>
	<form method = "POST" action="TestServlet">
		First Name:<input type = "text" name ="firstname"/><br>
		Last Name:<input type = "text" name ="lastname"/><br>
		<input type="submit" name ="Submit"/>
	</form>
</body>
</html>