package com.web;

public class day03 {

	/*
	 * 
	 * ex02.sjp
	 * 	<%
		String method=request.getMethod();
		System.out.println(method);
		String msg1=request.getParameter("id");
		String msg2=request.getParameter("pw");
		%>
		<h1>param: <%=msg1 %></h1>
		<h1>param: <%=msg2 %></h1>
	 * 
	 * ex03.jsp
	 * 	<%
			//http 1.0 get post
			get
				장점 : 빠르다
				단점 : 주소노출, 제약 많음(길이,특수문자), 한글처리
			post
				장점 : 주소감춤, 길이 제한 X
				단점 : get보다 느리다
		
		%>
		<h1>폼페이지</h1>
		<form action="ex02.jsp" method="post">
			id:<input type="text" name="id"><br>
			pw:<input type="password" name="pw"><br>
			<input type="submit" value="전달">
		</form>
	 * 
	 * ex04.jsp
		<h1>전달 페이지</h1>
			<form action="ex05.jsp">
				<table>
					<tr>		
						<td>텍스트필드1</td>
						<td><input type="hidden" name="param1" value="msg" readonly="readonly"></td>
					</tr>
					<tr>		
						<td>텍스트필드2</td>
						<td><input type="password" name="param2" value="msg2"></td>
					</tr>
					<tr>		
						<td>리스트</td>
						<td>
							<select name="param3" multiple="multiple" size="2">
								<optgroup label="다음 중 선택하세요">
								<option value="i1">item1</option>
								<option value="i2">item2</option>
								<option value="i3">item3</option>
								<option value="i4">item4</option>
								</optgroup>
							</select>
						</td>
					</tr>	
					<tr>		
						<td>라디오박스</td>
						<td>
							<input type="radio" name="ra" value="ra1" checked="checked">radio1
							<input type="radio" name="ra" value="ra2">radio2
							<input type="radio" name="ra" value="ra3">radio3
							<input type="radio" name="ra" value="ra4">radio4
						</td>
					</tr>
					<tr>		
						<td>체크박스</td>
						<td>
							<input type="checkbox" name="box" value="ch1">check1
							<input type="checkbox" name="box" value="ch2">check2
							<input type="checkbox" name="box" value="ch3">check3
							<input type="checkbox" name="box" value="ch4">check4
						</td>
					</tr>
					<tr>		
						<td>텍스트박스</td>
						<td>
							<textarea name="content" rows="7" cols="15"></textarea>
						</td>
					</tr>
					<tr>		
						<td colspan="2" align="center">
							<input type="submit" value="전송">
							<input type="button" value="버튼">
							<input type="reset" value="취소">
						</td>
					</tr>
				</table>
			</form>
	 * 
	 * 
	 * ex05.jsp
		<%
		Enumeration<String> names=request.getParameterNames();
		while(names.hasMoreElements()){
			//System.out.println(names.nextElement());
			String paramName=(String)names.nextElement();
			String[] values=request.getParameterValues(paramName);
			for(int i=0;i<values.length;i++){
				values[i]=values[i].replace("\r\n", "<br>");
			out.println("<h1>"+paramName+":"+values[i]+"</h1>");
			}
		}
		
		Map<String,String[]> map=request.getParameterMap();
		Set<String> key=map.keySet();
		Iterator<String> ite=key.iterator();
		while(ite.hasNext()){
			String pnm=ite.next();
			System.out.println(pnm+":"+request.getParameter(pnm));
		}
		
			//String msg1=request.getParameter("param1");
			//String msg2=request.getParameter("param2");
			//String msg3=request.getParameter("param3");
		%>
	 * 
	 * ex06.jsp
	 * 	<h1>header 확인</h1>
		<%	
			Enumeration<String> en=request.getHeaderNames();
			while(en.hasMoreElements()){
				String key=en.nextElement();
				//System.out.println(en.nextElement());
				Enumeration<String> values=request.getHeaders(key);
				while(values.hasMoreElements()){
				out.println(key+":"+values.nextElement()+"<br>");
				}
			}
			String content=request.getHeader("Content");
			System.out.println(content);
		%>
	 * 
	 * ex07.jsp
	 * 	<h1>response 객체</h1>
		<%
		out.println("출력");
		Writer myOut=response.getWriter();
		myOut.write("전달");
		%>
	 * 
	 * ex08.jsp
	 * 	<table width="800" align="center">
			<tr>
				<td colspan="2">
					<a href="ex08.jsp"><img alt="logo" src="imgs/logo.jpg" width="200"></a>
				</td>
			</tr>
			<tr>
				<td width="150" height="600" bgcolor="#9999ff">
					<p><a href="page1.jsp">인사말</a></p>
					<p><a href="page2.jsp">오시는길</a></p>
					<p><a href="page3.jsp">게시판</a></p>
					<p><a href="#">방명록</a></p>
					<p><a href="#">등등</a></p>
				</td>
				<td>
				<!-- 내용 들어갈 부분 -->
				<h1>환영합니다</h1>
				
				</td>
			</tr>
		</table>
	 * 
	 * page1.jsp
	 * <table width="800" align="center">
		<tr>
			<td colspan="2">
				<a href="ex08.jsp"><img alt="logo" src="imgs/logo.jpg" width="200"></a>
			</td>
		</tr>
		<tr>
			<td width="150" height="600" bgcolor="#9999ff">
				<p><a href="page1.jsp">인사말</a></p>
				<p><a href="page2.jsp">오시는길</a></p>
				<p><a href="page3.jsp">게시판</a></p>
				<p><a href="#">방명록</a></p>
				<p><a href="#">등등</a></p>
			</td>
			<td>
			<!-- 내용 들어갈 부분 -->
			<h1>환영합니다</h1>
			
			내용 블라블라
			</td>
		</tr>
	</table>
	 * 
	 * page2.jsp
	 * 	<table width="800" align="center">
			<tr>
				<td colspan="2">
					<a href="ex08.jsp"><img alt="logo" src="imgs/logo.jpg" width="200"></a>
				</td>
			</tr>
			<tr>
				<td width="150" height="600" bgcolor="#9999ff">
					<p><a href="page1.jsp">인사말</a></p>
					<p><a href="page2.jsp">오시는길</a></p>
					<p><a href="page3.jsp">게시판</a></p>
					<p><a href="#">방명록</a></p>
					<p><a href="#">등등</a></p>
				</td>
				<td>
				<!-- 내용 들어갈 부분 -->
				<h1>환영합니다</h1>
					<img alt="map" src="imgs/map.jpg" width="300" height="300">
				</td>
			</tr>
		</table>
	 * 
	 * page3.jsp
	 * <table width="800" align="center">
			<tr>
				<td colspan="2">
					<a href="ex08.jsp"><img alt="logo" src="imgs/logo.jpg" width="200"></a>
				</td>
			</tr>
			<tr>
				<td width="150" height="600" bgcolor="#9999ff">
					<p><a href="page1.jsp">인사말</a></p>
					<p><a href="page2.jsp">오시는길</a></p>
					<p><a href="page3.jsp">게시판</a></p>
					<p><a href="page4.jsp">방명록</a></p>
					<p><a href="#">등등</a></p>
				</td>
				<td>
				<!-- 내용 들어갈 부분 -->
				<h1>게시판</h1>
				<table width="80%" border="1" cellspacing="0">
					<tr>
						<td>사원번호</td>
						<td>사원명</td>
						<td>연봉</td>
						<td>입사일</td>
					</tr>
					
					<%
					String url="jdb:oracle:thin:@203.236.209.220:1521:xe";
					String id="scott";
					String pw="tiger";
					
					oracle.jdbc.driver.OracleDriver driver=null;
					driver=new oracle.jdbc.driver.OracleDriver();
					
					Connection conn=null;
					Statement stmt=null;
					ResultSet rs=null;
					try{
						conn=DriverManager.getConnection(url,id,pw);
						stmt=conn.createStatement();
						rs=stmt.executeQuery("SELECT EMPNO,ENAME,SAL,HIREDATE FROM EMP");
						while(rs.next()){
					%>
					<tr>
						<td><a href="page4.jsp?empno=<%=rs.getInt(1) %>"><%=rs.getInt(1) %></a></td>
						<td><%=rs.getString(2) %></td>
						<td><%=rs.getInt(3) %></td>
						<td><%=rs.getDate(4) %></td>
					</tr>
					<%
						}
					}catch(Exception e){
						System.out.print("오류났음");
					}finally{
						if(rs!=null){rs.close();}
						if(stmt!=null){stmt.close();}
						if(conn!=null){conn.close();}
					}
					
					
					%>
					
				</table>
				<a href="page5.jsp">입력</a>
				</td>
			</tr>
		</table>
	 * 
	 * page4.jsp
	 * <table width="800" align="center">
			<tr>
				<td colspan="2">
					<a href="ex08.jsp"><img alt="logo" src="imgs/logo.jpg" width="200"></a>
				</td>
			</tr>
			<tr>
				<td width="150" height="600" bgcolor="#9999ff">
					<p><a href="page1.jsp">인사말</a></p>
					<p><a href="page2.jsp">오시는길</a></p>
					<p><a href="page3.jsp">게시판</a></p>
					<p><a href="#">방명록</a></p>
					<p><a href="#">등등</a></p>
				</td>
				<td>
				<!-- 내용 들어갈 부분 -->
				<%
				String param=request.getParameter("empno");
				String sql="select * from emp where empno="+param;
				String url="jdbc:oracle:thin:@203.236.209.220:1521:xe";
				String id="scott";
				String pw="tiger";
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				try{
				new OracleDriver();
				
				conn=DriverManager.getConnection(url,id,pw);
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				if(rs.next()){
				%>
				<h1>상세보기</h1>
					<table>
					<tr>
					<td width="150" bgcolor="#ccccccc">사번</td>
					<td><%=rs.getInt(1) %></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">사원명</td>
					<td><%=rs.getString(2) %></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">직책</td>
					<td><%=rs.getString(3) %></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">직속상관</td>
					<td><%=rs.getInt(4) %></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">입사일</td>
					<td><%=rs.getDate(5) %></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">연봉</td>
					<td><%=rs.getInt(6) %></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">성과금</td>
					<td><%=rs.getInt(7) %></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">부서번호</td>
					<td><%=rs.getInt(8) %></td>
					</tr>
					</table>
					<a href="page7.jsp?empno=<%=rs.getInt(1) %>">수정</a>
				<%
				}
				}catch(Exception e){
					out.println("잠시후 재접속바랍니다");
				}finally{
					if(rs!=null){rs.close();}
					if(stmt!=null){stmt.close();}
					if(conn!=null){conn.close();}
				}
				%>
				</td>
			</tr>
		</table>
	 * 
	 * page5.jsp
	 * <table width="800" align="center">
			<tr>
				<td colspan="2">
					<a href="ex08.jsp"><img alt="logo" src="imgs/logo.jpg" width="200"></a>
				</td>
			</tr>
			<tr>
				<td width="150" height="600" bgcolor="#9999ff">
					<p><a href="page1.jsp">인사말</a></p>
					<p><a href="page2.jsp">오시는길</a></p>
					<p><a href="page3.jsp">게시판</a></p>
					<p><a href="#">방명록</a></p>
					<p><a href="#">등등</a></p>
				</td>
				<td>
				<!-- 내용 들어갈 부분 -->
				<h1>입력페이지</h1>
				<form action="page6.jsp">
					<table>
					<tr>
						<td>사번</td>
						<td><input type="text" name="empno"></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><input type="text" name="ename"></td>
					</tr>
					<tr>
						<td>직책</td>
						<td>
							<select name="job">
							<%
							//sql="select distinct job from emp where job<>'PRESIDENT'"
							%>
								<option>CLERK</option>
								<option>SALESMAN</option>
								<option>MANAGER</option>
								<option>ANALYST</option>
							</select>					
						</td>
					</tr>
					<tr>
						<td>직속상관</td>
						<td><input type="text" name="mgr" value="7839" readonly="readonly"></td>
					</tr>
					<tr>
						<td>연봉</td>
						<td><input type="text" name="sal"></td>
					</tr>
					<tr>
						<td>부서번호</td>
						<td>
						<%//sql="select deptno from dept" %>
							<select name="deptno">
								<option value="10">accounting</option>
								<option value="20">research</option>
								<option value="30">sales</option>
								<option value="40">operations</option>
							</select>
						</td>
					</tr>
					<tr>
						<td colspan="2">
						<input type="submit" value="입력">
						<input type="reset" value="취소">
						</td>
					</tr>
					</table>
				</form>
				</td>
			</tr>
		</table>
	 * 
	 * page6.jsp
	 * 	<table width="800" align="center">
			<tr>
				<td colspan="2">
					<a href="ex08.jsp"><img alt="logo" src="imgs/logo.jpg" width="200"></a>
				</td>
			</tr>
			<tr>
				<td width="150" height="600" bgcolor="#9999ff">
					<p><a href="page1.jsp">인사말</a></p>
					<p><a href="page2.jsp">오시는길</a></p>
					<p><a href="page3.jsp">게시판</a></p>
					<p><a href="#">방명록</a></p>
					<p><a href="#">등등</a></p>
				</td>
				<td>
				<!-- 내용 들어갈 부분 -->
				<%
				int empno=Integer.parseInt(request.getParameter("empno"));
				String ename=request.getParameter("ename");
				String job=request.getParameter("job");
				int mgr=Integer.parseInt(request.getParameter("mgr"));
				int sal=Integer.parseInt(request.getParameter("sal"));
				int deptno=Integer.parseInt(request.getParameter("deptno"));
					String sql="insert into emp (empno,ename,job,mgr,hiredate,sal,deptno)";
				sql+="values("+empno+",'"+ename+"','"+job+"',"+mgr+",sysdate,"+sal+","+deptno+")";
				Connection conn=null;
				Statement stmt=null;
				
				try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.220:1521:xe","scott","tiger");
				stmt=conn.createStatement();
				int cnt=stmt.executeUpdate(sql);
				
				if(cnt>0){
					//out.println("<h1>입력완료</h1>");
					response.sendRedirect("page3.jsp");
				}else{
					out.println("<h1>입력실패</h1>");
				}
				}catch(ClassNotFoundException e){
					System.out.println("드라이버 jar파일 문제 확인 요망");
					out.println("<h1>입력실패</h1>");
				}catch(SQLException e){
					System.out.println("접속실패(url,id,pw)확인요망");
					out.println("<h1>잠시 후 재시도 바랍니다</h1>");
				}finally{
					stmt.close();
					conn.close();
				}
				%>			
				</td>
			</tr>
		</table>
	 * 
	 * page7.jsp
	 * <table width="800" align="center">
			<tr>
				<td colspan="2">
					<a href="ex08.jsp"><img alt="logo" src="imgs/logo.jpg" width="200"></a>
				</td>
			</tr>
			<tr>
				<td width="150" height="600" bgcolor="#9999ff">
					<p><a href="page1.jsp">인사말</a></p>
					<p><a href="page2.jsp">오시는길</a></p>
					<p><a href="page3.jsp">게시판</a></p>
					<p><a href="#">방명록</a></p>
					<p><a href="#">등등</a></p>
				</td>
				<td>
				<!-- 내용 들어갈 부분 -->
				<%
				String param=request.getParameter("empno");
				String sql="select * from emp where empno="+param;
				String url="jdbc:oracle:thin:@203.236.209.220:1521:xe";
				String id="scott";
				String pw="tiger";
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				try{
				new OracleDriver();
				
				conn=DriverManager.getConnection(url,id,pw);
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				if(rs.next()){
				%>
				<h1>수정</h1>
				<form action="page8.jsp">
					<table>
					<tr>
					<td width="150" bgcolor="#ccccccc">사번</td>
					<td><input type="text" name="empno" value="<%=rs.getInt(1) %>"></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">사원명</td>
					<td><%=rs.getString(2) %></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">직책</td>
					<td><%=rs.getString(3) %></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">직속상관</td>
					<td><%=rs.getInt(4) %></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">입사일</td>
					<td><%=rs.getDate(5) %></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">연봉</td>
					<td><input type="text" name="sal" value="<%=rs.getInt(6) %>"></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">성과금</td>
					<td><input type="text" name="comm" value="<%=rs.getInt(7) %>"></td>
					</tr>
					<tr>
					<td width="150" bgcolor="#ccccccc">부서번호</td>
					<td><%=rs.getInt(8) %></td>
					</tr>
					<tr>
					<td colspan="2">
						<input type="submit" value="수정">
						<input type="reset" value="취소">
					</td>
					</tr>
					</table>
					</form>
				<%
				}
				}catch(Exception e){
					out.println("잠시후 재접속바랍니다");
				}finally{
					if(rs!=null){rs.close();}
					if(stmt!=null){stmt.close();}
					if(conn!=null){conn.close();}
				}
				%>
				</td>
			</tr>
		</table>
	 * 
	 * page8.jsp
	 * 	<%
		String empno=request.getParameter("empno");
		String sal=request.getParameter("sal");
		String comm=request.getParameter("comm");
		
		String sql="update emp set sal="+sal+",comm="+comm+" where empno="+empno;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.220:1521:xe","scott","tiger");
		Statement stmt=conn.createStatement();
		stmt.executeQuery(sql);
		
		conn.close();
		//rs=stmt.executeQuery(sql);
		
		response.sendRedirect("page4.jsp?empno="+empno);
		%>
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
