<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	int a=1234;
%>
<body>
	<h1>el문법</h1>
	<h2>${1+2+3+4+5 }</h2>
	<h3>${"문자열" }</h3>
	<h4>${true }</h4>
	<h2>${a }</h2>
	<h2>${'abcd' }</h2>
</body>
</html>