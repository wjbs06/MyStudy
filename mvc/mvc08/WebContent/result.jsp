<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>업로드 결과</h1>
	<p>성공:${result }</p>
	<a href="../guest/download.bit?file=${filename }&orgin=${name}">${filename }</a>
	<a href="../upload/${file }">${file }</a>
	<a href="../upload/${filename }">${filename }</a>
</body>
</html>