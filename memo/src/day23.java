
public class day23 {

	/*
	 * 
	 * 
		package com.bit.am;
		
		import java.awt.Button;
		import java.awt.Frame;
		import java.awt.GridBagConstraints;
		import java.awt.GridBagLayout;
		import java.awt.Panel;
		
		public class Ex02 extends Frame{
		
			public Ex02(){
				GridBagLayout gbl=new GridBagLayout();
				Panel p=new Panel(gbl);
				GridBagConstraints gbc=new GridBagConstraints();
				gbc.fill=GridBagConstraints.BOTH;
		
				String[] nums={"7","8","9","4","5","6","1","2","3","+","0",".","Ent"};
				Button[] btns=new Button[13];
				for (int i = 0; i < nums.length; i++) {
					btns[i]=new Button(nums[i]);
				}
				gbc.gridwidth=1;
				gbc.gridheight=1;
				gbc.weightx=1;
				gbc.weighty=1;
				for (int i = 0; i < 9; i++) {
					if(i<3){
						gbc.gridx=i;
						gbc.gridy=0;
						p.add(btns[i],gbc);
					}else if(i<6){
						gbc.gridx=i-3;
						gbc.gridy=1;
						p.add(btns[i],gbc);
					}else{
						gbc.gridx=i-6;
						gbc.gridy=2;
						p.add(btns[i],gbc);
					}
				}
				gbc.gridx=3;
				gbc.gridy=0;
				gbc.gridwidth=1;
				gbc.gridheight=2;
				p.add(btns[9],gbc);
				gbc.gridx=0;
				gbc.gridy=3;
				gbc.gridwidth=2;
				gbc.gridheight=1;
				p.add(btns[10],gbc);
				gbc.gridx=2;
				gbc.gridy=3;
				gbc.gridwidth=1;
				gbc.gridheight=1;
				p.add(btns[11],gbc);
				gbc.gridx=3;
				gbc.gridy=2;
				gbc.gridwidth=1;
				gbc.gridheight=2;
				p.add(btns[12],gbc);
				
				add(p);
				setSize(500, 300);
				setLocation(900, 100);
				setVisible(true);
			}
			
			public static void main(String[] args) {
				new Ex02();
		
			}
		
		}

	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.bit.am;
		
		import java.awt.Frame;
		import java.awt.GridLayout;
		import java.awt.Label;
		import java.awt.Panel;
		import java.awt.TextField;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.awt.event.KeyEvent;
		import java.awt.event.KeyListener;
		import java.awt.event.TextEvent;
		import java.awt.event.TextListener;
		
		public class Ex04 extends Frame implements KeyListener, ActionListener,TextListener {
			Label la;
			TextField tf;
			public Ex04() {
				Panel p = new Panel(new GridLayout(2,1));
				la=new Label();
				p.add(la);
				tf = new TextField(20);
		//		tf.addKeyListener(this);
		//		tf.addActionListener(this);
				tf.addTextListener(this);
				p.add(tf);
				add(p);
				setBounds(900, 100, 400, 300);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex04();
			}
			public void keyTyped(KeyEvent e) {	}
			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {
		//		if (e.getKeyCode() == 10) {
		//			System.out.println(tf.getText());
		//			tf.setText("");
		//		}
			}
			public void actionPerformed(ActionEvent e) {
				// System.out.println(tf.getText());
				System.out.println(((TextField) e.getSource()).getText());
				((TextField)e.getSource()).setText("");
			}
			public void textValueChanged(TextEvent e) {//
				System.out.println("event run");
				la.setText(tf.getText());
			}
		
		}

	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.bit.am;
		
		import java.awt.Checkbox;
		import java.awt.Frame;
		import java.awt.Panel;
		import java.awt.event.ItemEvent;
		import java.awt.event.ItemListener;
		
		public class Ex05 extends Frame implements ItemListener{
		
			public Ex05(){
				Panel p=new Panel();
				
				Checkbox cb1=new Checkbox("item1",false);
				Checkbox cb2=new Checkbox("item2",false);
				Checkbox cb3=new Checkbox("item3",false);
				Checkbox cb4=new Checkbox("item4",false);		
				
				cb1.addItemListener(this);
				cb2.addItemListener(this);
				cb3.addItemListener(this);
				cb4.addItemListener(this);
				
				p.add(cb1);
				p.add(cb2);
				p.add(cb3);
				p.add(cb4);
				add(p);
				setBounds(900, 100, 400, 300);
				setVisible(true);
			}
			
			public static void main(String[] args) {
				new Ex05();
		
			}
		
			public void itemStateChanged(ItemEvent e) {
				Checkbox item=(Checkbox)e.getSource();
		//		System.out.println(item.getState());
				System.out.print(item.getLabel()+"을 ");
				if(item.getState()){
					System.out.println("선택");
				}else{
					System.out.println("해제");
				}
			}
		
		}

	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.bit.am;
		
		import java.awt.Choice;
		import java.awt.Frame;
		import java.awt.List;
		import java.awt.Panel;
		import java.awt.event.ItemEvent;
		import java.awt.event.ItemListener;
		
		public class Ex06 extends Frame implements ItemListener{
			public Ex06(){
				Panel p=new Panel();
				Choice cho1=new Choice();
				cho1.addItem("item1");
				cho1.addItem("item2");
				cho1.addItem("item3");
				cho1.addItem("item4");
				
				cho1.addItemListener(this);
				
				p.add(cho1);
				
				List list=new List();
				list.add("item1");
				list.add("item2");
				list.add("item3");
				list.add("item4");
				
				list.addItemListener(this);
				
				p.add(list);
				add(p);
				setBounds(900, 100, 400, 300);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex06();
			}
			public void itemStateChanged(ItemEvent e) {
		//		Choice cho=(Choice)e.getSource();
		//		System.out.println("idx: "+cho.getSelectedIndex());
		//		System.out.println(cho.getSelectedItem());
		//		System.out.println(e.getItem());
				List list=(List)e.getSource();
		//		System.out.println(list.getSelectedIndex());
		//		System.out.println(list.getSelectedItem());
				int[] idxs=list.getSelectedIndexes();
				for (int i = 0; i < idxs.length; i++) {
					System.out.println(list.getItem(idxs[i]));
				}
				
			}
		}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.bit.am;
		
		import java.awt.Button;
		import java.awt.Frame;
		import java.awt.Panel;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.awt.event.ComponentEvent;
		import java.awt.event.ComponentListener;
		
		public class Ex07 extends Frame implements ComponentListener{
		
			public Ex07(){
				Panel p=new Panel();
				final Button btn1=new Button("btn1");
				Button btn2=new Button("togle");
				btn1.addComponentListener(this);
				btn2.addActionListener(new ActionListener() {
					boolean show;
					public void actionPerformed(ActionEvent e) {
						btn1.setVisible(show);					
						show=!show;
					}
				});
				p.add(btn1);
				p.add(btn2);
				add(p);
				setBounds(900, 100, 400, 300);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex07();
			}
			public void componentResized(ComponentEvent e) {//창의 크기가 변화
				System.out.println("componentResized run");
			}
			public void componentMoved(ComponentEvent e) {//창의 움직임
				System.out.println("componentMoved run");
			}
			public void componentShown(ComponentEvent e) {//보여줄때
				System.out.println("componentShown run");
			}
			public void componentHidden(ComponentEvent e) {//숨겨질때
				System.out.println("hidden run");
			}
		}

	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.bit.am;
		
		import java.awt.BorderLayout;
		import java.awt.Button;
		import java.awt.Color;
		import java.awt.Frame;
		import java.awt.Label;
		import java.awt.Panel;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.awt.event.ContainerEvent;
		import java.awt.event.ContainerListener;
		
		public class Ex08 extends Frame implements ContainerListener{
			Panel p;
			Button btn;
			boolean click;
			public Ex08(){
				BorderLayout bl=new BorderLayout();
				setLayout(bl);
				p=new Panel();
				p.setBackground(Color.GREEN);
				p.addContainerListener(this);
				Button btn1=new Button("toggle");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
		//				Label la=new Label("추가");
		//				add(la);
						if(!click){
							btn=new Button("add");
							p.add(btn);
						}else{
							p.remove(btn);
						}
						click=!click;
						p.revalidate();//화면갱신
					}
				});
				
				
				add(btn1,BorderLayout.SOUTH);
				add(p,BorderLayout.CENTER);
				setBounds(900, 100, 400, 300);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex08();
			}
			public void componentAdded(ContainerEvent e) {
				System.out.println("추가됨");
			}
			public void componentRemoved(ContainerEvent e) {
				System.out.println("제거됨");
			}
		
		}

	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.bit.am;

		import java.awt.Canvas;
		import java.awt.Color;
		import java.awt.Frame;
		import java.awt.Graphics;
		import java.awt.Image;
		import java.awt.Panel;
		import java.awt.Toolkit;
		
		public class Ex09 extends Frame{
			public Ex09(){
				Canvas can=new Canvas(){
					public void paint(Graphics g) {
						g.drawLine(50, 50, 250, 50);
						g.drawRect(100, 100, 50, 50);
						g.setColor(Color.BLUE);
						g.drawRect(100, 100, 50, 50);
						g.drawRect(200, 100, 50, 50);
						g.fillRect(100, 200, 50, 50);
						g.fillOval(200, 200, 50, 50);
						g.drawArc(300, 150, 50, 50, 0, 360);
						g.fillArc(300, 250, 50, 50, 0, 360);
						
						g.fill3DRect(300, 300, 50, 50, true);
						Toolkit kit =Toolkit.getDefaultToolkit();
						Image img=kit.getImage("myimg.png");
						g.drawImage(img, 200, 300, this);
					}
				};
				add(can);
				setBounds(900, 100, 500, 400);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex09();
			}
		}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.bit.am;
		
		import java.awt.BorderLayout;
		import java.awt.Button;
		import java.awt.Dimension;
		import java.awt.Frame;
		import java.awt.GridBagConstraints;
		import java.awt.GridBagLayout;
		import java.awt.GridLayout;
		import java.awt.Label;
		import java.awt.Panel;
		import java.awt.Toolkit;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.util.Random;
		
		import javax.swing.Icon;
		import javax.swing.ImageIcon;
		import javax.swing.JButton;
		
		import javafx.scene.layout.Border;
		
		public class Ex11 extends Frame implements ActionListener{
			Button[] btns;
			String[] title={"가위","바위","보","종료"};
			JButton target1, target2;
			Label la;
			public Ex11(){
				Toolkit kit=Toolkit.getDefaultToolkit();
				setLayout(new BorderLayout());
				GridBagLayout gbl=new GridBagLayout();
				Panel c=new Panel(gbl);
				gbl.columnWidths=new int[]{400,200,400};
				
				GridBagConstraints gbc=new GridBagConstraints();
				gbc.fill=GridBagConstraints.BOTH;
				la=new Label();
				
				target1=new JButton();
				target2=new JButton();
			
				
				gbc.gridx=0;
				gbc.gridy=0;
				c.add(target1,gbc);
				gbc.gridx=1;
				gbc.gridy=0;
				c.add(la);
				gbc.gridx=2;
				gbc.gridy=0;
				c.add(target2,gbc);
				
				Panel s=new Panel(new GridLayout(1,4));
				btns=new Button[4];
				for (int i = 0; i < btns.length; i++) {
					btns[i]=new Button(title[i]);
					btns[i].addActionListener(this);
					s.add(btns[i]);
				}
				
				add(c,BorderLayout.CENTER);
				add(s,BorderLayout.SOUTH);
				Dimension screen=new Dimension();
				setBounds(500, 100, 800, 400);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex11();
			}
			
			public int com(){
				Random ran=new Random();
				int su=ran.nextInt(3);
				Icon icon;
				if(su==0){
					icon=new ImageIcon("main01.png");			
				}else if(su==1){
					icon=new ImageIcon("main02.png");
				}else {
					icon=new ImageIcon("main03.png");
				}
				target2.setIcon(icon);
				return su;
			}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int com=com();
				int me=0;
				String msg=((Button)e.getSource()).getLabel();
				if(msg.equals("종료")){
					dispose();
				}else{
					if(msg.equals("가위")){
						Icon icon=new ImageIcon("main01.png");
						target1.setIcon(icon);
					}else if(msg.equals("바위")) {
						Icon icon=new ImageIcon("main02.png");
						target1.setIcon(icon);
					}else if(msg.equals("보")){
						Icon icon=new ImageIcon("main03.png");
						target1.setIcon(icon);
						
					}
					result(com,me);
				}
					
			}
			public void result(int com,int me){
				if(com==me){
					la.setText("비겼음");
				}else if(com==0){
					if(me==1){
						la.setText("이겼음");
					}else{
						la.setText("졌음");
					}
				}else if(com==1){
					if(me==0){
						la.setText("졌음");
					}else{
						la.setText("이겼음");
					}
				}else if(com==2){
					if(me==0){
						la.setText("이겼음");
					}else{
						la.setText("비겼음");
					}
				}
			}
		
		}

	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		

	}

}
