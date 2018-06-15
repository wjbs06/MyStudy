<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="oracle.jdbc.driver.OracleDriver"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="800" align="center">
		<tr>
			<td colspan="2">
				<a href="ex08.jsp"><img alt="logo" src="imgs/logo.jpg" width="200"></a>
			</td>
		</tr>
		<tr>
			<td width="150" height="600" bgcolor="#9999ff">
				<p><a href="page1.jsp">인사말</a></p>
				<p><a href="page2.jsp">오시는길</a></p>
				<p><a href="page3.jsp">게시판</a></p>
				<p><a href="page4.jsp">방명록</a></p>
				<p><a href="#">등등</a></p>
			</td>
			<td>
			<!-- 내용 들어갈 부분 -->
			<h1>게시판</h1>
			<table width="80%" border="1" cellspacing="0">
				<tr>
					<td>사원번호</td>
					<td>사원명</td>
					<td>연봉</td>
					<td>입사일</td>
				</tr>
				
				<%
				String url="jdb:oracle:thin:@203.236.209.220:1521:xe";
				String id="scott";
				String pw="tiger";
				
				oracle.jdbc.driver.OracleDriver driver=null;
				driver=new oracle.jdbc.driver.OracleDriver();
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				try{
					conn=DriverManager.getConnection(url,id,pw);
					stmt=conn.createStatement();
					rs=stmt.executeQuery("SELECT EMPNO,ENAME,SAL,HIREDATE FROM EMP");
					while(rs.next()){
				%>
				<tr>
					<td><a href="page4.jsp?empno=<%=rs.getInt(1) %>"><%=rs.getInt(1) %></a></td>
					<td><%=rs.getString(2) %></td>
					<td><%=rs.getInt(3) %></td>
					<td><%=rs.getDate(4) %></td>
				</tr>
				<%
					}
				}catch(Exception e){
					System.out.print("오류났음");
				}finally{
					if(rs!=null){rs.close();}
					if(stmt!=null){stmt.close();}
					if(conn!=null){conn.close();}
				}
				
				
				%>
				
			</table>
			<a href="page5.jsp">입력</a>
			</td>
		</tr>
	</table>
	
</body>
</html>