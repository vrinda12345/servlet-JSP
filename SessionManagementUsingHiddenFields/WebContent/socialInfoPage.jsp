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
	<font size=10>Welcome ${requestScope.userBean.firstName}</font>
		<form action="socialInfoServlet" name="socialInfoFrm" method="post">
			<table>
				<tr>
					<td>Enter_ Movie_Name:</td>
					<td><input type="text" name="movieName"></td>
				</tr>
				<tr>
					<td>Enter_Fruit_Name:</td>
					<td><input type="text" name="fruitName"></td>
				</tr>
				<tr>
					<td><input type="hidden" name="firstName" value="${requestScope.userBean.firstName}"></td>
				</tr>
				<tr>
					<td><input type="hidden" name="lastName" value="${requestScope.userBean.lastName}"></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit"></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>