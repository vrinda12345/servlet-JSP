function validateLoginFrm(){
	if(document.loginForm.associateId.value==""){
		alert("Enter AssociateId");
		return false;
	}
	else if(loginForm.password.value==""){
		alert("Enter AssociateId");
		return false;
	}
}
function validateRegistrationFrm(){
	if(registerForm.firstName.value==""){
		alert("Enter first name");
		return false;
	}
	else if(registerForm.lastName.value==""){
		alert("Enter last name");
		return false;
	}
	else if(registerForm.emailId.value==""){
		alert("Enter email Id");
		return false;
	}
	else if(registerForm.department.value==""){
		alert("Enter department");
		return false;
	}
	else if(registerForm.designation.value==""){
		alert("Enter designation");
		return false;
	}
	else if(registerForm.basicSalary.value==""){
		alert("Enter basic Salary ");
		return false;
	}
	else if(registerForm.bankName.value==""){
		alert("Enter bank name");
		return false;
	}
	else if(registerForm.accountNo.value==""){
		alert("Enter account number");
		return false;
	}
	else if(registerForm.ifscCode.value==""){
		alert("Enter bank ifscCode");
		return false;
	}
}
function validatePassword(){
	if(changePasswordFrm.password.value.length>=6){
		if(changePasswordFrm.password.value.search(/[0-9]/)!=-1 && 
				changePasswordFrm.password.value.search(/[A-Z]/)!=-1 &&
				changePasswordFrm.password.value.search(/[!@#$%*()+_]/)!=-1){
			return true;				
		}
		else{
			alert("password must contain atleast 1 number 1 uppercase letter and 1 special character");
			return false;	
		}
	}
	else{
		alert("minimum of 6 characters");
		return false;
	}
}
function checkSame(){
	if(changePasswordFrm.password.value!=changePasswordFrm.password.value){
		alert("password and confirm password did not match");
		return false;
	}
}







