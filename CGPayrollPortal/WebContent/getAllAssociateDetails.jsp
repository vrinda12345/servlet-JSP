<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background_color: #F2F4F4">
	<div align="center">
		<font size="5"> <u> All Associate Details</u><br> <s:forEach
				var="asso" items="${requestScope.associate}">
				<font size="4">${asso}<br></font>

			</s:forEach>
		</font>
	 <button onclick="window.print()">Print this page</button>
	</div>
</body>
</html>