package com.bit.pm;

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
	public void keyTyped(KeyEvent e) {//´­·ÈÀ»‹š
		System.out.println("ÀÔ·Â");
	}
	public void keyPressed(KeyEvent e) {//´©¸£´Â ¼ø°£
		System.out.println("´©¸§");
	}
	public void keyReleased(KeyEvent e) {//´­·È´Ù ¶¿‹š
//		int input=e.getKeyCode();
//		char input=e.getKeyChar();
		TextField tf=(TextField)e.getSource();
		String input=tf.getText();
		System.out.println("¶À"+input);
	}
}
