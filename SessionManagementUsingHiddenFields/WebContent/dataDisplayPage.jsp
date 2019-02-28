<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>First_Name-${requestScope.userBean.firstName}
<br>Last_Name-${requestScope.userBean.lastName} 
<br>Fruit_Name-${requestScope.userBean.fruitName}
<br>Movie_Name-${requestScope.userBean.movieName}
</body>
</html>