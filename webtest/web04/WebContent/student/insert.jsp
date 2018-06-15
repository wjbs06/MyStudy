<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.net.ConnectException"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	String param1=request.getParameter("num");
	String param2=request.getParameter("name");
	
	for(int i=0;i<param1.length();i++){
		char temp=param1.charAt(i);
		if(!Character.isDigit(temp)){
			response.sendRedirect("add.jsp");
			return;			
		}
	}
	if(param2.length()<2||param2.length()>12){
		response.sendRedirect("add.jsp");
		return;
	}
	int num=Integer.parseInt(param1);
	String name=param2.trim();
		
	String sql="insert into STUDENT (num,name) values("+num+",'"+name+"')";
	String url="jdbc:oracle:thin:@203.236.209.220:1521:xe";
	String id="scott";
	String pw="tiger";
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=null;
	Statement stmt=null;
	try{
	conn=DriverManager.getConnection(url,id,pw);
	stmt=conn.createStatement();
	int cnt=stmt.executeUpdate(sql);
	if(cnt>0){
		response.sendRedirect("/web04/");
	}else{
		response.sendRedirect("add.jsp");
	}
	}catch(Exception e){
		System.out.println("학생등록 오류");
		response.sendRedirect("add.jsp");
	}finally{
		stmt.close();
		conn.close();		
	}
	%>
</body>
</html>