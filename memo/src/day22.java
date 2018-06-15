
public class day22 {

	/*
	 * 
	 * package com.bit.am;
		
		public class Ex02 implements Runnable {
			// 1.Thread 를 상속 , setName 이름가능
			// 2.Runnable 인터페이스 상속 , setName 으로 이름X
			// 3.익명클래스 사용
			public static void main(String[] args) {
				System.out.println("main THread run");
				Runnable res=new Runnable() {
					public void run() {
						
						System.out.println("new THread run");
						System.out.println("new THread end");
					}
				};
				Thread thr=new Thread(res);
				thr.start();
				Thread thr2=new Thread(res);
				thr2.start();
		
				System.out.println("main THread end");
			}
			public void run() {	
				
				System.out.println("new THread run");
				System.out.println("new THread end");
			}
		}

	 * 
	 * 
	 * 
	 * 
	 * package com.bit.am;
		
		import java.awt.Frame;
		import java.awt.Label;
		import java.text.DateFormat;
		import java.text.SimpleDateFormat;
		import java.util.Date;
		
		public class Ex03 implements Runnable{
			static Label la;
			
			public static void main(String[] args) throws InterruptedException {
				System.out.println("main Thread run");
				Frame f=new Frame();
				la=new Label();
				f.add(la);
				f.setSize(500,300);
				f.setLocation(900, 100);
				f.setVisible(true);
				Thread thr=new Thread(new Ex03());
				thr.start();
				System.out.println("main Thread end");
			}
		
			public void run() {
				while(true){
					System.out.println(Thread.currentThread().getName()+" 시간을 출력");
					Date day=new Date();
					SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
					la.setText(sdf.format(day));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			}
		
		}

	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.bit.am;
		
		public class Ex04 extends Thread{
			public Ex04(){
				System.out.println(getName()+" -start");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(getName()+" -end");
				
			}
			public static void main(String[] args) {
				System.out.println("main Thread run");
				Ex04 me=new Ex04();
				Ex04 me1=new Ex04();
				
				me.start();
				me1.start();
				
				try {
					me.join(3000);//sleep 과 다르다
					me1.join(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("main Thread end");
			}
		}
	 * 
	 * 
	 * 
	 * 
	 * package com.bit.am;
		
		public class Ex05 extends Thread{
			public void run(){
				String name=getName();
				System.out.println(name+"의 우선순위는 "+getPriority());
			}
			
			public static void main(String[] args) {
				Ex05 me1=new Ex05();
				Ex05 me2=new Ex05();
				Ex05 me3=new Ex05();
				
				me1.setPriority(Thread.MIN_PRIORITY);
				me2.setPriority(Thread.MAX_PRIORITY);
				me3.setPriority(Thread.NORM_PRIORITY);
				
				me1.start();
				me2.start();
				me3.start();
			}
		
		}

	 * 
	 * 
	 * 
	 * 
	 * package com.bit.pm;
		
		import java.awt.Button;
		import java.awt.Event;
		import java.awt.Frame;
		import java.awt.GridBagLayout;
		import java.awt.GridLayout;
		import java.awt.Label;
		import java.awt.Panel;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.text.SimpleDateFormat;
		import java.util.Date;
		
		public class Ex05 extends Frame implements ActionListener{
			Label la;
			Thread thr;
			Button btn1,btn2;
			public Ex05(){
				super("시계");
				Panel p=new Panel(new GridLayout(3,1));
				
				la=new Label();
				
				btn1=new Button("시작");
				btn2=new Button("종료");
				
				btn1.addActionListener(this);
				btn2.addActionListener(this);
				
				p.add(la);
				p.add(btn1);
				p.add(btn2);
				add(p);
				setSize(500, 300);
				setLocation(900, 100);
				setVisible(true);
			}
			class Lec02 implements Runnable{
				public void run() {
					while(true){
						Date day=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
						String time=sdf.format(day);
						la.setText(time);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
			public static void main(String[] args) {
				new Ex05();
			}
			public void actionPerformed(ActionEvent e) {
				Button btn=(Button)e.getSource();
				if(e.getSource()==btn1){
					if(thr==null){
						thr=new Thread(new Lec02());
						btn.setEnabled(false);
					}
					thr.start();
				}else if(btn==btn2){
					if(thr!=null){
						thr.stop();
						la.setText("");
						thr=null;
						btn1.setEnabled(true);
					}
				}
				
				
			}
		
		
		}

	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.bit.pm;
		
		import java.awt.BorderLayout;
		import java.awt.Button;
		import java.awt.FlowLayout;
		import java.awt.Font;
		import java.awt.Frame;
		import java.awt.GridLayout;
		import java.awt.Label;
		import java.awt.Panel;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.sql.Time;
		import java.text.SimpleDateFormat;
		import java.util.Date;
		import java.util.Timer;
		
		public class Ex06 extends Frame implements ActionListener{
			/* 
			 * 타이머 1분 카운트 다운
			 *
			Label la;
			Button btn1;
			Button btn2;
			int first=0;
			Thread thr;
			
			public Ex06(){
				super("타이머");
				Panel p=new Panel(new BorderLayout());
				Panel s=new Panel();
				Font font=new Font("arial", Font.BOLD, 32);
				la=new Label();
				la.setFont(font);
				la.setSize(100, 100);
				btn1=new Button("시작");
				btn2=new Button("초기화");
				
				btn1.addActionListener(this);
				btn2.addActionListener(this);
				
				s.add(btn1);
				s.add(btn2);
				p.add(la,BorderLayout.CENTER);
				p.add(s,BorderLayout.SOUTH);
				add(p);
				setSize(500, 300);
				setLocation(900, 100);
				setVisible(true);
			}
			public void cnt(){
				int su=60;
				while(true){
					la.setText(""+su--);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					if(su==-1){
						break;
					}
				}
				btn1.setLabel("시작");
				btn1.setEnabled(false);
			}
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn1){
					if(first==0){				
						thr=new Thread(new Runnable() {
							public void run() {
								cnt();
							}
						});
						thr.start();
						first++;
						btn1.setLabel("멈춤");
					}else if(first==1){
						thr.suspend();
						btn1.setLabel("재시작");
						first++;
					}else{
						thr.resume();
						btn1.setLabel("멈춤");
						first--;
					}
				}else if(e.getSource()==btn2){
					thr.suspend();
					la.setText("60");
					thr=new Thread(new Runnable() {
						public void run() {
							cnt();
						}
					});
					first=0;
					btn1.setLabel("시작");
					btn1.setEnabled(true);
				}
			}
			public static void main(String[] args) {
				new Ex06();
			}
		}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.bit.pm;
		
		import java.awt.Button;
		import java.awt.CardLayout;
		import java.awt.Frame;
		import java.awt.Label;
		import java.awt.Panel;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.awt.event.MouseEvent;
		import java.awt.event.MouseListener;
		import java.awt.event.MouseMotionListener;
		
		public class Ex07 extends Frame implements ActionListener,MouseListener{
			CardLayout car;
			Panel p;
			int startx;
			int endx;
			
			public Ex07(){
				car=new CardLayout();
				p=new Panel(car);
				
				Panel p1=new Panel();
				Panel p2=new Panel();
				Panel p3=new Panel();
				
				Label la1=new Label("page1");
				Label la2=new Label("page2");
				Label la3=new Label("page3");
				
				p1.addMouseListener(this);
				p2.addMouseListener(this);
				p3.addMouseListener(this);
				
				Button btn1=new Button("next 2page");
				Button btn2=new Button("next 3page");
				Button btn3=new Button("next 1page");
				
				btn1.addActionListener(this);
				btn2.addActionListener(this);
				btn3.addActionListener(this);
				
				p1.add(la1);
				p2.add(la2);
				p3.add(la3);
				p1.add(btn1);
				p2.add(btn2);
				p3.add(btn3);
				p.add(p1);
				p.add(p2);
				p.add(p3);
				add(p);
				setSize(500,300);
				setLocation(900, 100);
				setVisible(true);
			}
			
			public static void main(String[] args) {
				new Ex07();
		
			}
		
			public void actionPerformed(ActionEvent e) {
				car.next(p);//다음
		//		car.previous(p);//이전
			}
		
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
		//		System.out.println(e.getX()+" "+e.getY());
				startx=e.getX();
				
			}
		
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
		//		System.out.println(e.getX()+" "+e.getY());
				endx=e.getX();
				if(endx-startx<-100){
					car.previous(p);
				}else if(endx-startx>100){
					car.next(p);
				}
			}
		
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		
		}

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
