package com.bit.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;

public class Ex01 extends Frame {
		//ø§∏Æ∏’∆Æ size(x)	
	public Ex01(){
		FlowLayout fl=new FlowLayout();// »Â∏£¥¬ µ•∑Œ ∫Ÿ¿”
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
		Font font=new Font("±º∏≤",Font.PLAIN,20);
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
