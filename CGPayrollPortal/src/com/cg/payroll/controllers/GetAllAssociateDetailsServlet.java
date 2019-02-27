package com.cg.payroll.controllers;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

@WebServlet("/getAllAssociateDetails")
public class GetAllAssociateDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PayrollServices services;
	@Override
	public void init() throws ServletException {	
		services=new PayrollServicesImpl();
	} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Associate> associate=services.getAllAssociateDetails();
			request.setAttribute("associate",associate);			
			 request.getRequestDispatcher("getAllAssociateDetails.jsp").forward(request,response);		 
	}
	@Override
	public void destroy() {
		services=null;
	}
}