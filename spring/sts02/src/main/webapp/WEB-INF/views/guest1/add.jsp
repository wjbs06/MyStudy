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
      <a class="navbar-brand" href="./">
        <p>비트교육센터</p>
      </a>
    </div>
    <ul class="nav navbar-nav">
  	  <li><a href="./">Home</a></li>
  	  <li><a href="list.bit">Guest(30min)</a></li>
  	  <li><a href="bbs/list">Guest(2H)</a></li>
  	  <li><a href="#">Guest(~~)</a></li>
	</ul>
  </div>
</nav>

<div class="page-header">
	<h1>입력 페이지</h1>
</div>
	
<form action="insert.bit" method="post">
	<div class="form-group">
		<label for="sabun">sabun</label>
		<input type="text" class="from-control" name="sabun" id="sabun" placeholder="필수" />
	</div>
	<div class="form-group">
		<label for="name">name</label>
		<input type="text" class="from-control" name="name" id="name" placeholder="이름없음" />
	</div>
	<div class="form-group">
		<label for="pay">pay</label>
		<input type="text" class="from-control" name="pay" id="pay" placeholder="0" />
	</div>
	<button type="submit" class="btn btn-success">입력</button>
	<button type="reset" class="btn btn-default">취소</button>
</form>

</body>
</html>