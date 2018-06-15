<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*,oracle.jdbc.driver.OracleDriver"%>
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
				<p><a href="#">방명록</a></p>
				<p><a href="#">등등</a></p>
			</td>
			<td>
			<!-- 내용 들어갈 부분 -->
			<%
			String param=request.getParameter("empno");
			String sql="select * from emp where empno="+param;
			String url="jdbc:oracle:thin:@203.236.209.220:1521:xe";
			String id="scott";
			String pw="tiger";
			
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			try{
			new OracleDriver();
			
			conn=DriverManager.getConnection(url,id,pw);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			if(rs.next()){
			%>
			<h1>수정</h1>
			<form action="page8.jsp">
				<table>
				<tr>
				<td width="150" bgcolor="#ccccccc">사번</td>
				<td><input type="text" name="empno" value="<%=rs.getInt(1) %>"></td>
				</tr>
				<tr>
				<td width="150" bgcolor="#ccccccc">사원명</td>
				<td><%=rs.getString(2) %></td>
				</tr>
				<tr>
				<td width="150" bgcolor="#ccccccc">직책</td>
				<td><%=rs.getString(3) %></td>
				</tr>
				<tr>
				<td width="150" bgcolor="#ccccccc">직속상관</td>
				<td><%=rs.getInt(4) %></td>
				</tr>
				<tr>
				<td width="150" bgcolor="#ccccccc">입사일</td>
				<td><%=rs.getDate(5) %></td>
				</tr>
				<tr>
				<td width="150" bgcolor="#ccccccc">연봉</td>
				<td><input type="text" name="sal" value="<%=rs.getInt(6) %>"></td>
				</tr>
				<tr>
				<td width="150" bgcolor="#ccccccc">성과금</td>
				<td><input type="text" name="comm" value="<%=rs.getInt(7) %>"></td>
				</tr>
				<tr>
				<td width="150" bgcolor="#ccccccc">부서번호</td>
				<td><%=rs.getInt(8) %></td>
				</tr>
				<tr>
				<td colspan="2">
					<input type="submit" value="수정">
					<input type="reset" value="취소">
				</td>
				</tr>
				</table>
				</form>
			<%
			}
			}catch(Exception e){
				out.println("잠시후 재접속바랍니다");
			}finally{
				if(rs!=null){rs.close();}
				if(stmt!=null){stmt.close();}
				if(conn!=null){conn.close();}
			}
			%>
			</td>
		</tr>
	</table>
	
</body>
</html>