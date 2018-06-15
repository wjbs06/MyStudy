package com.day05.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyOracle {
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		String url="jdbc:oracle:thin:@203.236.209.220:1521:xe";
		String id="scott";
		String pw="tiger";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(url,id,pw);
	}
}
