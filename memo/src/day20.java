
public class day20 {

	/*
	 * AWT 자바의 UI
	 * 
	 *
	 *package com.bit.am;
		
		import java.awt.Button;
		import java.awt.Frame;
		import java.awt.Panel;
		
		public class Ex01 {
		
			
			public static void main(String[] args) {
				java.awt.Frame f=new Frame();
				
				Panel p =new Panel();
				
				java.awt.Button btn=new Button();
				Button btn2=new Button();
				
				
				btn.setLabel("btn01");
				btn2.setLabel("btn02");
				
				p.add(btn);
				p.add(btn2);
				
				f.add(p);
				btn.setVisible(true);
				f.setSize(400, 300);//창크기
				f.setLocation(500, 300);//위치
				
				
				f.setVisible(true);//화면에 보여줄것인가
			}
		
		}

	 *
	 *
	 *
	 *package com.bit.am;
		
		import java.awt.Frame;
		import java.awt.Label;
		import java.awt.Panel;
		import java.awt.Scrollbar;
		import java.awt.TextArea;
		import java.awt.TextField;
		
		public class Ex04 extends Frame{
			public Ex04(){
				Panel p=new Panel();
				Label la1=new Label("제목");
				TextField tf1=new TextField("제목없음",15);//글자수
				Label la2=new Label("id");
				TextField tf2=new TextField();
				tf2.setColumns(5);
				tf2.setText("id입력");
				Label la3=new Label("pw");
				TextField tf3=new TextField(6);
				tf3.setEchoChar('&');
				
				TextArea ta1=new TextArea("",3,6,TextArea.SCROLLBARS_BOTH); //String text, int rows, int columns, int scrollbars(숫자에 따라 스크롤이 다름)
														
				p.add(la1);
				p.add(tf1);
				p.add(la2);
				p.add(tf2);
				p.add(la3);
				p.add(tf3);
				p.add(ta1);
				add(p);
				setSize(300, 200);
				setLocation(1000,100);
				setVisible(true);
			}
			
			public static void main(String[] args) {
				new Ex04();
		
			}
		
		}

	 *
	 *
	 *package com.bit.am;

		import java.awt.Choice;
		import java.awt.Frame;
		import java.awt.Label;
		import java.awt.Panel;
		import java.util.Date;
		
		public class Ex06 extends Frame{
			public Ex06(){
				Panel p =new Panel();
				Label la = new Label("년월일");
				Choice cho1=new Choice();
				
				long time=System.currentTimeMillis();
				Date day=new Date(time);
				int year=day.getYear()+1900-2;
				for (int i = 0; i < 5; i++) {
					cho1.addItem(year+i+"년");
				}
				cho1.select(2);
				
				Choice cho2=new Choice();
				for (int i = 0; i < 13; i++) {
					cho2.addItem(i+"월");
				}
				Choice cho3=new Choice();
				for (int i = 0; i < 32; i++) {
					cho3.addItem(i+"일");
				}
				
				
				p.add(cho1);
				p.add(la);
				add(p);
				setSize(400,300);
				setLocation(1100, 0);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex06();
				
			}
		
		}

	 *
	 *
	 *
	 *
	 *package com.bit.pm;
		
		import java.awt.BorderLayout;
		import java.awt.Button;
		import java.awt.Color;
		import java.awt.FlowLayout;
		import java.awt.Font;
		import java.awt.Frame;
		import java.awt.Panel;
		
		public class Ex01 extends Frame {
				//엘리먼트 size(x)	
			public Ex01(){
				FlowLayout fl=new FlowLayout();// 흐르는 데로 붙임
				BorderLayout bl=new BorderLayout();
				Panel p= new Panel();
				
				Panel p1= new Panel();
				Color color=new Color(255,0,0);//rgb
				p1.setBackground(color);
				
				Panel p2= new Panel();
				color=new Color(200);
				p2.setBackground(color);
				
				Panel p3= new Panel();
				color=new Color(300);
				p3.setBackground(color);
				
				Panel p4= new Panel();
				color=new Color(400);
				p4.setBackground(color);
				
				Panel p5= new Panel();
				color=new Color(500);
				p5.setBackground(color);
				
				p.setLayout(bl);
				Font font=new Font("굴림",Font.PLAIN,20);
				Button btn1=new Button("btn1");
				Button btn2=new Button("btn2");
				Button btn3=new Button("btn3");
				Button btn4=new Button("btn4");
				Button btn5=new Button("btn5");
				
				btn1.setFont(font);
				btn2.setFont(font);
				btn3.setFont(font);
				btn4.setFont(font);
				btn5.setFont(font);
				
				p1.add(btn1);
				p2.add(btn2);
				p3.add(btn3);
				p4.add(btn4);
				p5.add(btn5);
				
		//		p.add("North",p1);
				p.add(p1,BorderLayout.NORTH);
		//		p.add("Center",p2);
				p.add(p2,BorderLayout.CENTER);
		//		p.add("South",p3);
				p.add(p3,BorderLayout.WEST);
		//		p.add("West",p4);
				p.add(p4,BorderLayout.SOUTH);
		//		p.add("East",p5);
				p.add(p5,BorderLayout.EAST);
				add(p);
				setSize(400, 300);
				setLocation(1000, 100);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex01();
		
			}
		
		}

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
	 */
	public static void main(String[] args) {
	

	}

}
