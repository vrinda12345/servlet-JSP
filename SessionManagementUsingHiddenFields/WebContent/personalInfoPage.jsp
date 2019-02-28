<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="personalInfoServlet" name="personalInfoFrm"
			method="post">
			<table>
				<tr>
					<td>Enter_First_Name:</td>
					<td><input type="text" name="firstName"></td>
				</tr>
				<tr>
					<td>Enter_Last_Name:</td>
					<td><input type="text" name="lastName"></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit"></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>