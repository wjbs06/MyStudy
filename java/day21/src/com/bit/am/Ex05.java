package com.bit.am;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex05 extends Frame{

	public Ex05(){
		Dialog dia=new Dialog(this);
		Panel p=new Panel();
		Label la=new Label("종료하시겠습니까?");
		Button btn1=new Button("저장");
		Button btn2=new Button("종료");
		p.add(la);
		p.add(btn1);
		p.add(btn2);
		dia.add(p);		
		dia.setSize(100, 100);
		int x=getX()+800-50;
		int y=getY()+300-50;
		dia.setLocation(x, y);
		dia.setVisible(true);
	
		
		setSize(500, 300);
		setLocation(900, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex05 me=new Ex05();
		
	}

}
