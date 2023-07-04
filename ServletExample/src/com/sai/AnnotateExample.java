package com.sai;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AnnotateExample")
public class AnnotateExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	Statement st;
	public void init(ServletConfig config) throws ServletException {
		System.out.println("from Init");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digit","root","Divyansh@21"); 
			st= con.createStatement();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void destroy() {
		System.out.println("from Destroy");
		try {
		con.close();
		st.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service method");
		PrintWriter pr = response.getWriter();
		int i=0;
		try {
		String query = "insert into emp_reg (username,sno,password,email,mobile,address)\r\n" + 
				"values('java1234',12,'java1234@123','sai1@gmail.com',9494722233,'HYD1')";
		i =st.executeUpdate(query);
		}catch (Exception e) {
			e.printStackTrace();
		}	
		if(i>0) {
		
		pr.write("<html>");
		pr.write("<body>");
		pr.write("<h1>");
		pr.write("Value inserted Successfully");
		pr.write("</h1>");
		pr.write("</body>");
		pr.write("</html>");
		}else {
			pr.write("<html>");
			pr.write("<body>");
			pr.write("<h1>");
			pr.write("Value Not inserted");
			pr.write("</h1>");
			pr.write("</body>");
			pr.write("</html>");
		}
	}

}
