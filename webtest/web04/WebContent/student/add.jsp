<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
		<h1>학생등록 페이지</h1>
		<form action="./insert.jsp">
		<p>
			학번:<input type="text" name="num">
		</p>
		<p>
			이름:<input type="text" name="name">
		</p>
		<p>
			<input type="submit" value="등록"">
			<input type="reset" value="취소">
		</p>					
		</form>
		<!-- content end -->
		</td>
		</tr>
	</table>
</body>
</html>