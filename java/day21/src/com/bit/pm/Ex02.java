package com.bit.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex02 extends Frame implements MouseListener{
	public Ex02(){
		Panel p =new Panel();
		
		Button btn=new Button();
		btn.addMouseListener(this);
		
		
		
		p.add(btn);
		add(p);
		setSize(400,300);
		setLocation(900, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02();

	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 버튼을 누르고 떼는");
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 누르는순간");
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 떼는순간");
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 위로");
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 밖으로");
	}

}
