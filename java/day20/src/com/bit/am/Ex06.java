package com.bit.am;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.util.Date;

public class Ex06 extends Frame{
	public Ex06(){
		Panel p =new Panel();
		Label la = new Label("년월일");
		Choice cho1=new Choice();
		
		long time=System.currentTimeMillis();
		Date day=new Date(time);
		int year=day.getYear()+1900-2;
		for (int i = 0; i < 5; i++) {
			cho1.addItem(year+i+"년");
		}
		cho1.select(2);
		
		Choice cho2=new Choice();
		for (int i = 0; i < 13; i++) {
			cho2.addItem(i+"월");
		}
		Choice cho3=new Choice();
		for (int i = 0; i < 32; i++) {
			cho3.addItem(i+"일");
		}
		
		
		p.add(cho1);
		p.add(la);
		add(p);
		setSize(400,300);
		setLocation(1100, 0);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex06();
		
	}

}
