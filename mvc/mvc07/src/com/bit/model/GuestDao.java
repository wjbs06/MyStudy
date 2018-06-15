package com.bit.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.bit.model.entity.GuestDto;



/*
<Resource
name="jdbc/oracle"
type="javax.sql.DataSource"
driverClassName="oracle.jdbc.driver.OracleDriver"
url="jdbc:oracle:thin:@localhost:1521:xe"
username="scott" password="tiger"
minIdle="10" maxIdle="100" maxActive="50" maxWain="6000"
/>
*/
public class GuestDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public GuestDao() {
		try {
			InitialContext icntxt=new InitialContext();
			//Context cntxt=(Context) icntxt.lookup("java:/comp/env");
			//DataSource source=(DataSource) cntxt.lookup("jdbc/oracle");
			DataSource source=(DataSource) icntxt.lookup("java:/comp/env/jdbc/oracle");
			conn=source.getConnection();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<GuestDto> selectAll() throws SQLException{
		List<GuestDto> list=new ArrayList<GuestDto>();
		String sql="SELECT * FROM GUEST ORDER BY SABUN DESC";
		try{
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				GuestDto bean=new GuestDto();
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
				list.add(bean);
			}
		}finally{
			if(conn!=null)conn.close();
			if(pstmt!=null)pstmt.close();
			if(rs!=null)rs.close();
		}
		return list;
	}
}
