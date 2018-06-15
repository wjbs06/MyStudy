<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>리스트 페이지</h1>
	<table>
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>날짜</td>
			<td>금액</td>
		</tr>
		<c:forEach items="${alist }" var="bean">
		<tr>
			<td>${bean.sabun}</td>
			<td>${bean.name}</td>
			<td>${bean.nalja}</td>
			<td>${bean.pay}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>