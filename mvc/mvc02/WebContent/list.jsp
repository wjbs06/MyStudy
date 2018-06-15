<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList,com.bit.model.GuestDto"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" src="css/960.css"/>
<style type="text/css">
	table {
		border-collapse: collapse;
		width:80%;
		margin:10px auto;
		border:1px solid gray;
	}
	table,th,td{
		border-bottom: 1px solid gray;
		text-align: center;
	}
	th{
		background-color: #ccc;
	}
	tr:hover{
		background-color: red;
	}
	td>a{
		display: block;
		text-decoration: none;
		color: gray;
	}
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">

</script>
<title>Insert title here</title>
</head>
<%
	ArrayList<GuestDto> list=(ArrayList<GuestDto>)request.getAttribute("alist");
%>
<body>
	<div class="container_12">
		<div id="header" class="grid_12">
			<img alt="logo" src="imgs/logo.jpg">
		</div>
		<div class="clear"></div>
		<div id="menu" class="grid_12">
			<a href="index.bit">HOME</a>
			<a href="list.bit">LIST</a>
			<a href="add.bit">ADD</a>
		</div>
		<div class="clear"></div>
		<div class="grid_12 content">
			<h1>리스트 페이지</h1>
			<table>
				<tr>
					<th>사번</th>
					<th>이름</th>
					<th>날짜</th>
					<th>금액</th>
				</tr>
				<%
				for(int i=0;i<list.size();i++){
					GuestDto bean=list.get(i);
				
				%>
				<tr>
					<td><a href="detail.bit?idx=<%=bean.getSabun() %>"><%=bean.getSabun() %></a></td>
					<td><a href="detail.bit?idx=<%=bean.getSabun() %>"><%=bean.getName() %></a></td>
					<td><a href="detail.bit?idx=<%=bean.getSabun() %>"><%=bean.getNalja() %></a></td>
					<td><a href="detail.bit?idx=<%=bean.getSabun() %>"><%=bean.getPay() %></a></td>
				</tr>
				<%}	%>
			</table>
		</div>	
		<div class="clear"></div>
		<div id="footer" class="grid_12">
		copytight &copy; 비트캠프
		</div>
		<div class="clear"></div>
	</div>
</body>
</html>
