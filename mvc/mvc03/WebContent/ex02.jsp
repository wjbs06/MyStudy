<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int su=100;
		//String msg=request.getParameter("msg");
	%>
	<h1>ex02 page</h1>
	<%@ include file="ex03.jsp" %>
	<h2>중간</h2>
	<jsp:include page="ex03.jsp">
		<jsp:param value="<%=su %>" name="num"/>
	</jsp:include>
	<p>ex02page<%=request.getParameter("msg") %></p>
</body>
</html>