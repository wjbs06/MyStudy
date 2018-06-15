<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	/* var a=1;
	
	switch (a) {
	case 1:
		alert("양수");
		break;
	case -1:
		alert("음수");
		break;
	case 0:
		alert("0");
		break;
	default:
		break;
	} */
</script>
</head>
<body>
	<h1>jstl 제어문</h1>
	<h2>조건문</h2>
	<c:set var="a" value="10"></c:set>
	<c:if test="${a gt 0 }">
		양수
		<c:if test="${a ge 0 }">
			0
		</c:if>	
		입니다
	</c:if>
	<c:if test="${a eq 0 }">
		0입니다
	</c:if>
	<c:if test="${a lt 0 }">
		음수입니다
	</c:if>
	<h2>choose문</h2>
	<c:choose>
		<c:when test="${a lt 0 }">음수</c:when>
		<c:when test="${a gt 0 }">양수</c:when>
		<c:otherwise>0</c:otherwise>
	</c:choose>
	
	<h2>반복문(for,while)</h2>
	<c:forEach begin="1" end="5" var="num">
		<p>d:${num }</p>
	</c:forEach>
	<%
		String[] msgs={"a","ab","abc","abcd","abcde"};
		pageContext.setAttribute("arr", msgs);
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		pageContext.setAttribute("arr", list);
		for(String temp:list){
			System.out.println(temp);
		}
	%>
	<h2>루프</h2>
		<ul>
	<c:forEach items="${arr }" var="msg" varStatus="status">
			<li>${status.last} : ${msg }</li>
	</c:forEach>
		</ul>
		
	<h2>루프</h2>
	<ul>
	<c:forTokens var="msg" items="${'java,web,db,framework' }" delims=",">
		<li>${msg }</li>
	</c:forTokens>
	</ul>
</body>
</html>