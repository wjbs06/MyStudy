package com.bit.am;

import java.awt.Frame;
import java.awt.Label;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 implements Runnable{
	static Label la;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main Thread run");
		Frame f=new Frame();
		la=new Label();
		f.add(la);
		f.setSize(500,300);
		f.setLocation(900, 100);
		f.setVisible(true);
		Thread thr=new Thread(new Ex03());
		thr.start();
		System.out.println("main Thread end");
	}

	public void run() {
		while(true){
			System.out.println(Thread.currentThread().getName()+" 시간을 출력");
			Date day=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
			la.setText(sdf.format(day));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
