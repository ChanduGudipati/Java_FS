package com.sai;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
 * Servlet implementation class UpdateEmailImpl
 */
@WebServlet("/UpdateEmailImpl")
public class UpdateEmailImpl extends HttpServlet {
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		String old =(String)session.getAttribute("oldEmail");
		String newE =(String)session.getAttribute("newEmail");
        String query ="update emp_reg set email=? where email=?";
        RequestDispatcher rs = request.getRequestDispatcher("errorPage.html");
        RequestDispatcher rsS = request.getRequestDispatcher("updateEmailS.html");
        RequestDispatcher rsE = request.getRequestDispatcher("updateEmailE.html");
        try {
			PreparedStatement prepareStatement = con.prepareStatement(query);
			prepareStatement.setString(1, newE);
			prepareStatement.setString(2, old);
			int i =prepareStatement.executeUpdate();
			if( i > 0) {
				rsS.include(request, response);
			}else {
				rsE.include(request, response);
			}
			
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rs.include(request, response);
		}
	}

}
