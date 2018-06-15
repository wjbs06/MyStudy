package com.bit.am;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

public class Ex03 extends Frame{
	public Ex03(){
		Toolkit kit=Toolkit.getDefaultToolkit();//Toolkit 을 이용하여 모니터의 해상도를 받아낸다
		kit.beep();
		Dimension dim=kit.getScreenSize();// 디멘션타입으로 받는다
		
		
		
		Dimension mySize=new Dimension();
		mySize.width=300;
		mySize.height=300;
		setSize(mySize);
//		setSize(300,300);
		setLocation(dim.width/2-150,dim.height/2-150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03();

	}

}
