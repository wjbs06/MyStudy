
public class day21 {

	/*
	 *
	 *
	 *package com.bit.am;
		
		import java.awt.Button;
		import java.awt.Frame;
		import java.awt.Panel;
		import java.awt.TextField;
		
		public class Ex02 {
			public Ex02(){
				Frame f= new Frame();
				Panel p=new Panel(null);
				
				TextField tf=new TextField();
				p.add(tf);
				tf.setBounds(10, 10, 230, 50);
				
				String[] num={"7","8","9","4","5","6","1","2","3"};
				Button[] btns=new Button[9];
				for (int i = 0; i < btns.length; i++) {
					btns[i]=new Button(num[i]);
					p.add(btns[i]);
				}
				for (int i = 0; i < 9; i++) {
					if(i>=0&&i<=2){
						btns[i].setBounds(10+i*60, 70, 50, 50);
					} else if(i>=3&&i<=5){
						btns[i].setBounds(10+i%3*60, 130, 50, 50);
					} else {
						btns[i].setBounds(10+i%6*60, 190, 50, 50);
					}
				}
				
				Button btn10=new Button("+");
				p.add(btn10);
				btn10.setBounds(190, 70, 50, 110);
				Button btn11=new Button("=");
				p.add(btn11);
				btn11.setBounds(190, 190, 50, 110);
				Button btn12=new Button("0");
				p.add(btn12);
				btn12.setBounds(10, 250, 110, 50);
				Button btn13=new Button("-");
				p.add(btn13);
				btn13.setBounds(130, 250, 50, 50);
				
				
				f.add(p);
				f.setSize(266,348);
				f.setLocation(900, 100);
				f.setVisible(true);
				
			}
			
			public static void main(String[] args) {
				new Ex02();
				
			}
		
		}

	 *
	 *
	 *
	 *package com.bit.am;
		
		import java.awt.Button;
		import java.awt.Frame;
		import java.awt.GridBagConstraints;
		import java.awt.GridBagLayout;
		import java.awt.Panel;
		
		public class Ex03 extends Frame{
			public Ex03(){
				super("GridBagLayout");
				GridBagLayout gbl=new GridBagLayout();
				Panel p=new Panel(gbl);
				
				Button[] btns=new Button[6];
				for (int i = 0; i < btns.length; i++) {
					btns[i]=new Button("버튼"+i);
				}
				//크기,위치,가중치
				
				GridBagConstraints gbc=new GridBagConstraints();
				gbc.fill=GridBagConstraints.BOTH;
				
				//위치
				gbc.gridx=0;
				gbc.gridy=0;
				//크기
				gbc.gridwidth=2;
				gbc.gridheight=1;
				//가중치
				gbc.weightx=1.0;
				gbc.weighty=1.0;
				
				p.add(btns[0],gbc);
				
				gbc.gridx=2;
				gbc.gridy=0;
				gbc.gridwidth=1;
				gbc.gridheight=1;
				gbc.weightx=1.0;
				gbc.weighty=1.0;
			
				p.add(btns[1],gbc);
				
				gbc.gridx=0;
				gbc.gridy=1;
				gbc.gridwidth=3;
				gbc.gridheight=1;
				gbc.weightx=1.0;
				gbc.weighty=1.0;
				
				p.add(btns[2],gbc);
				
				gbc.gridx=0;
				gbc.gridy=2;
				gbc.gridwidth=1;
				gbc.gridheight=2;
				gbc.weightx=1.0;
				gbc.weighty=1.0;
				
				p.add(btns[3],gbc);
				
				gbc.gridx=1;
				gbc.gridy=2;
				gbc.gridwidth=2;
				gbc.gridheight=1;
				gbc.weightx=1.0;
				gbc.weighty=1.0;
				
				p.add(btns[4],gbc);
				
				gbc.gridx=1;
				gbc.gridy=3;
				gbc.gridwidth=2;
				gbc.gridheight=1;
				gbc.weightx=1.0;
				gbc.weighty=1.0;
				
				p.add(btns[5],gbc);
				
				add(p);
				setSize(500,300);
				setLocation(900, 100);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex03();
		
			}
		
		}

	 *
	 *
	 * 메뉴 생성
	 *package com.bit.am;
		
		import java.awt.CheckboxMenuItem;
		import java.awt.Frame;
		import java.awt.Menu;
		import java.awt.MenuBar;
		import java.awt.MenuItem;
		
		public class Ex04 extends Frame{
			public Ex04(){
				super("제목");
				
				MenuBar bar=new MenuBar();//메뉴바를 생성
				Menu menu1=new Menu("File");//메뉴를 생성
				Menu menu2=new Menu("Edit");
				Menu menu3=new Menu("Help");
				
				MenuItem mi1_1=new MenuItem();
				mi1_1.setLabel("New");
				MenuItem mi1_2=new MenuItem("Open");
				MenuItem mi1_3=new MenuItem("Option");
				MenuItem mi1_4=new MenuItem();
				mi1_4.setLabel("Exit");
				menu1.add(mi1_1);
				menu1.addSeparator();
				menu1.add(mi1_2);
				menu1.add(mi1_3);
				menu1.addSeparator();
				menu1.add(mi1_4);
				
				MenuItem mi2_1=new MenuItem("Undo");
				MenuItem mi2_2=new MenuItem("Redo");
				CheckboxMenuItem mi2_3=new CheckboxMenuItem("Mode1");
				menu2.add(mi2_1);
				menu2.add(mi2_2);
				menu2.addSeparator();
				menu2.add(mi2_3);
				
				MenuItem mi3_1=new MenuItem("Help");
				MenuItem mi3_2=new MenuItem("About");
				menu3.add(mi3_1);
				menu3.addSeparator();
				menu3.add(mi3_2);
				
				bar.add(menu1);
				bar.add(menu2);
				bar.add(menu3);
				setMenuBar(bar);
				setSize(500,300);
				setLocation(900, 100);
				setVisible(true);
			}
			
			public static void main(String[] args) {
				new Ex04();
		
			}
		
		}

	 *
	 *
	 *
	 *
	 *package com.bit.am;
		
		import java.awt.Button;
		import java.awt.Dialog;
		import java.awt.Frame;
		import java.awt.Label;
		import java.awt.Panel;
		
		public class Ex05 extends Frame{
		
			public Ex05(){
				Dialog dia=new Dialog(this);
				Panel p=new Panel();
				Label la=new Label("종료하시겠습니까?");
				Button btn1=new Button("저장");
				Button btn2=new Button("종료");
				p.add(la);
				p.add(btn1);
				p.add(btn2);
				dia.add(p);		
				dia.setSize(100, 100);
				int x=getX()+800-50;
				int y=getY()+300-50;
				dia.setLocation(x, y);
				dia.setVisible(true);
			
				
				setSize(500, 300);
				setLocation(900, 100);
				setVisible(true);
			}
			public static void main(String[] args) {
				Ex05 me=new Ex05();
				
			}
		
		}

	 *
	 *
	 *
	 *
	 *
	 *
	 *
		package com.bit.pm;
		
		import java.awt.Button;
		import java.awt.Component;
		import java.awt.Frame;
		import java.awt.Panel;
		import java.awt.event.MouseEvent;
		import java.awt.event.MouseListener;
		import java.awt.event.WindowEvent;
		import java.awt.event.WindowListener;
		
		public class Ex03 extends Frame implements MouseListener{
			class TargetButton implements MouseListener{
		
				public void mouseClicked(MouseEvent e) {
					dispose();
				}
				public void mousePressed(MouseEvent e) {
				}
				public void mouseReleased(MouseEvent e) {
				}
				public void mouseEntered(MouseEvent e) {
					
						System.out.println("버튼위로");
				}
				public void mouseExited(MouseEvent e) {
				}
			}
			public Ex03(){
				addWindowListener(new WindowListener() {
					public void windowOpened(WindowEvent e) {			}
					public void windowIconified(WindowEvent e) {			}
					public void windowDeiconified(WindowEvent e) {			}
					public void windowDeactivated(WindowEvent e) {			}
					public void windowClosing(WindowEvent e) {		}
					public void windowClosed(WindowEvent e) {			}
					public void windowActivated(WindowEvent e) {			}
				});
				addMouseListener(this);
				
				Panel p=new Panel();
				p.addMouseListener(this);
				Button btn=new Button("버튼");
				btn.addMouseListener(new TargetButton());
				Button btn1=new Button("버튼1");
				btn1.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {}
					public void mousePressed(MouseEvent e) {		}
					public void mouseExited(MouseEvent e) {	}
					public void mouseEntered(MouseEvent e) {System.out.println("버튼1위로");}
					public void mouseClicked(MouseEvent e) {
						Object obj=e.getSource();
						Component comp=(Component)obj;
						if("Button0".equals(comp.getName())){
							dispose();
						}else if("panel0".equals(comp.getName())){
							System.out.println("패널위 클릭");
						}
					}
				});
				p.add(btn1);
				p.add(btn);
				add(p);
				setSize(500,300);
				setLocation(900, 100);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex03();
			}
			public void mouseClicked(MouseEvent e) {	}
			public void mousePressed(MouseEvent e) {	}
			public void mouseReleased(MouseEvent e) {	}
			public void mouseEntered(MouseEvent e) {		System.out.println("위로");	}
			public void mouseExited(MouseEvent e) {	}
		}

	 *
	 *
	 *
	 *
	 *package com.bit.pm;
		
		import java.awt.Button;
		import java.awt.Frame;
		import java.awt.Panel;
		import java.awt.event.MouseEvent;
		import java.awt.event.MouseListener;
		import java.awt.event.MouseMotionListener;
		
		public class Ex04 implements MouseMotionListener{
			static Button btn;
			
			public static void main(String[] args) {
				Ex04 me=new Ex04();
				Frame f= new Frame();
				Panel p=new Panel(null);
				
				btn=new Button("*");
				btn.setSize(30,30);
				btn.setLocation(0,0);
				btn.setVisible(true);
				
				
				p.addMouseMotionListener(me);
				
				p.add(btn);
				f.add(p);
				f.setSize(500, 300);
				f.setLocation(900, 100);
				f.setVisible(true);
			}
		
			public void mouseDragged(MouseEvent e) {
				int x=e.getX();
				int y=e.getY();
				btn.setLocation(x, y);
		//		System.out.println(x+" "+y+"드래그");
			}
		
			public void mouseMoved(MouseEvent e) {
		//		System.out.println("무브");
			}
		
		}

	 *
	 *
	 *
	 *package com.bit.pm;
		
		import java.awt.Frame;
		import java.awt.GridLayout;
		import java.awt.TextField;
		import java.awt.event.KeyEvent;
		import java.awt.event.KeyListener;
		public class Ex05 extends Frame implements KeyListener{
			public Ex05(){
				TextField tf=new TextField();
				tf.addKeyListener(this);
				add(tf);
				setLayout(new GridLayout(3,1));
				setSize(500,300);
				setLocation(900, 100);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex05();
			}
			public void keyTyped(KeyEvent e) {//눌렸을떄
				System.out.println("입력");
			}
			public void keyPressed(KeyEvent e) {//누르는 순간
				System.out.println("누름");
			}
			public void keyReleased(KeyEvent e) {//눌렸다 뗄떄
		//		int input=e.getKeyCode();
		//		char input=e.getKeyChar();
				TextField tf=(TextField)e.getSource();
				String input=tf.getText();
				System.out.println("뗌"+input);
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
