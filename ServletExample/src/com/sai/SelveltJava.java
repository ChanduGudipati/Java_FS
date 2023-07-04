package com.sai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SelveltJava extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		 writer.println("<html>");
		 writer.println("<body>");
		 writer.println("<h1>hello 9:30 JAVA Class</h1>");
		 writer.println("</body>");
		 writer.println("</html>");
		 writer.close();
	}

}
