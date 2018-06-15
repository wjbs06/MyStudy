package com.bit.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex06 extends Frame implements KeyListener{

	public Ex06(){
		setLayout(null);
		
		Button btn=new Button("*");
		btn.setSize(20,20);
		btn.setLocation(100, 100);
		
		btn.addKeyListener(this);
		
		add(btn);
		setSize(500, 300);
		setLocation(900, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex06();

	}
	public void keyTyped(KeyEvent e) {
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		int su=e.getKeyCode();
		Button btn=(Button)e.getSource();
		int x=btn.getX();
		int y=btn.getY();
		if(su==83){
			y+=10;
		}else if(su==87){
			y-=10;
		}else if(su==65){
			x-=10;
		}else if(su==68){
			x+=10;
		}
		btn.setLocation(x, y);
	}

}
