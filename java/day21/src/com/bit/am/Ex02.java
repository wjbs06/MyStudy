package com.bit.am;

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
