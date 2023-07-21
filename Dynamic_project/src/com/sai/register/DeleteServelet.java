package com.sai.register;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sai.dbconnection.DBconnection;

/**
 * Servlet implementation class DeleteServelet
 */
@WebServlet("/delete")
public class DeleteServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn = null;
	PreparedStatement ps = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sno = request.getParameter("sno");
		RequestDispatcher success = request.getRequestDispatcher("ret.jsp");
		RequestDispatcher error = request.getRequestDispatcher("error.html");
		String sql = "delete from emp_reg where sno =?";
		try {
			conn = DBconnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(sno));
			int i =ps.executeUpdate();
			if( i > 0) {
				success.forward(request, response);	
			}else {
				error.forward(request, response);
			}

		} catch (Exception e) {
			// TODO: handle exception
			error.forward(request, response);
		}
	}

}
