<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
	<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		var msg=$('div').text();
		
	})
</script>
</head>
<body>
	<h1>jstl core 외</h1>
	<c:set var="money" value="100000000"></c:set>

	<div>
	<fmt:formatNumber value="${money }" pattern="0,000,000"></fmt:formatNumber>
	</div>
	<c:out value="${money }"></c:out>
	<h2>날짜</h2>
	<%
		Date dat=new Date();
	pageContext.setAttribute("dat", dat);
	%>
	<c:out value="${dat }"></c:out>
	<fmt:formatDate value="${dat }" pattern="YYYY-mm-dd HH:MM:SS"/>
</body>
</html>