package com.bit.am;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class Ex03 extends Frame{

	public Ex03(){
		Panel p=new Panel();
		
		Button btn1=new Button();
		btn1.setLabel("버튼");
		Button btn2=new Button("버튼2");
		
		Checkbox ch1=new Checkbox("체크");
		Checkbox ch2=new Checkbox();
		ch2.setLabel("item2");
		ch2.setState(true);
		
		CheckboxGroup cbg=new CheckboxGroup();
		
		Checkbox ch3=new Checkbox("라디오1",cbg,true);
		Checkbox ch4=new Checkbox("라디오2",cbg,false);
		Checkbox ch5=new Checkbox("라디오3",cbg,false);
		
		
		p.add(btn1);
		p.add(btn2);
		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		p.add(ch4);
		p.add(ch5);
		add(p);
		setSize(400, 300);
		setLocation(500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Ex03 me=new Ex03();
		
	}

}
