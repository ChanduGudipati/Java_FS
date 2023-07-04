package com.sai;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("from Init");
		try {
			ServletContext context= config.getServletContext();
			String dbUrl = context.getInitParameter("dataBaseUrl");
			String userNAme = context.getInitParameter("userName");
			String password =context.getInitParameter("password");
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl,userNAme, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		System.out.println("from Destroy");
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        int sno =0;
        
         RequestDispatcher success_dispatcher = request.getRequestDispatcher("regSuccess.html");
         RequestDispatcher error_dispatcher = request.getRequestDispatcher("errorPage.html");
        
		String userName = request.getParameter("userName");
		String pass = request.getParameter("password");
		String email = request.getParameter("email");
		Long mobile = Long.parseLong(request.getParameter("mobile"));
		String addr = request.getParameter("address");
		
		try {
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery("select max(sno)+1 from emp_reg");
		while (rs.next()) {
			sno =rs.getInt(1);
		}
		PreparedStatement prepareStatement = con.prepareStatement("insert into emp_reg (username,sno,password,email,mobile,address) " + 
				"values(?,?,?,?,?,?)");
		prepareStatement.setString(1, userName);
		prepareStatement.setInt(2, sno);
		prepareStatement.setString(3, pass);
		prepareStatement.setString(4, email);
		prepareStatement.setLong(5, mobile);
		prepareStatement.setString(6, addr);
		int i =prepareStatement.executeUpdate();
		if(i>0) {
			  success_dispatcher.include(request, response);
			
			}else {
				error_dispatcher.include(request, response);	
			}
		}catch (Exception e) {
			// TODO: handle exception
			error_dispatcher.include(request, response);	
		}

	}

}
