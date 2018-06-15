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
				int sabun=Integer.parseInt(request.getParameter("sabun"));
				String name=request.getParameter("name");
				
				String sql="select count(*) from bbs_user where sabun="+sabun+"and name='"+name+"'";
				int cnt=0;
				Connection conn=MyOracle.getConnection();
				try{
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()){
						cnt=rs.getInt(1);
					}
				}finally{
					conn.close();
				}
				if(cnt>0){
					session.setAttribute("result", true);
					session.setAttribute("sabun", sabun);
					//application.setAttribute("result", true);
					//application.setAttribute("sabun", sabun);
				}
				%>
				<br><br><br>
		</tr>
		<tr>
			<td bgcolor="#cccccc">
			 비트캠프
			</td>
		</tr>
	</table>
</body>
</html>