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
	<h1>header Ȯ��</h1>
	<%	
		Enumeration<String> en=request.getHeaderNames();
		while(en.hasMoreElements()){
			String key=en.nextElement();
			//System.out.println(en.nextElement());
			Enumeration<String> values=request.getHeaders(key);
			while(values.hasMoreElements()){
			out.println(key+":"+values.nextElement()+"<br>");
			}
		}
		String content=request.getHeader("Content");
		System.out.println(content);
	%>
</body>
</html>