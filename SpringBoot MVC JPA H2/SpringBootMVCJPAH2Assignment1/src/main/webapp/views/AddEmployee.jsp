<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<h2 align="center">Enter Employee Details to add an Employee</h2>
	<form action="addEmployee" method="post">
	<table align="center">
		<tr>
			<td><label for="eid">Employee Id:</label></td>
			<td><input type="number" name="eid" required="required"></td>
		</tr>
		<tr>
			<td><label for="ename">Employee Name:</label></td>
			<td><input type="text" name="ename" required="required"></td>
		</tr>
		<tr>
			<td><label for="esalary">Employee Salary:</label></td>
			<td><input type="number" name="esalary" required="required"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="Add Employee"></td>
		</tr>
	</table>
	</form>
</body>
</html>