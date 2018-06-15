<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table width="100%" align="center">
	<tr>
		<td colspan="6" align="center">
			<h1>학생관리</h1>
		</td>
	</tr>
	<tr valign="top" align="center" bgcolor="#cccccc">
		<td width="20%"> </td>	
		<td width="100"><a href="../">HOME</a></td>
		<td width="100"><a href="./list.jsp">list</a></td>
		<td width="100"><a href="./add.jsp">학생등록</a></td>
		<td width="100"><a href="./update.jsp">점수입력</a></td>
		<td width="20%"> </td>
	</tr>
	<tr>
		<td colspan="6" align="center">
			<!-- 내용 시작 -->
			<h1>학생 목록</h1>
			
			<table border="1" width="80%">
				<tr>
					<th>학번</th>
					<th>이름</th>
					<th>국어</th>
					<th>영어</th>
					<th>수학</th>
					<th>삭제</th>
				</tr>
				<%
				String sql="SELECT NUM,NAME,KOR,ENG,MATH FROM STUDENT ORDER BY NUM";
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
				<tr>
					<td><%=rs.getInt(1) %></td>
					<td><%=rs.getString(2) %></td>
					<td><%=rs.getInt(3) %></td>
					<td><%=rs.getInt(4) %></td>
					<td><%=rs.getInt(5) %></td>
					<td align="center">
					<form action="delete.jsp">
					<input type="hidden" name="num" value="<%=rs.getInt(1) %>">
					<input type="submit" value="삭제" >
					</form>
					</td>
				</tr>				
				<%
				}
				}catch(Exception e){
					System.out.println("리스트오류");
				}finally{
					if(rs!=null){rs.close();}
					if(stmt!=null){stmt.close();}
					if(conn!=null){conn.close();}
				}
				%>	
			</table>
			
			<!-- 내용 끝 -->
		</td>
	</tr>
</table>
</body>
</html>