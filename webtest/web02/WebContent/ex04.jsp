<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>구구단을 표에 넣어 출력하세요</h1>
	<table border="1">
	<%for(int i=2;i<10;i++){%>
		<tr>
			<td><%out.print(i);%>단</td>
			<%for(int j=1;j<10;j++) {%>
			<td><%out.print(i+"X"+j+"="+i*j);%></td>
			<%} %>
		</tr>
	<%} %>
	</table>
	<table border="1">
	<%for(int i=1;i<10;i++){%>
		<tr>
			<%for(int j=2;j<10;j++) {%>
			<td><%out.print(j+"X"+i+"="+i*j);%></td>
			<%} %>
		</tr>
	<%} %>
	</table>
	<table whidth="800" border="1" cellspacing="0">
	<tr>
	<%for (int i=2;i<10;i++){
		out.print("<td>"+i+"단</td>");
	}
	%>
	</tr>
	<%
	for(int i=1;i<10;i++){
		out.print("<tr>");
		for(int j=2;j<10;j++){
			out.print("<td>"+j+"X"+i+"="+j*i+"</td>");
		}
		out.print("</tr>");
	}
	%>
	</table>
</body>
</html>