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
				<h1>성적관리프로그램(ver 0.6.)</h1>
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
		<h1>학생성적 목록</h1> 
		<table width="80%" border="1" cellspaing="0">
			<tr>
				<th width="50">학번</th>
				<th>이름</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
				<th width="80">삭제</th>
			</tr>	
			<%
			String url="jdbc:oracle:thin:@203.236.209.220:1521:xe";
			String id="scott";
			String pw="tiger";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			try{
				conn=DriverManager.getConnection(url,id,pw);
				stmt=conn.createStatement();
				rs=stmt.executeQuery("SELECT NUM,NAME,KOR,ENG,MATH FROM STUDENT ORDER BY NUM");
				while(rs.next()){
			%>
			<tr>
				<td><%=rs.getInt(1) %></td>
				<td><%=rs.getString(2) %></td>
				<td><%=rs.getInt(3) %></td>
				<td><%=rs.getInt(4) %></td>
				<td><%=rs.getInt(5) %></td>
				<td>
					<form action="delete.jsp" method="POST">
						<input type="hidden" name="num" value="<%=rs.getInt(1) %>">
						<input type="submit" value="삭제">
					</form>
				</td>
			</tr>		
			<%
				}
			}catch(Exception e){
				System.out.println("list page 오류");
			}finally{
				rs.close();
				stmt.close();
				conn.close();
			}
			%>
		</table>		
		<!-- content end -->
		</td>
		</tr>
	</table>
</body>
</html>