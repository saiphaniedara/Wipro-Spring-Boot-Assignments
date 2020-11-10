<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Employees</title>
<style>
	table,tr,td {
		border:2px solid black;
	}
</style>
</head>
<body>
	<h1 align="center">Displaying All Employees</h1>
	<table align="center">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Employee Salary</th>
	</tr>
	<c:forEach var="emp" items="${emps}">
		<tr>
			<td><c:out value="${emp.getEid()}"></c:out></td>
			<td><c:out value="${emp.getEname()}"></c:out></td>
			<td><c:out value="${emp.getEsalary()}"></c:out></td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="3" align="center"><a href="/"><button>Go to Home Page</button></a></td>
	</tr>
	</table>
</body>
</html>