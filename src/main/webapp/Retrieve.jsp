<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "java.util.List, java.util.ArrayList, com.demo.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Employee Registration</title>
	<link href="http://localhost:8080/batch64Dynamic/css/bootstrap.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<%
		List<Employee> employees = (ArrayList<Employee>) request.getAttribute("emp");
	%>
	<table class="table">
		<tr>
			<th>EMP ID</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Address</th>
		</tr>
		
		
		<% for(Employee e: employees) { %>
		<tr>
			<td>&nbsp;<%= e.getId() %>&nbsp;</td>
			<td>&nbsp;<%= e.getName() %>&nbsp;</td>
			<td>&nbsp;<%= e.getDept() %>&nbsp;</td>
			<td>&nbsp;<%= e.getSalary() %>&nbsp;</td>
			
		</tr>
		<% } %>
		
	
	</table>
		
	</div>

</body>
</html>