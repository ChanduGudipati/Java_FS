<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.sai.dbconnection.DBconnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- Directive <%@ %>  import statment will go here
     Declaration <%! %> Declaration  -->init
     Scriptlet <% %>    java code logic 
	 Expression <%= %>  out --%>

	<%!Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;%>
	<%
		conn = DBconnection.getConnection();
		stmt = conn.createStatement();
		sql = "select * from emp_reg";
		rs =stmt.executeQuery(sql);
	%>
	<table border="1" style="color: blue; font-family: cursive;">
	<tr>
	<th>sno</th>
	<th>userName</th>
	<th>Email</th>
	<th>Mobile</th>
	<th>address</th>
	<th>Action</th>
	<th>Action</th>
	<th>Action</th>
	</tr>
	<%
	while(rs.next()){
	%>
	<tr>
	<td><%= rs.getInt("sno") %></td>
	<td><%= rs.getString("username") %></td>
	<td><%= rs.getString("email") %></td>
	<td><%= rs.getLong("mobile") %></td>
	<td><%= rs.getString("address")%></td>
	<td><a href ="">update</a></td>
	<td><a href ="delete?sno=<%= rs.getInt("sno") %>">delete</a></td>
	<td><a href ="register.html">Insert</a></td>
	
	</tr>
	<%
	}
	%>
	</table>

</body>
</html>