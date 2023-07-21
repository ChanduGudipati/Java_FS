package com.sai.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
private static Connection conn =null;
	static {
		String url ="jdbc:mysql://localhost:3306/digit";
		String user ="root";
		String db_password ="Divyansh@21";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, db_password);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return conn;
	}
}
