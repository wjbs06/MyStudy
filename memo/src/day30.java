
public class day30 {

	/*맨밑에 db명령어 있음
	 * db를 자바에 연동
	 * 프로젝트 생성시에 next 라이브러리에 external jar로 
	 * C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib 해당주소에 있는
	 * ojdbc14.jar 를 연동한다.
	 * 
	 * 
	 * //oracle: jdbc:oracle:thin:@ip주소:리스터포트:sid
		//mysql:  jdbc:mysql://ip주소:3306/
		//java db: jdbc:derby:testdb;create=true
		String url="jdbc:oracle:thin:@localhost:1521:xe";
	 * 
		package com.test.ora;
		
		import java.awt.BorderLayout;
		import java.awt.Button;
		import java.awt.Choice;
		import java.awt.Frame;
		import java.awt.GridLayout;
		import java.awt.Label;
		import java.awt.Panel;
		import java.awt.TextField;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.awt.event.WindowAdapter;
		import java.awt.event.WindowEvent;
		import java.lang.Thread.State;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
		import java.util.Arrays;
		import java.util.Properties;
		
		import oracle.jdbc.driver.OracleDriver;
		
		public class Ex01 extends Frame implements ActionListener{
			Choice cho=new Choice();
			Button btn1;
			Button btn2;
			Button btn3;
			Button btn4;
			Properties info=new Properties();
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			Label[] vls;
			TextField[] tfs;
			
			public Ex01(){
				super("학생성적관리프로그램(ver.0.5.0)");
				addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						dispose();
					}
				});
				
				OracleDriver ora=new OracleDriver();
				info.put("user","scott");
				info.put("password","tiger");
				
				String sql="SELECT NUM FROM STUDENT ORDER BY NUM";
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				try {
					conn=DriverManager.getConnection(url,info);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					
					while(rs.next()){
						int su=rs.getInt(1);
						cho.addItem(su+"");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally{
					try {
						if(rs!=null){rs.close();}
						if(stmt!=null){stmt.close();}
						if(conn!=null){conn.close();}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				setLayout(new BorderLayout());
				Panel top=new Panel();
				btn1=new Button("선택");
				btn2=new Button("종료");
				btn3=new Button("입력");
				
				btn1.addActionListener(this);
				btn2.addActionListener(this);
				btn3.addActionListener(this);
				
				top.add(cho);
				top.add(btn1);
				top.add(btn3);
				top.add(btn2);
		
				Panel center=new Panel(new GridLayout(6,2));
				Label[] lbs=new Label[6];
				vls=new Label[6];
				tfs=new TextField[5];
				
				String[] msg={"학번","이름","국어","영어","수학","합계"};
				for (int i = 0; i < lbs.length; i++) {
					lbs[i]=new Label(msg[i]);
					lbs[i].setAlignment(Label.CENTER);
					vls[i]=new Label();
					if(i==5){break;}
					tfs[i]=new TextField(15);
				}
				Panel[] ps=new Panel[6];
				for (int i = 0; i < 6; i++) {
					ps[i]=new Panel();
				}
				for (int i = 0; i < 6; i++) {
					ps[i].add(vls[i]);
					if(i==5){
						btn4=new Button("입력");
						btn4.addActionListener(this);
						ps[i].add(btn4);
						btn4.setVisible(false);
					}else{
					ps[i].add(tfs[i]);
					tfs[i].setVisible(false);
					}
				}
				for (int i = 0; i < 6; i++) {
					center.add(lbs[i]);
					center.add(ps[i]);
				}
				
				add(center,BorderLayout.CENTER);
				add(top,BorderLayout.NORTH);		
				setBounds(900,100,400,500);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex01();
			}
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn2){
					dispose();
				}else if(e.getSource()==btn1){
					for (int i = 0; i < 5; i++) {
						tfs[i].setVisible(false);
						vls[i].setVisible(true);
					}
					vls[5].setVisible(true);
					btn4.setVisible(false);
					System.out.println(cho.getSelectedItem()+"선택");
					OracleDriver ora=new OracleDriver();
					Connection conn=null;
					Statement stmt=null;
					ResultSet rs=null;
					try {
						conn=DriverManager.getConnection(url,info);
						stmt=conn.createStatement();
						rs=stmt.executeQuery("select * from student where num="+cho.getSelectedItem());
						
						if(rs.next()){
							int num=rs.getInt(1);
							String name=rs.getString(2);
							int kor=rs.getInt(3);
							int eng=rs.getInt(4);
							int math=rs.getInt(5);
							int tot=kor+eng+math;
							vls[0].setText(num+"");
							vls[1].setText(name);
							vls[2].setText(kor+"");
							vls[3].setText(eng+"");
							vls[4].setText(math+"");
							vls[5].setText(tot+"");
							vls[0].revalidate();
							vls[1].revalidate();
							vls[2].revalidate();
							vls[3].revalidate();
							vls[4].revalidate();
							vls[5].revalidate();
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}finally{
						try {
							if(rs!=null){rs.close();}
							if(stmt!=null){stmt.close();}
							if(conn!=null){conn.close();}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					
				}else if(e.getSource()==btn3){
					for (int i = 0; i < tfs.length; i++) {
						vls[i].setVisible(false);
						tfs[i].setVisible(true);
						tfs[i].revalidate();
					}
					vls[5].setVisible(false);
					btn4.setVisible(true);
					btn4.revalidate();
				}else if(e.getSource()==btn4){
					//insert into student values(18004,'test',69,68,67);
					String sql="insert into student values("+tfs[0].getText()+",'"+
					tfs[1].getText()+"',"+tfs[2].getText()+","+tfs[3].getText()+","+tfs[4].getText()+");";
					System.out.println(sql);
					OracleDriver ora=new OracleDriver();
					Connection conn=null;
					Statement stmt=null;
					try {
						conn=DriverManager.getConnection(url,info);
						stmt=conn.createStatement();
						int result=stmt.executeUpdate(sql);
						System.out.println(result+"개의 행이 업데이트");
						if(result>0){
							cho.addItem(tfs[0].getText());
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}finally{
						try {
							stmt.close();
							conn.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}
		
		}

	 * 
	 * 
	 * cmd db로 시작
	 * edit ex02.sql 로 텍스트파일로 저장
	 * ed ex02.sql 도 가능
	 * start ex02.sql 로 실행
	 * @ ex02.sql 도 가능
	 * save ex02.sql 로 실행한 쿼리 저장가능
	 * get ex04.sql; 실행한 파일 내용 조회
	 * spool 파일이름
	 * spool off 로 사이에 작성한 내용 저장
	 * 
	 * run 은 바로전에 했던 쿼리 재실행
	 *   /    바로전에 했던 쿼리 재실행
	 * list   마지막에 시행한 쿼리 목록
	 * li     마지막에 시행한 쿼리 목록
	 * 
	 * create table ex02(
		num number,
		name varchar2(30)
		);
	 * 
	 * 
	 * 
	 * drop table ex03;
		create table ex03(
		num number,
		name varchar2(30)
		);
		insert into ex03 values(1,'test1');
		insert into ex03 values(2,'test2');
		insert into ex03 values(3,'test3');
		insert into ex03 values(4,'test4');
		insert into ex03 values(5,'test5');
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 	 * cmd db로 시작
	 * edit ex02.sql 로 텍스트파일로 저장
	 * ed ex02.sql 도 가능
	 * start ex02.sql 로 실행
	 * @ ex02.sql 도 가능
	 * save ex02.sql 로 실행한 쿼리 저장가능
	 * get ex04.sql; 실행한 파일 내용 조회
	 * spool 파일이름
	 * spool off 로 사이에 작성한 내용 저장
	 * column 컬렴명 format A10; 보이는 컬럼사이즈만 줄임
	 * column num foramt 9,999,999,999;
	 * set heading off 위의 목차제거
	 * 
	 * select sum(sal) from emp;
	 * select avg(sal) from emp;
	 * select max(sal) from emp;
	 * select min(sal) from emp;
	 * 
	 * select sum(sal) as 합 from emp where ename like '%A%';
	 * select sum(sal) from emp group by deptno;
	 * select deptno,sum(sal) from emp where ename like '%A%' group by deptno;
	 * select deptno,sum(sal),count(sal) from emp group by deptno;
	 * select deptno,sum(sal),count(sal) from emp where sal<1800 group by deptno;
	 * select deptno,sum(sal),count(sal) from emp group by deptno having avg(sal)<1800;
	 * 
	 * select ename,sal,comm,sal+comm as 연봉 from emp;
	 * 더미
	 * select 아무거나 from dual;
	 * select '오늘날짜는 '||sysdate||'입니다'from dual;    || 연산연산자
	 * select round(3.14) from dual;
	 * select floor(3.14) from dual;
	 * select 5/2,floor(5/2),mod(5,2) from dual;
	 * select round(3.14,1) from dual; 두번째 인자는 소수점자릿수
	 * select trunc(5678.5678,2) from dual;
	 * select trunc(5678.5678,-2) from dual;
	 * select lower('ABCDE') from dual;
	 * select upper('ABCDE') from dual;
	 * select concat('java','oracle') from dual;
	 * select lengh('한글') from dual;
	 * select lenghB('한글') from dual;
	 * select substr('JavaDbWebFramework',4,2) from dual; /Db
	 * select substrb('JavaDbWebFramework',4,2) from dual; /Db
	 * select substr('자바디비웹',3,2) from dual; /디비
	 * select substrb('자바디비웹',7,6) from dual; /디비 한글 byte는 3씩
	 * select instr('abcdef','bc')from dual; 위치 찾기
	 * select instrB('abcdef','bc')from dual; 위치 찾기
	 * select instr('자바디비웹','디비')from dual; 위치 찾기
	 * select instrb('자바디비웹','디비')from dual; 위치 찾기
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
