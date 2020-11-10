<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
</head>
<body>
	<h1 align="center">${head}</h1>
	<form action="${action}" method="post">
		<table align="center">
			<tr>
				<td><label for="eid">Enter Employee Id:</label></td>
				<td><input type="number" name="eid" required="required"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="${submit}"></td>
			</tr>
		</table>
	</form>
</body>
</html>