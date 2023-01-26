<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Employee Registration</title>
	<link href="http://localhost:8080/batch64Dynamic/css/bootstrap.css" rel="stylesheet">
</head>
<body>
	<div class="container">
	<div class="form-group">
		<form action="RegisterServlet" method="post">
			<label for="id">ID</label>
			<input type="text" name="id" id="id" class="form-control"/><br> 
			<label for="name">Name</label>
			<input type="text" name="name" id="name" class="form-control"/> <br>
			<label for="dept">Department</label>
			<input type="text" name="department" id="department" class="form-control"/><br>
			<label for="salary">Salary</label>
			<input type="text" name="salary" id="salary" class="form-control"/> <br>
			
			<input type="submit" value="Register"/>
		</form>
	</div>
	</div>

</body>
</html>