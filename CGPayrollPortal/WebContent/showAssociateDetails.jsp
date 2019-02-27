<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>Associate details:-
<br>First_Name-${requestScope.associate.firstName}
<br>Last_Name-${requestScope.associate.lastName} 
<br>YearlyInvestmentUnder80C-${requestScope.associate.yearlyInvestmentUnder80C}
<br>Department-${requestScope.associate.department}
<br>Designation-${requestScope.associate.designation} 
<br>Pancard_Id-${requestScope.associate.pancard}
<br>Email_Id-${requestScope.associate.emailId}
<br>Epf-${requestScope.associate.salary.epf} 
 <br>Basic_Salary-${requestScope.associate.salary.basicSalary}
<br>Company_Pf-${requestScope.associate.salary.companypf}  
<br>Account_Number-${requestScope.associate.bankDetails.accountNumber} 
<br>Bank_Name-${requestScope.associate.bankDetails.bankName} 
<br>IFSC_Code-${requestScope.associate.bankDetails.ifscCode}  
</body>
</html>