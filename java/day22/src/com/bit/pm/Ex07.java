package com.bit.pm;

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
