package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil {
	private static final String URL = "jdbc:mysql://localhost:3306/abc_travels";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "MySQL@213";

	public static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
}