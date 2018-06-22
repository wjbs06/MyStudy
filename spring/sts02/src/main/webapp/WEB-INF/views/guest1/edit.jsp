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
	<h1>수정 페이지</h1>
</div>
<div class="container">
<form action="update.bit" method="post" class="from-horizontal">
<div class="form-group">
	<label for="sabun" class="col-sm-2">sabun</label>
	<div class="well wells-sm com-sm-10">${bean.sabun }</div>
	<div class="form-control">
	<input type="hidden" value="${bean.sabun }" name="sabun" id="sabun" />
	</div>
</div>
<div class="form-group">
	<label for="name" class="col-sm-2">name</label>
	<div class="well wells-sm">${bean.name }</div>
	<div class="form-control com-sm-10">
	<input type="text" value="${bean.name}" name="name" id="name" />
	</div>
</div>
<div class="form-group">
	<label for="nalja" class="col-sm-2">nalja</label>
	<div class="well wells-sm com-sm-10">${bean.nalja }</div>
</div>
<div class="form-group">
	<label for="pay" class="col-sm-2">pay</label>
	<div class="well wells-sm">${bean.pay }</div>
	<div class="form-control com-sm-10">
	<input type="text" value="${bean.pay}" name="pay" id="pay"/>
	</div>
</div>
<div class="form-group">
<div class="col-sm-offset-2 col-sm-10">
	<button type="submit" class="btn btn-danger">수정</button>
	<button type="reset" class="btn btn-default">취소</button>
	</div>
</div>
</form>
</div>

</body>
</html>