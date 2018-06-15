<%@page import="com.sun.crypto.provider.HmacMD5"%>
<%@page import="com.sun.javafx.collections.MappingChange.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*, java.util.ArrayList,java.util.HashMap"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%
//db작업
	String keyword=request.getParameter("keyword");
	String search=request.getParameter("search");
	String sql="SELECT ROWNUM AS RN,SABUN,NAME,NALJA,PAY FROM GUEST";
	if(keyword!=null)sql+=" where "+search+" like '%"+keyword+"%'";
	
	String driver=application.getInitParameter("driver");
	String url=application.getInitParameter("url");
	String user=application.getInitParameter("user");
	String password=application.getInitParameter("password");
	
	ArrayList<HashMap> list=new ArrayList<HashMap>();
	
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){
			HashMap map=new HashMap();
			map.put("rn", rs.getInt(1));
			map.put("sabun", rs.getInt(2));
			map.put("name", rs.getString(3));
			map.put("nalja", rs.getDate(4));
			map.put("pay", rs.getInt(5));
			list.add(map);
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
%>
<body>
	<table width="80%" align="center">
		<tr>
			<td><img alt="logo" src="<%=application.getContextPath() %>/imgs/Desert.jpg" width="100"></td>
		</tr>
		<tr>
			<td align="center" bgcolor="#cccccc">
				<a href="<%=application.getContextPath()%>">[HOME]</a>
				<a href="<%=application.getContextPath()%>/guest/list.jsp">[GUEST]</a>
				<a href="#">[LOGIN]</a>
			</td>
		</tr>
		<tr>
			<td align="center">
				<h1>리스트페이지</h1>
				<hr>
				
				<table>
					<tr>
						<td>번호</td>
						<td>사번</td>
						<td>이름</td>
						<td>날짜</td>
						<td>금액</td>
						<td>삭제</td>
					</tr>
					<%
					for(int i=0;i<list.size();i++){
						HashMap hm=list.get(i);
					%>
					<form action="delete.jsp">
					<tr>
						<td><%=hm.get("rn") %></td>
						<td><%=hm.get("sabun") %></td>
						<td><a href="detail.jsp?sabun=<%=hm.get("sabun")%>"><%=hm.get("name") %></a></td>
						<td><%=hm.get("nalja") %></td>
						<td><%=hm.get("pay") %></td>
						<td>
						<input type="hidden" name="sabun" value="<%=hm.get("sabun") %>">
						<input type="submit" value="삭제">
						</td>
					</tr>
					</form>
					<%} %>
				</table>
				
				<hr>
				<form action="list.jsp">
				<select name="search">
					<option value="name">이름</option>
					<option value="sabun">사번</option>
				</select>
				<input type="text" name="keyword">
				<input type="submit" value="검색">
				</form>
				<hr>
				<a href="add.jsp">[입력]</a>
			</td>
		</tr>
		<tr>
			<td>
			Copyright &copy; 비트캠프 All rights reserved.
			</td>
		</tr>
	</table>
</body>
</html>