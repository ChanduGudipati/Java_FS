package com.sai;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UpdateEmailServlet
 */
@WebServlet("/UpdateEmailServlet")
public class UpdateEmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String oldEmail=request.getParameter("old_email");
		String newEmail=request.getParameter("new_email");
		
		HttpSession session = request.getSession();
		session.setAttribute("oldEmail", oldEmail);
		session.setAttribute("newEmail", newEmail);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("UpdateEmailImpl");
		requestDispatcher.forward(request, response);
	}

}
