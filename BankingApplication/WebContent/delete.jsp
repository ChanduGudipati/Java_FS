<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
Connection con = null;
String url="jdbc:mysql://localhost:3306/digit";
String user="root";
String password="Divyansh@21";
PreparedStatement ps = null; 
RequestDispatcher rs =null;
int i ;
%>

<%
Class.forName("com.mysql.cj.jdbc.Driver");
con= DriverManager.getConnection(url,user,password);
ps = con.prepareStatement("delete from Banking_reg where sno =?");
String sno =request.getParameter("sno");
ps.setInt(1, Integer.valueOf(sno));
i=ps.executeUpdate();
if(i>0){
	rs =request.getRequestDispatcher("ret.jsp");
	rs.forward(request, response);
	
}else{
	rs =request.getRequestDispatcher("error.jsp");
	rs.forward(request, response);
}
%>
</body>
</html>