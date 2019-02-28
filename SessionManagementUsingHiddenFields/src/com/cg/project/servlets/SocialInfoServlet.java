package com.cg.project.servlets;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.UserBean;
@WebServlet("/socialInfoServlet")
public class SocialInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String movieName=request.getParameter("movieName");
		String fruitName=request.getParameter("fruitName");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");

		UserBean userBean=new UserBean(firstName,lastName,fruitName,movieName);
		
		request.setAttribute("userBean",userBean);
		RequestDispatcher dispatcher=request.getRequestDispatcher("dataDisplayPage.jsp");
		dispatcher.forward(request, response);
		
		
		
	}
}
