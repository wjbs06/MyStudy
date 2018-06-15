<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>jsp 연습하기</h1>
	<%
	int a=9;
	for(int i=0;i<10;i++){
		out.println(i+"*"+a+"="+i*a);
		System.out.println(a*i);
	}
	%>
</body>
</html>