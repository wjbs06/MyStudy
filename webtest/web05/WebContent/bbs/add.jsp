<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="com.day05.util.MyOracle, java.sql.*" errorPage="../err.jsp"%>
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
				<h1>입력페이지</h1>
				<form action="../bbsadd.jsp">
				<table align="center">
					<tr>
						<td bgcolor="#cccccc">제목</td>
						<td><input type="text" name="sub" size="45"></td>
					</tr>
					<tr>
						<td bgcolor="#cccccc">사번</td>
						<td><input type="text" value="<%=application.getAttribute("sabun") %>" name="sabun" size="45" readonly="readonly"></td>
					</tr>
					<tr>
						<td colspan="2">
						<textarea rows="5" cols="55" name="content"></textarea>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="작성">
							<input type="reset" value="취소">
						</td>
					</tr>
				</table>
				</form>
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