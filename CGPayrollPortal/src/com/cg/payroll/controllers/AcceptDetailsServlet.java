package com.cg.payroll.controllers;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
@WebServlet("/acceptDetails")
public class AcceptDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PayrollServices services;
	@Override
	public void init() throws ServletException {	
		services=new PayrollServicesImpl();
	} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Associate associate=services.getAssociateDetails(associateId);
		} catch (AssociateDetailsNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher1=request.getRequestDispatcher("detailsfilledsuccessfully.jsp");
		request.setAttribute("associateId",associateId);
		dispatcher1.forward(request, response);
		
	}
	@Override
	public void destroy() {
		services=null;
	}
}

