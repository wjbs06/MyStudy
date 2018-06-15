<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.bit.model.GuestBean" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL LIB</h1>
	<c:out value="agcvaslef"></c:out>
	<c:out value="12345"></c:out>
	<c:out value='${3.14+5 }' >ㅁㄴㅇㄻㄴㅇㄻㄴㅇㄹ</c:out>
	<c:out value='${null }'>메세지</c:out>
	<c:set var="msg" scope="page">java</c:set>
	msg=<c:out value="${pageScope.msg }">값이 없음</c:out>
	<c:set var="bean" value="<%=new GuestBean() %>"></c:set>
	<c:set target="${bean}" property="sabun" value="1234"></c:set>
	<c:set target="${bean}" property="name" value="root"></c:set>
	<c:set target="${bean}" property="nalja" value="<%= %>"></c:set>
	bean=<c:out value="${bean.sabun }"></c:out>
	bean=<c:out value="${bean.name }"></c:out>
	bean=<c:out value="${bean.nalja }"></c:out>
</body>
</html>