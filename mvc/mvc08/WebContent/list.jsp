<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import="java.util.List" %>
    <%@ page import="com.bit.model.entity.GuestDto" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	List<GuestDto> list=(List)request.getAttribute("alist");
%>
<body>
	<h1>비트교육센터</h1>
	<a href="../">HOME</a>
	<a href="./list.bit">LIST</a>
	<a href="./add.bit">ADD</a>
	<p>LIST</p>
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
			<th>금액</th>
		</tr>
		<%-- <c:forEach items="${alist }" var="bean"> 
		<tr>
			<td>${bean.sabun }</td>
			<td>${bean.name }</td>
			<td>${bean.nalja }</td>
			<td>${bean.pay }</td>
		</tr>
		</c:forEach>
		--%>
		<%for(GuestDto bean:list){ %>
		<tr>
			<td><a href="detail.bit?idx=<%=bean.getSabun()%>"><%=bean.getSabun() %></a></td>
			<td><a href="detail.bit?idx=<%=bean.getSabun()%>"><%=bean.getName() %></a></td>
			<td><a href="detail.bit?idx=<%=bean.getSabun()%>"><%=bean.getNalja() %></a></td>
			<td><a href="detail.bit?idx=<%=bean.getSabun()%>"><%=bean.getPay() %></a></td>
		</tr>
		<%} %>
	</table>
</body>
</html>