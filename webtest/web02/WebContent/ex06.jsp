<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%!
	public void func01(){
	
	}
%>
<body>
	<% //스크립트릿의 내장객체
	String addr=request.getRemoteAddr();
	System.out.println("addr:"+addr);
	String prot=request.getProtocol();
	System.out.println("protocol:"+prot);
	int port=request.getRemotePort();
	System.out.println("port:"+port);
	int port2=request.getLocalPort();
	System.out.println("port2:"+port2);
	String uri=request.getRequestURI();
	System.out.println("uri:"+uri);
	%>
</body>
</html>