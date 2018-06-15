package com.bit.am;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.*;

public class Ex10 extends Frame{

	public Ex10(){
		Panel p=new Panel(new GridLayout(2,1));
		
		JButton btn1=new JButton();
		Toolkit kit =Toolkit.getDefaultToolkit();
		Image img=kit.getImage("main01.png");
		
		
		add(p);
		setBounds(900, 100, 400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex10();
	}

}
