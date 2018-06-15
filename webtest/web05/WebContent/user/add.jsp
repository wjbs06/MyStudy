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
				<h1>사원등록</h1>
				<form action="/web05/useradd.jsp">
					<p>사번<input type="text" name=sabun></p>
					<p>이름<input type="text" name=name></p>
					<input type="submit" value="등록">
					<input type="reset" value="취소">			
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