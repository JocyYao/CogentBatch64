package com.demo.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/batch64?useSSL = false &allowPublicKeyRetrieval = true", 
					"root", "Gd919yds922");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}