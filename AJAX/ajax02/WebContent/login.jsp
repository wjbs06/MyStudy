<%@ page import="java.sql.*" language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%><%
	Connection conn=null;
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String sql="select count(*) as cnt from guest30 where id=? and pw=?";
	int result=0;
	String msg="{\"root\":[{\"id\":\""
		+request.getParameter("id")+"\",\"result\":";
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url,"scott","tiger");
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, request.getParameter("id"));
		pstmt.setString(2, request.getParameter("pw"));
		ResultSet rs=pstmt.executeQuery();
		
		if(rs.next()){
			result=rs.getInt("cnt");
		}
	}finally{
		conn.close();
	}
	if(result>0){msg+="true";}else{msg+="false";}
	msg+="}]}";
	out.print(msg);
%>













