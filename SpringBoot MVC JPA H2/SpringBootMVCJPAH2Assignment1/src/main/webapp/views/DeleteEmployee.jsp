<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
</head>
<body>
	<h2 align="center">Delete Employee</h2>
	<table align="center">
		<tr>
			<td>Employee Id: </td>
			<td>${emp.getEid()}</td>
		</tr>
		<tr>
			<td>Employee Name: </td>
			<td>${emp.getEname()}</td>
		</tr>
		<tr>
			<td>Employee Salary: </td>
			<td>${emp.getEsalary()}</td>
		</tr>
		<tr>
			<td>
			<form action="deleteEmp" method="post">
				<input type="hidden" name="eid" value="${emp.getEid()}">
				<input type="submit" value="Delete Employee">
			</form>
			</td>
			<td>
			<a href="/"><button>Go Back to Home Page</button></a>
			</td>
		</tr>
	</table>
</body>
</html>