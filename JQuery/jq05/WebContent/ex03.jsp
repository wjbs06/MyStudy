<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	header>h1{
		float: left;
	}
	header>div{
		width: 300px
	}
</style>

<script type="text/javascript">
	var form,xhr,msg,inputs;
	function result(){
		if(xhr.readyState==4&&xhr.status==200){
			msg=xhr.responseText;
			form.outerHTML='<div>'+msg+'</div>';
		}
	}
	function myAjax(a,b){
		xhr=new XMLHttpRequest();
		xhr.onreadystatechange=result;
		xhr.open('get','result.jsp?id='+a+'&pw='+b,true);
		xhr.send();
	}
	window.onload=function(){
		form=document.querySelector('header>form');
		inputs=document.querySelectorAll('header>form input');
		form.addEventListener('submit',function(e){
			e.preventDefault(false);
			myAjax(inputs[0].value,inputs[1].value);
		});
	};
</script>

</head>
<body>
<header>
	<h1>비트교육센터</h1>
	<form action="result.jsp">
		<label for="id">id</label><input type="text" name="id" id="id"/>
		<label for="pw">pw</label><input type="password" name="pw" id="pw"/>
		<button type="submit">로그인</button> 
	</form>
</header>
<nav>

</nav>
<section>
</section>
<footer>

</footer>
</body>
</html>