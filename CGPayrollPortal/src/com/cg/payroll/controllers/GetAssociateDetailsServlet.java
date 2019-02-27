package com.cg.payroll.controllers;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
@WebServlet("/getAssociateDetails")
public class GetAssociateDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PayrollServices services;
	@Override
	public void init() throws ServletException {	
		services=new PayrollServicesImpl();
	} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int associateId=Integer.parseInt(request.getParameter("associateId"));
		Associate associate;
		try {
			associate = services.getAssociateDetails(associateId);
			request.setAttribute("associate",associate);
			request.getRequestDispatcher("showAssociateDetails.jsp").forward(request, response);			
		} catch (AssociateDetailsNotFoundException e) {
			 request.setAttribute("error",e.getMessage()); 
			
			 request.getRequestDispatcher("getAssociateDetails.jsp").forward(request,
			 response);		 
		}	
	}
	@Override
	public void destroy() {
		services=null;
	}
}