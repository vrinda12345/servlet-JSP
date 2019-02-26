package com.cg.payroll.controllers;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
@WebServlet("/registrationFrm")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PayrollServices services;
	@Override
	public void init() throws ServletException {	
		services=new PayrollServicesImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int associateId = services.acceptAssociateDetails(new Associate(Integer.parseInt(request.getParameter("yearlyInvestmentUnder80C")), request.getParameter("firstName"), request.getParameter("lastName"), request.getParameter("department"), request.getParameter("designation"), request.getParameter("pancard"), request.getParameter("emailId"),
				new Salary(Integer.parseInt(request.getParameter("basicSalary")), Integer.parseInt(request.getParameter("epf")), Integer.parseInt(request.getParameter("companyPf"))),
				new BankDetails(Integer.parseInt(request.getParameter("accountNumber")), request.getParameter("bankName"), request.getParameter("ifscCode"))));			


		RequestDispatcher dispatcher=request.getRequestDispatcher("registrationSuccess.jsp");
		request.setAttribute("associateId",associateId);
		dispatcher.forward(request, response);
	}
	@Override
	public void destroy() {
		services=null;
	}
}