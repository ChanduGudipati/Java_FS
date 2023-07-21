package com.sai.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/register")
public class RegisterServlet extends GenericServlet{
	Connection conn ;
	String url ="jdbc:mysql://localhost:3306/digit";
	String user ="root";
	String db_password ="Divyansh@21";
	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, db_password);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String userName =request.getParameter("userName");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String addr=request.getParameter("address");
		RequestDispatcher success = request.getRequestDispatcher("success.html");
		RequestDispatcher error   = request.getRequestDispatcher("failure.html");
		int sno=0;
		String sqlQuery ="insert into emp_reg (sno,username,password,email,mobile,address) values (?,?,?,?,?,?)";
		String sql ="select max(sno)+1 as maxsno from emp_reg";
		try {
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			sno=rs.getInt("maxsno");
		}	
		PreparedStatement ps = conn.prepareStatement(sqlQuery);
		Random ran = new Random();
		ps.setInt(1, sno);
		ps.setString(2, userName);
		ps.setString(3, password);
		ps.setString(4, email);
		ps.setLong(5, Long.parseLong(mobile));
		ps.setString(6, addr);
		int i = ps.executeUpdate();
		if(i > 0) {
			success.forward(request, response);
		}else {
			error.forward(request, response);
		}
		}catch (Exception e) {
			error.forward(request, response);
			e.printStackTrace();
		}
		
		
	}

}
