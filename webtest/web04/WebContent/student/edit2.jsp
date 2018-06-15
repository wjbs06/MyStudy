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
			<%
			String param=request.getParameter("num");
			int num=Integer.parseInt(param);
			String sql="SELECT NAME,KOR,ENG,MATH,NUM FROM STUDENT WHERE NUM="+num;
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
			if(rs.next()){
			%>
			<form action="update.jsp">
			<table>
			<tr>
				<td>학번</td>
				<td><%=request.getParameter("num") %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=rs.getString(2) %></td>
			</tr>
			<tr>
				<td>국어</td>
				<td><input type="text" name="kor" value="<%=rs.getInt(2) %>">
					<%
					String erridx=request.getParameter("err");
					String errMsg=request.getParameter("errmsg");
					//if(errid.equals("0")) 순서가 바뀌면 오류가 뜰수 있음
					if("0".equals(erridx)){
						if("1".equals(errMsg)){
						out.print("<font color='red'>0~100까지의 값만 가능합니다</font>");
						}else if("2".equals(errMsg)){
							out.print("<font color='red'>값이 비었습니다</font>");
						}else if("3".equals(errMsg)){
							out.print("<font color='red'>숫자만 입력하세요</font>");
						}
					}
					%>
				</td>
			</tr>
			<tr>
				<td>영어</td>
				<td><input type="text" name="eng" value="<%=rs.getInt(3) %>">
				<%
				if("1".equals(erridx)){
					if("1".equals(errMsg)){
					out.print("<font color='red'>0~100까지의 값만 가능합니다</font>");
					}else if("2".equals(errMsg)){
						out.print("<font color='red'>값이 비었습니다</font>");
					}else if("3".equals(errMsg)){
						out.print("<font color='red'>숫자만 입력하세요</font>");
					}
				}
					%>
				</td>
			</tr>
			<tr>
				<td>수학</td>
				<td><input type="text" name="math" value="<%=rs.getInt(4) %>">
				<%
				if("2".equals(erridx)){
					if("1".equals(errMsg)){
					out.print("<font color='red'>0~100까지의 값만 가능합니다</font>");
					}else if("2".equals(errMsg)){
						out.print("<font color='red'>값이 비었습니다</font>");
					}else if("3".equals(errMsg)){
						out.print("<font color='red'>숫자만 입력하세요</font>");
					}
				}
					%>
				</td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="hidden" name="num" value="<%=rs.getInt(5)%>">
				<input type="submit" value="선택">
				</td>
			</tr>
			</table>
			</form>
			<%
			}
			}catch(Exception e){
				
			}finally{
			if(rs!=null){rs.close();}
			if(stmt!=null){stmt.close();}
			if(conn!=null){conn.close();}
			}
			%>
		<!-- content end -->
		</td>
		</tr>
	</table>
</body>
</html>