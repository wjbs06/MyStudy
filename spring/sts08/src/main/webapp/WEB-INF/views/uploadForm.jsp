<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" enctype="multipart/form-data" action="./insert">
	  file: <input type="file" name="file"><br/>
	  sabun: <input type="text" name="sabun"><br/>
	  <br/>
	  <input type="submit" value="업로드">
	</form>

</body>
</html>