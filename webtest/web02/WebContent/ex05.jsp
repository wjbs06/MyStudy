<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   <%//디렉티브 - 클래스밖 %>
 <%@ page import="java.util.Date"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%! //선언부 클래스안,메서드 밖
	public int func01(int a,int b){
		//System.out.println(a*b);
		return a*b;
	}
%>
<body>
<% //스크립트릿 - 선언부 내부
	Date date=new Date();
	out.println(date+"<br>");
	//표현식 밑에 <%= 
%>
<%=date %>
	<table whidth="800" border="1" cellspacing="0">
	<tr>
	<%for (int i=2;i<10;i++){
		out.print("<td>"+i+"단</td>");
	}
	%>
	</tr>
	<%
	for(int i=1;i<10;i++){
		out.print("<tr>");
		for(int j=2;j<10;j++){
			out.print("<td>"+j+"X"+i+"="+func01(j,i)+"</td>");
		}
		out.print("</tr>");
	}
	%>
	</table>
</body>
</html>