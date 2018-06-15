<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" src="css/960.css"/>
<style type="text/css">
	.content>form{
		width: 60%;
		margin: 10px auto 50px auto;
	}
	.content>form>div{
		text-align: center;
	}
	.content>form>div>button{
		margin: 10px 3px;
	}
	.content>form>div>label{
		width:30%;
		background-color: #ccc;
		display: inline-block;
		text-align: center;
	}
	.content>form>div>input{
		width:50%;
	}
	.err{
		color: red;
		font-style: italic;
		font-size: 9pt;
	}
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		$('.content>form').submit(function(){
			$('.err').remove();
			var result=true;
			$('form input').each(function(idx,ele){
				if($(ele).val()==''){
					$(this).after('<span class="err">비었음</span>');
					result=false;
				}
			});
			return result;
		});
		
		$('.content>form button').last().click(function(){
			window.history.back();
		});
	});
</script>
</head>
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
			<h1>입력페이지</h1>
			<form method="post">
				<div>
					<label for="name">이름</label><input type="text" name="name" id="name"/>
				</div>
				<div>
					<label for="pay">금액</label><input type="text" name="pay" id="pay"/>
				</div>
				<div>
					<button type="submit">입력</button>
					<button type="reset">취소</button>
					<button type="button">뒤로</button>
				</div>
			</form>		
		</div>	
		<div class="clear"></div>
		<div id="footer" class="grid_12">
		copytight &copy; 비트캠프
		</div>
		<div class="clear"></div>
	</div>
</body>
</html>