package com.sai.register;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.function.Predicate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sai.dbconnection.DBconnection;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn=DBconnection.getConnection();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String sql ="select count(*) as countv from emp_reg where email =? and password = ?";
		RequestDispatcher success = request.getRequestDispatcher("home.html");
		RequestDispatcher error   = request.getRequestDispatcher("failure.html");
		int count=0;
		try {
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs =ps.executeQuery();
		while(rs.next()) {
			count =rs.getInt("countv");
		}
		if(count > 0) {
			success.forward(request, response);
		}else {
			error.forward(request, response);
		}
		}catch (Exception e) {
			// TODO: handle exception
			error.forward(request, response);
			e.printStackTrace();
		}
	}

}
