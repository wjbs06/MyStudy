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

<table class="table">
	<thead>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
			<th>금액</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${alist }" var="bean">
		<tr>
			<td><a href="detail.bit?idx=${bean.sabun}">${bean.sabun}</a></td>
			<td><a href="detail.bit?idx=${bean.sabun}">${bean.name}</a></td>
			<td><a href="detail.bit?idx=${bean.sabun}">${bean.nalja}</a></td>
			<td><a href="detail.bit?idx=${bean.sabun}">${bean.pay}</a></td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<a href="add.bit" role="btn" class="btn btn-primary">입력</a>
</body>
</html>