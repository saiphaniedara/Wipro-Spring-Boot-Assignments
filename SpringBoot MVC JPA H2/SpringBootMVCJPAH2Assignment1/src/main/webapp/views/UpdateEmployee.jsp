<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Details</title>
</head>
<body>
	<h2 align="center">Enter Employee Details to Update</h2>
	<form action="updateEmp" method="post">
	<table align="center">
		<tr>
			<td><label for="eid">Employee Id:</label></td>
			<td><input type="number" name="eid" value="${emp.getEid()}" readonly="readonly"></td>
		</tr>
		<tr>
			<td><label for="ename">Employee Name:</label></td>
			<td><input type="text" name="ename" value="${emp.getEname()}" required="required"></td>
		</tr>
		<tr>
			<td><label for="esalary">Employee Salary:</label></td>
			<td><input type="number" name="esalary" value="${emp.getEsalary()}" required="required"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="Update Employee"></td>
		</tr>
	</table>
	</form>
</body>
</html>