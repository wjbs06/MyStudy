package com.bit.pm;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Ex04 {

	
	public static void main(String[] args) {
		Frame f=new Frame();
		Panel p=new Panel(null);
		
		Button btn=new Button("¹öÆ°");
		btn.setSize(100,50);
		btn.setLocation(0, 0);
		
		p.add(btn);
		f.add(p);
		f.setSize(300,300);
		f.setLocation(900, 100);
		f.setVisible(true);
		
	}

}
