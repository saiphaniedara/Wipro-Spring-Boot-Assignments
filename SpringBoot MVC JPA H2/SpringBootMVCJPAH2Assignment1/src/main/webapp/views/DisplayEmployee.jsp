<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Employee</title>
</head>
<body>
	<h1 align="center">Employee Details</h1>
	<table align="center">
		<tr>
			<td>Employee Id </td>
			<td>${emp.getEid()}</td>
		</tr>
		<tr>
			<td>Employee Name </td>
			<td>${emp.getEname()}</td>
		</tr>
		<tr>
			<td>Employee Salary </td>
			<td>${emp.getEsalary()}</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><a href="/"><button>Go to Home Page</button></a></td>
		</tr>
	</table>
</body>
</html>