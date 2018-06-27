<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<form method="POST" enctype="multipart/form-data" action="./upload">
		  File: <input type="file" name="upfile"><br/>
		  sabun: <input type="text" name="sabun"><br/>
		  <br/>
		  <input type="submit" value="업로드"> 
		</form>
	</body>
</html>
