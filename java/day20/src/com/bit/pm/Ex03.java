package com.bit.pm;

import java.awt.BorderLayout;
import java.awt.BufferCapabilities;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Ex03 extends Frame{
	public Ex03(){
		super("·¹ÀÌ¾Æ¿ô");
		GridLayout gl=new GridLayout(4,4);
		BorderLayout bl=new BorderLayout();
		Panel p=new Panel(gl);
		Panel p1=new Panel(bl);
		TextField tf1=new TextField("asd",30);
		
		Button btn1=new Button("7");
		Button btn2=new Button("8");
		Button btn3=new Button("9");
		Button btn4=new Button("%");
		Button btn5=new Button("4");
		Button btn6=new Button("5");
		Button btn7=new Button("6");
		Button btn8=new Button("-");
		Button btn9=new Button("1");
		Button btn10=new Button("2");
		Button btn11=new Button("3");
		Button btn12=new Button("X");
		Button btn13=new Button("0");
		Button btn14=new Button(".");
		Button btn15=new Button("+");
		Button btn16=new Button("=");
		
		p1.add(tf1);
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		p.add(btn7);
		p.add(btn8);
		p.add(btn9);
		p.add(btn10);
		p.add(btn11);
		p.add(btn12);
		p.add(btn13);
		p.add(btn14);
		p.add(btn15);
		p.add(btn16);

		add(p);
		setSize(400, 400);
		setLocation(800,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03();

	}

}
