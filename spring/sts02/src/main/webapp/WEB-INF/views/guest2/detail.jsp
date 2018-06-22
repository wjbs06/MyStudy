<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="../">
        <p>비트교육센터</p>
      </a>
    </div>
    <ul class="nav navbar-nav">
  	  <li><a href="../">Home</a></li>
  	  <li><a href="../list.bit">Guest(30min)</a></li>
  	  <li><a href="list">Guest(2H)</a></li>
  	  <li><a href="#">Guest(~~)</a></li>
	</ul>
  </div>
</nav>

<div class="page-header">
	<h1>상세 페이지</h1>
</div>
	
<div class="well wells-sm">${bean.sabun }</div>
<div class="well wells-sm">${bean.name }</div>
<div class="well wells-sm">${bean.nalja }</div>
<div class="well wells-sm">${bean.pay }</div>

<div class="btn-group" role="group">
	<a href="edit?idx=${bean.sabun }" role="btn" class="btn btn-default">수정</a>
	<a href="delete?idx=${bean.sabun }" role="btn" class="btn btn-danger">삭제</a>
</div>
</body>
</html>