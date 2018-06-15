package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.entity.GuestVo;

public class GuestDao {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public GuestDao() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub
		Class.forName(driver);
		conn=DriverManager.getConnection(url,user,password);
	}
	
	public List<GuestVo> selectAll() throws SQLException {
		// TODO Auto-generated method stub
		List<GuestVo> list=new ArrayList<GuestVo>();
		
		String sql="SELECT * FROM GUEST ORDER BY SABUN";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()){
			list.add(new GuestVo(rs.getInt("sabun"),
					rs.getString("name"),
					rs.getDate("nalja"),
					rs.getInt("pay")));
			
		}
		
		return list;
	}

}
