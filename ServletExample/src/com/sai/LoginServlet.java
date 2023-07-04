package com.sai;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
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

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String sqlQuery ="select * from emp_reg where email = ? and password = ?";
		RequestDispatcher success_rs = req.getRequestDispatcher("home.html");
		RequestDispatcher error_rs = req.getRequestDispatcher("loginFailure.html");
		try {
			PreparedStatement pr = con.prepareStatement(sqlQuery);
			pr.setString(1, username);
			pr.setString(2,password);
			
			ResultSet rs = pr.executeQuery();
			if(rs.next()) {
				success_rs.include(req, resp);
			}else {
				error_rs.include(req, resp);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
