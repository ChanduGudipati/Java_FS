<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
Connection con = null;
PreparedStatement stmt = null;
String url="jdbc:mysql://localhost:3306/digit";
String user="root";
String password="Divyansh@21";
String query ="insert into Banking_reg (sno,accout_number,holder_name,city,state,neft_code) values (?,?,?,?,?,?)";
Statement st = null; 
ResultSet rs =null;
int sno;
int acc_count;
int i;
%>
<%
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con= DriverManager.getConnection(url,user,password);
	PreparedStatement ps= con.prepareStatement(query);
	long acc_number =Long.parseLong((String)request.getParameter("accno"));
	
	 st =con.createStatement();
	 rs=st.executeQuery("select max(sno)+1 from Banking_reg");
	while (rs.next()) {
		sno =rs.getInt(1);
	}
	
	
	String name =request.getParameter("name");
	String city =request.getParameter("city");
	String state =request.getParameter("state");
	String neft =request.getParameter("neft");
	ps.setInt(1, sno);
	ps.setLong(2, acc_number);
	ps.setString(3, name);
	ps.setString(4, city);
	ps.setString(5, state);
	ps.setString(6, neft);
	if(acc_count < 1){
	i = ps.executeUpdate();
	}
	else{
		%>
		<h1>This <%=request.getParameter("acc_number") %> already exist </h1>
		<% 
	}
	if(i>0){
	%>
	<h1>Inserted the values successfully well come <%=request.getParameter("name")%> </h1>
	<% 	
	}else{
		%>
		<h1> Values not inserted</h1>
		<%	
	}
	
}catch(Exception e){
	e.printStackTrace();
	out.write("Exception occured");
}

%>
</body>
</html>