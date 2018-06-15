package com.bit.am;

import java.awt.Frame;

public class Ex02 extends Frame{

	public Ex02(){
		setSize(400, 300);
		setLocation(500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex02 me=new Ex02();
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			me.setLocation(500+i*50, 300);
		}
	}

}
