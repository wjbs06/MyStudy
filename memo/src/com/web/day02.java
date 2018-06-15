package com.web;

public class day02 {

	/*
	 * 
	 * 자바 웹 개발환경 설치 및 설정
	 * 
	 * 
	 * install new software
		juno
		web,xml,java ~~~
		
		이클립스 자바 EE 디벨롭 툴
		이클립스 자바 웹 디벨롭 툴
		이클립스 웹 디벨롭 툴
		자바스크립트 디벨롭 툴
		JST 서버 어댑터 확장
		
		설치
		
		개발환경 변경
		open perspective
	 *  JAVA EE로 변경
	 * window
		show view
		servers
		new server wizard
		아파치 톰캣7.3
		 browse 설치경로 정하고
		jre 자바 설치버전 피니쉬
	 * 
	 * 
	 * 플러스 데이터베이스 디벨롭 체크후 설치
	 * 데이터베이스 디벨롭 설치후
		데이터베이스 소스 익스플로러
		데이터베이스 커넥션 new
		오라클 선택후
		뉴 드라이브
		오라클 thin 드라이버 10버전
		자르 경로설정
		xe
		host ip
		계정 scott tiger
	 * 
	 * 
	 * 다이나믹 웹 프로젝트로 시작
	 * 
	 * 메모장 html 시작
	 * 
	 * ex02.html
	 * <html>
		<head>
		<!--문서의 정의 -->
			<title>제목</title>
		
		</head>
		<body>
		<!--문서상 보여지는 부분 -->	
		My Web Site
		<img src="https://s.pstatic.net/static/www/img/2017/sp_main_v171220.png">
		
		<h1>제&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목태그1</h1>
		<p><font size=3 face='궁서체' color='red'>내&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;용1<br></font>
		</p>
		
		내&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;용2<br>
		내용3<br>
		<h2>제목태그2</h2>
		내용
		<h3>제목태그3</h3>
		내용
		<h4>제목태그4</h4>
		내용
		<h5>제목태그5</h5>
		내용
		<h6>제목태그6</h6>
		내용	
		<hr>
		<hr>	
		</body>
	</html>
	 * 
	 * 
	 * 
	 * ex07.html
	 * <frameset rows="150,*">
			<frame src="top.html" noresize scrolling="no" frameborder="no">
			<frameset cols="200,*" noresize scrolling="no">
				<frame src="menu.html" frameborder="no">
				<frame name="main" src="main.html" frameborder="no">
			</frameset>
		</frameset>
	 * top.html
	 * <html>
		<body>
		<img height="80%" src="https://s.pstatic.net/static/www/img/2017/sp_main_v171220.png">
		</body>
		</html>
	 * menu.html
	 * <html>
		<body>
		<ul>
			<li><a href="main.html" target="main">HOME</li>
			<li><a href="ex01.html" target="main">menu2</li>
			<li><a href="ex02.html" target="main">menu3</li>
			<li><a href="ex07.html" target="main">menu4</li>
		</ul>
		</body>
		</html>
	 * main.html
	 * <html>
		<body>
		<h1>안녕하세요</h1>
		</body>
		</html>
	 * 
	 * ex08.html
	 * <html>
		<head>
		</head>
		<body>
			<table>
				<tr>
					<td colspan="2"><img src="imgs/top.jpg"></td>
				</tr>
				<tr>
					<td><img src="imgs/menu.jpg"></td>
					<td><img src="imgs/HOME.jpg"></td>
				</tr>
			</table>
		</body>
		</html>
	 * 
	 * ex11.html
	 * <html>
		<head>
		</head>
		<body>
			<marquee direction="right">유일한 동적 흐름</marquee>
			<h1>내부의 창</h1>
			<iframe name="main" frameborder="0" scrolling="no" src="ex01.html"></iframe>
			<a href="ex02.html" target="main">next</a>
		</body>
		</html>
	 * 
	 * 
	 * ex12.html
	 * <html>
		<head></head>
		<body>
			<h1>회원가입</h1>
			<form>
			id:<input type="text" size="10"><br>
			pw:<input type="password"><br>
			content<textarea rows="10" cols="20"></textarea><br>
			<input type="button" value="버튼"><br>
			<select>
				<option>item1</option>
				<option>item2</option>
				<option>item3</option>
				<option>item4</option>
				<option>item5</option>
			</select><br>
			
			<input type="checkbox">item1
			<input type="checkbox">item2
			<input type="checkbox">item3
		<br>
			<input type="radio" name="ra">item1
			<input type="radio" name="ra">item2
			<input type="radio" name="ra">item3
			</form>
		</body>
		</html>
	 * 
	 * 
	 * ex01.jsp
	 * <html>
		<head></head>
			<body>
				<h1>jsp page</h1>
				<%
				int a=9;
				for(int i=0;i<10;i++){
					out.println(a+"x"+i+"="+a*i+"<br>");
				}
				%>
			</body>
		</html>
	 * 
	 * 
	 */
	
	
	
	/*
	 * 이클립스 웹 개발
	 * 
	 * html잠깐 jsp
	 * <% %> 안에서 자바 사용
	 * ex05.jsp 
	 * <%@ page language="java" contentType="text/html; charset=EUC-KR"
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
	 * 
	 * 
	 * 
	 * 	<% //스크립트릿의 내장객체
		String addr=request.getRemoteAddr();
		System.out.println("addr:"+addr);
		String prot=request.getProtocol();
		System.out.println("protocol:"+prot);
		int port=request.getRemotePort();
		System.out.println("port:"+port);
		int port2=request.getLocalPort();
		System.out.println("port2:"+port2);
		String uri=request.getRequestURI();
		System.out.println("uri:"+uri);
		%>
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	 public void main(String[] args){
		 
	 }

}
