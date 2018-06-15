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
	int sabun=Integer.parseInt(request.getParameter("sabun"));
	String sql="delete from guest where sabun="+sabun;	
	
	String driver=application.getInitParameter("driver");
	String url=application.getInitParameter("url");
	String user=application.getInitParameter("user");
	String password=application.getInitParameter("password");
	
	Connection conn=null;
	Statement stmt=null;
	
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		stmt.executeUpdate(sql);
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	response.sendRedirect("list.jsp");
	%>
</body>
</html>