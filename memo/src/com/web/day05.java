package com.web;

public class day05 {

	/*
	 * web05에서 사내 게시판만들기
		errpage="false";
		에러가 났을때 그 에러페이지로 가도록 설정
		
		계속 db설정을 안하기 위해 라이브러리를 만듬
		
		package com.mydb.ora;
		
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		
		public class MyOracle {
		
			public static Connection getConnection(){
				Connection conn=null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn=DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.220:1521:xe","scott","tiger");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return conn;
			}
				
		
		}
		
		작성하여 익스포트로 jar파일로 내보냄
		패키지.클래스.메서드
	 * 
	 * 위와 같은 방법이나
	 * 웹프로젝트 내에서 자바리소스 src에서 똑같이 생성하여 사용가능
	 * package com.day05.util;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		
		public class MyOracle {
			public static Connection getConnection() throws SQLException, ClassNotFoundException{
				String url="jdbc:oracle:thin:@203.236.209.220:1521:xe";
				String id="scott";
				String pw="tiger";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				return DriverManager.getConnection(url,id,pw);
			}
		}

	 * 
	 * 
	 * 문자검사
	 * 
	 * 	String sub=request.getParameter("sub");
		sub=sub.replace("<", "&lt;");
		sub=sub.replace(">", "&gt;");
		String content=request.getParameter("content");
		content=content.replace("<", "&lt;");
		content=content.replace(">", "&gt;");
		content=content.replace("\r\n", "\n");
		content=content.replace("\n", "<br>");
		content=content.replace(" ", "&nbsp;");
	 * 
	 * session.setAttribute("result", true);
	   session.setAttribute("sabun", sabun);
	 * 로그인을 유지할때 사용
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
	}

}
