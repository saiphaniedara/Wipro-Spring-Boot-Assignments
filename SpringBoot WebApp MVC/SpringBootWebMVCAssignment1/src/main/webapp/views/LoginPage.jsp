<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1 align="center">Welcome to Login Page</h1>
	<form action="Login" method="post">
	<table align="center">
			<tr>
				<td><label for="uname">Username</label></td>
				<td><input type="text" name="uname" required></td>
			</tr>
			<tr>
				<td><label for="pwd">Password</label></td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Login"></td>
			</tr>
	</table>
	</form>
</body>
</html>