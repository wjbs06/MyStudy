<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="100%">
		<tr>
			<td colspan="6">
				<h1>성적관리프로그램(ver 0.6.0)</h1>
			</td>
		</tr>
		<tr bgcolor="#cccccc">
			<td>	</td>
			<td align="center" width="120" bgcolor="gray"><a href="../"><font color="#ffffff">HOME</font></a></td>
			<td align="center" width="120" bgcolor="gray"><a href="./list.jsp"><font color="#ffffff">전체보기</font></a></td>
			<td align="center" width="120" bgcolor="gray"><a href="./add.jsp"><font color="#ffffff">학생등록</font></a></td>
			<td align="center" width="120" bgcolor="gray"><a href="./edit.jsp"><font color="#ffffff">성적입력</font></a></td>
			<td>	</td>
		</tr>
		<tr>
		<td colspan="6" valign="top" align="center">
		<!-- content start -->
			<h1>성적 입력 페이지</h1>
			<form action="edit2.jsp">
			학번:
			<select name="num">
			<%
			String sql="SELECT NUM FROM STUDENT ORDER BY NUM";
			String driver="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@203.236.209.220:1521:xe";
			String id="scott";
			String pw="tiger";
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id,pw);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
			%>
			<option><%=rs.getInt(1) %></option>
			<%
			}
			}catch(Exception e){
				
			}finally{
			if(rs!=null){rs.close();}
			if(stmt!=null){stmt.close();}
			if(conn!=null){conn.close();}
			}
			%>
			</select>
			<input type="submit" value="선택">
			</form>
		<!-- content end -->
		</td>
		</tr>
	</table>
</body>
</html>