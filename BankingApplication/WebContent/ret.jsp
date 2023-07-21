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
String query ="select * from Banking_reg";
Statement st = null; 
ResultSet rs =null;
%>

<%
Class.forName("com.mysql.cj.jdbc.Driver");
con= DriverManager.getConnection(url,user,password);
st = con.createStatement();
rs=st.executeQuery(query);
%>

<table border="1">
<tr>
<th>Sno</th>
<th>Account name</th>
<th>Acc No</th>
<th>City</th>
<th>State</th>
<th>Neft</th>
</tr>

<% 
while(rs.next()){
%>
<tr>
<td><%=rs.getInt(1) %> </td>
<td><%=rs.getLong(2)%> </td>
<td><%= rs.getString(3)%> </td>
<td><%=rs.getString(4) %> </td>
<td><%=rs.getString(5) %> </td>
<td><%=rs.getString(6) %> </td>
<td><a href="delete.jsp?sno=<%=rs.getInt(1)%>">Delete</a> </td>
<td><a href="update.jsp?sno=<%=rs.getInt(1)%>">Update</a> </td>
</tr>
<%	
	
}
rs.close();
st.close();
con.close();
%>



</table>

</body>
</html>