package com.bit.pm;

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
