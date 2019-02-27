<!DOCTYPE html>
<html>
<body>
	<div align="center">Get associate details</div>
	<form action="getAssociateDetails" method="post">
		<table>
			<tr>
				<td>Associate Id</td>
				<td><input type="text" name="associateId"></td>
			<tr>
			<tr>
				<td><button type="submit">Submit</button></td>
			</tr>
		</table>
	</form>
	<div><font color='red'>${requestScope.error}</font></div>
	
	<script type="text/javascript" src="JS/validations.js" ></script>
</body>
</html>