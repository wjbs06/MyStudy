<%@page import="java.util.Enumeration"%>
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
		String rootPath=application.getContextPath();
		String msg1=application.getInitParameter("msg1");
		String msg2=application.getInitParameter("msg2");
		String msg3=application.getInitParameter("msg3");
		java.util.Enumeration<String> enu=application.getInitParameterNames();
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
		String info=application.getServerInfo();
		System.out.println(info);
		System.out.println(application.getMajorVersion());
		System.out.println(application.getMinorVersion());
	%>
	<h1><%=msg1 %></h1>
	<h1><%=msg2 %></h1>
	<h1><%=msg3 %></h1>
	<img src="<%=rootPath %>/imgs/Desert.jpg">
</body>
</html>