package com.web;

public class day09 {
	/*
	 * 
	 * create sequence bbs_seq start
	 * 시퀀스 생성
	 * 
	 * 이전과 다르게 html과 java 분리시작 DAO 객체사용
	 * package com.day08.dao;
		
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.util.ArrayList;
		
		import com.day08.bean.BbsBean;
		
		public class BbsDao {
			//DAO객체
			private final String DRIVER="oracle.jdbc.driver.OracleDriver";
			private final String URL="jdbc:oracle:thin:@203.236.209.220:1521:xe";
			private final String USER="scott";
			private final String PASSWORD="tiger";
			private Connection conn;
			private PreparedStatement pstmt;
			private ResultSet rs;
			
			public ArrayList<BbsBean> getBbsList(){
				
				ArrayList<BbsBean> list=new ArrayList<BbsBean>();
				
				String sql="SELECT NUM,SABUN,SUB,NALJA FROM BBS ORDER BY NUM DESC";
				try{
					Class.forName(DRIVER);
					conn=DriverManager.getConnection(URL,USER,PASSWORD);
					pstmt=conn.prepareStatement(sql);
					rs=pstmt.executeQuery();
					while(rs.next()){
						BbsBean bean=new BbsBean();
						bean.setNalja(rs.getDate("nalja"));
						bean.setNum(rs.getInt("num"));
						bean.setSabun(rs.getInt("sabun"));
						bean.setSub(rs.getString("sub"));
						list.add(bean);
					}
				}catch(Exception e){
					e.printStackTrace();
				}finally{
						try {
							if(rs!=null)rs.close();
							if(pstmt!=null)pstmt.close();
							if(conn!=null)conn.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
				
				return list;
			}
			
			public int getTot(){
				int cnt=0;
				String sql="SELECT COUNT(*) FROM BBS";
				try{
					Class.forName(DRIVER);
					conn=DriverManager.getConnection(URL,USER,PASSWORD);
					pstmt=conn.prepareStatement(sql);
					rs=pstmt.executeQuery();
					while(rs.next()){
						cnt=rs.getInt("count(*)");
					}
				}catch(Exception e){
					e.printStackTrace();
				}finally{
					try {
						if(rs!=null)rs.close();
						if(pstmt!=null)pstmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return cnt;
			}
			
			public void insert(int sabun,String sub,String content){
				String sql="insert into bbs values(bbs_seq.nextval,?,sysdate,?,?)";
				try{
					Class.forName(DRIVER);
					conn=DriverManager.getConnection(URL,USER,PASSWORD);
					pstmt=conn.prepareStatement(sql);
					pstmt.setInt(1, sabun);
					pstmt.setString(2, sub);
					pstmt.setString(3, content);
					pstmt.executeUpdate();
				}catch(Exception e){
					e.printStackTrace();
				}finally{
					try {
						if(pstmt!=null)pstmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
