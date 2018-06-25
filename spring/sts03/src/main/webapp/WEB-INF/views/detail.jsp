<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="template/header.jsp" %>
<script type="text/javascript">
	$(function(){
		$("input").hide();
		$("form:eq(0)>button").hide();
		$("#edit").click(function(){
			$(this).hide();
			$("input").show();
			$("form>button").show();
			$(".di").hide();
			$("#del").hide();
		});
		$("#del").submit(function(e){
			e.preventDefault();
			var result=window.confirm("삭제하시겠습니까?");
			if(result)return true;
			return false;
		});
	})
</script>
</head>
<body>
<%@ include file="template/menu.jsp" %>
<form method="post">
	<input type="hidden" name="_method" value="put" />
	<div class="form-group">
		<label for="sabun">sabun</label>
		<div class="well well-sm">${bean.sabun }</div>
		<input type="hidden" class="form-control" name="sabun" id="sabun" placeholder="sabun을 입력하세요"/>
	</div>
	<div class="form-group">
		<label for="name">name</label>
		<div class="well well-sm di">${bean.name }</div>
		<input type="text" class="form-control" name="sabun" id="name" placeholder="name을 입력하세요"/>
	</div>
	<div class="form-group">
		<label>nalja</label>
		<div class="well well-sm">${bean.nalja }</div>
	</div>
	<div class="form-group">
		<label for="pay">pay</label>
		<div class="well well-sm di">${bean.pay }</div>
		<input type="text" class="form-control" name="sabun" id="pay" placeholder="pay"/>
	</div>
	<button type="submit" class="btn btn-danger">수정</button>
	<button type="reset" class="btn btn-default">취소</button>
</form>
<button id="edit" class="btn btn-default">수정</button>
<form id="del" method="post" style="display: inline;">
	<input type="hidden" name="_method" value="delete" />
	<input type="hidden" name="idx" value="${bean.sabun }" />
	<button type="submit" class="btn btn-danger">삭제</button>
</form>
</body>
</html>