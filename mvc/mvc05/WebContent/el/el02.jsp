<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>el의 문법</h1>
	<p>el 표현식</p>
	<table>
		<tr>
			<th>연산</th><th>java</th><th>el</th>
		</tr>
		<tr>
			<td>숫자</td>
			<td><%=1234+4321 %></td>
			<td>${1234+4321 }</td>
		</tr>
		<tr>
			<td>문자열</td>
			<td><%="java" %></td>
			<td>${'java' }</td>
		</tr>
		<tr>
			<td>불린</td>
			<td><%=false %></td>
			<td>${false }</td>
		</tr>
		<tr>
			<td>불린</td>
			<td><%=4==4 %></td>
			<td>${4==4 }</td>
		</tr>
		<tr>
			<td>null</td>
			<td><%String msg=null;
				out.println(msg);
			%></td>
			<td>${null }</td>
		</tr>
		<tr>
			<td>eq</td>
			<td><%=3==3 %></td>
			<td>${3 eq 3 }</td>
		</tr>
		<tr>
			<td>2&lt;3</td>
			<td></td>
			<td>${2 lt 3 }</td>
		</tr>
		<tr>
			<td>2&gt;3</td>
			<td></td>
			<td>${2 gt 3 }</td>
		</tr>
		<tr>
			<td>2<=3</td>
			<td></td>
			<td>${2 le 3 }</td>
		</tr>
		<tr>
			<td>2>=3</td>
			<td></td>
			<td>${2 ge 3 }</td>
		</tr>
		<tr>
			<td>5/2</td>
			<td><%=5/2 %></td>
			<td>${5 div 2 }</td>
		</tr>
		<tr>
			<td>5%2</td>
			<td><%=5%2 %></td>
			<td>${5 mod 2 }</td>
		</tr>
	</table>
</body>
</html>