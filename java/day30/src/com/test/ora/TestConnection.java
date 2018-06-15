package com.test.ora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class TestConnection {

	
	public static void main(String[] args) {
		
		OracleDriver ora = new OracleDriver();
		System.out.println("ojdbc14연동");
		if(ora==null){
			System.out.println("실패");
		}else{
			System.out.println("성공");
		}
		System.out.println("오라클접속");
		//oracle: jdbc:oracle:thin:@ip주소:리스터포트:sid
		//mysql:  jdbc:mysql://ip주소:3306/
		//java db: jdbc:derby:testdb;create=true
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Properties info=new Properties();
		info.put("user","scott");
		info.put("password","tiger");
		try {
			Connection conn=DriverManager.getConnection(url,info);
			System.out.println("성공");	
			conn.close();
		} catch (SQLException e) {
			System.out.println("실패");
			e.printStackTrace();
		}
		
		
	}

}
