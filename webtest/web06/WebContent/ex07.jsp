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
	String id=session.getId();
	long time=session.getCreationTime();
	long time2=session.getLastAccessedTime();
	java.util.Date date=new java.util.Date(time);
	java.util.Date date2=new java.util.Date(time2);
	session.setAttribute("msg", "asdasdwq123");
	String msg2=(String)session.getAttribute("msg2");
	
	System.out.println(session.getMaxInactiveInterval());
	%>
	<h1>세션객체</h1>
	<p>id:<%=id %></p>
	<p>date:<%=date %></p>
	<p>date2:<%=date2 %></p>
	<p>msg2:<%=msg2 %></p>
	<a href="ex08.jsp">next</a>		
</body>
</html>