<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*,com.day05.util.MyOracle"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="800" align="center">
		<tr>
			<td align="center">
			 <img src="/web05/imgs/Lighthouse.jpg" width="300">
			</td>
		</tr>
		<tr>
			<td bgcolor="#cccccc" align="center">
				<a href="/web05/index.jsp">HOME</a>
				<a href="/web05/user/list.jsp">사원목록</a>
				<a href="/web05/bbs/list.jsp">게시판</a>
				<a href="/web05/login/form.jsp">로그인</a>
			</td>
		</tr>
		<tr>
			<td valign="top" align="center">
			<%
			
			int num=Integer.parseInt(request.getParameter("idx"));
			
			String name="";
			String sub="제목없음";
			String content="";
			Date nalja=null;
			
			String sql="select num,sub,(select name from bbs_user B where B.sabun=A.sabun) as name,nalja,content from bbs A where num="+num;
			Connection conn=MyOracle.getConnection();
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				if(rs.next()){
					num=rs.getInt(1);
					sub=rs.getString(2);
					name=rs.getString(3);
					nalja=rs.getDate(4);
					content=rs.getString(5);
				}
			}finally{
				conn.close();				
			}
			content=content.replace("<", "&lt;");
			content=content.replace(">", "&gt;");
			content=content.replace("\r\n", "\n");
			content=content.replace("\n", "<br>");
			content=content.replace(" ", "&nbsp;");
			%>
				<h1><%=num %>번 글 상세보기</h1>
				<table width="80%">
					<tr>
						<td bgcolor="#cccccc">제목</td>
						<td colspan="3"><%=sub %></td>
					</tr>
					<tr>
						<td bgcolor="#cccccc">글쓴이</td>
						<td><%=name %></td>
						<td bgcolor="#cccccc">날짜</td>
						<td><%=nalja %></td>
					</tr>
					<tr>
						<td colspan="4" bgcolor="#cccccc">내용</td>
					</tr>
					<tr>
						<td colspan="4"><%=content %></td>
					</tr>
				</table>
				<br><br><br>
			</td>
		</tr>
		<tr>
			<td bgcolor="#cccccc">
			 비트캠프
			</td>
		</tr>
	</table>
</body>
</html>