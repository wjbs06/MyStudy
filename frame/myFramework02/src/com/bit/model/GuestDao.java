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
	private final String DRIVER="oracle.jdbc.driver.OracleDriver";
	//crud
	private final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private final String ID="scott";
	private final String PASSWORD="tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public GuestDao() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER);
		conn=DriverManager.getConnection(URL,ID,PASSWORD);
	}
	
	public boolean isConnected() throws SQLException{
		boolean result=conn!=null;
		if(conn!=null)conn.close();
		
		return result;
	}
	
	public List<GuestVo> selectAll() throws SQLException{
		List<GuestVo> list=new ArrayList<GuestVo>();
		String sql="select * from guest";
		try{
			pstmt=conn.prepareStatement(sql);
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
			if(conn!=null)conn.close();
		}
		
		return list;
	}
	
	
	//add
	public void insertOne(GuestVo bean) throws SQLException{
		String sql="insert into guest values(?,?,sysdate,?)";
		
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bean.getSabun());
			pstmt.setString(2, bean.getName());
			pstmt.setInt(3, bean.getPay());
			pstmt.executeUpdate();
		}finally{
			if(conn!=null)conn.close();
		}
	}
	
	//detail
	public GuestVo selectOne(int pk) throws SQLException{
		String sql="select * from guest where sabun=?";
		GuestVo bean=new GuestVo();
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,pk);
			rs=pstmt.executeQuery();
			if(rs.next()){
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
			}
		}finally{
			if(conn!=null)conn.close();
		}
		
		return bean;
	}
	
	//update
	public int updateOne(GuestVo bean) throws SQLException{
		boolean result=false;
		int su=0;
		String sql="update guest set name=?,pay=? where sabun=?";
			
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setInt(2, bean.getPay());
			pstmt.setInt(3, bean.getSabun());
			su=pstmt.executeUpdate();
			if(su>0){
				result=true;
			}
		}finally{
			if(conn!=null)conn.close();
		}
		
		return su;
	}
	
	//del
	public boolean delOne(int pk) throws SQLException{
		boolean result=false;
		String sql="DELETE FROM GUEST WHERE SABUN=?";
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, pk);
			if(pstmt.executeUpdate()==1){
				result=true;
			}
		}finally{
			if(conn!=null)conn.close();
		}
		
		return result;
	}
}
