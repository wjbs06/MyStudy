<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="resources/css/jquery.mobile-1.4.5.css" rel="stylesheet" />
<script type="text/javascript" src="resources/js/cordova.js"></script>
<script type="text/javascript" src="resources/js/jquery-1.12.4.js"></script>
<!-- <script type="text/javascript" src="resources/js/jquery.mobile-1.4.5.js"></script> -->
<script type="text/javascript">
	function list(){
		jQuery.getJSON( 'resources/list.json', function(data){
			//root:[{},{}]
			var arr=data.guests;
			var msg="";
			for(var i=0;i<arr.length;i++){
				var bean=arr[i]
				msg+="<tr>";
				msg+="<td>"+bean.sabun+"</td>";
				msg+="<td>"+bean.name+"</td>";
				msg+="<td>"+bean.nalja+"</td>";
				msg+="<td>"+bean.pay+"</td>";
				msg+="</tr>";
			}
			$('tbody').html(msg);
		} )
	};
	$(document).ready(function(){
		list();
	});
</script>
</head>
<body>
	<h1>index page</h1>
	<table>
		<thead>
			<tr>
				<td>사번</td>
				<td>이름</td>
				<td>날짜</td>
				<td>금액</td>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
	
	
	<!-- <div data-role="page">
		<div data-role="header">
			<h1>test index page</h1>
		</div>
		<div data-role="content">
			
		</div>
		<div data-role="footer" data-position="fixed"></div>
	</div> -->
</body>
</html>