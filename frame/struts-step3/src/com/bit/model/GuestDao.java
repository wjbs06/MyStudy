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
	private String driver="oracle.jdbc.driver.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="scott";
	private String password="tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public GuestDao() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		conn=DriverManager.getConnection(url,user,password);
	}
	
	private void close() throws SQLException{
		if(conn!=null)conn.close();
	}
	
	public List<GuestVo> queryList(String sql,Object ... objs) throws SQLException{
		List<GuestVo> list=new  ArrayList<GuestVo>();
		try{
		pstmt=conn.prepareStatement(sql);
		for(int i=0;i<objs.length;i++){
			pstmt.setObject(i+1, objs[i]);
		}
		rs=pstmt.executeQuery();
		while(rs.next()){
			list.add(new GuestVo(
					rs.getInt("sabun")
					,rs.getString("name")
					,rs.getDate("nalja")
					,rs.getInt("pay")
					));
		}
		}finally{
			this.close();
		}
		return list;
	}
	
	public GuestVo selectOne(int idx) throws SQLException{
		String sql="SELECT * FROM GUEST WHERE SABUN=?";
		
		return queryList(sql,idx).get(0);
	}
	
	public List<GuestVo> selectAll() throws SQLException{
		String sql="SELECT * FROM GUEST ORDER BY SABUN DESC";

		return queryList(sql);
	}

	
}
