<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	//session.invalidate(); 세션 객체 갱신
	String id=session.getId();
	session.setAttribute("msg", "zxc1234");
	%>
	<h1><%=id %></h1>
	<h1><%=session.getCreationTime() %></h1>
	<h1><%=session.getAttribute("msg") %></h1>
</body>
</html>