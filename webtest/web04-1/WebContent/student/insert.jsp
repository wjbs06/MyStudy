<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	int num=Integer.parseInt(request.getParameter("num").trim());
	String name=request.getParameter("name").trim();
	
	String sql="INSERT INTO STUDENT (NUM,NAME) VALUES("+num+",'"+name+"')";
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@203.236.209.220:1521:xe";
	String id="scott";
	String pw="tiger";
	Connection conn=null;
	Statement stmt=null;
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url,id,pw);		
		stmt=conn.createStatement();
		int cnt=stmt.executeUpdate(sql);
	}catch(Exception e){
		System.out.println("삽입 실패");
	}finally{
		if(stmt!=null){stmt.close();}
		if(conn!=null){conn.close();}
	}
	response.sendRedirect("./list.jsp");
%>
</body>
</html>