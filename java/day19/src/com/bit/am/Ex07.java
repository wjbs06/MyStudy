package com.bit.am;

import java.util.Date;

public class Ex07 extends Thread{
		// 스레드 제어
	 
	public static void main(String[] args) {
		Ex07 me=new Ex07();
//		me.run();
//		me.time();
		for (int i = 0; i < 10; i++) {
			Date d= new Date();
			int year=d.getYear()+1900;
			int month=d.getMonth()+1;
			int day=d.getDate();
			int h=d.getHours();
			int m=d.getMinutes();
			int s=d.getSeconds();
			System.out.println(year+"년"+month+"월"+day+"일"+h+"시"+m+"분"+s+"초");
			try {
				Thread.sleep(1000);//sleep(1000) 인자 1/1000 초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		
	}
	
	public void time(){
		for (int i = 0; i < 10; i++) {
			Date d= new Date();
			int year=d.getYear()+1900;
			int month=d.getMonth()+1;
			int day=d.getDate();
			int h=d.getHours();
			int m=d.getMinutes();
			int s=d.getSeconds();
			System.out.println(year+"년"+month+"월"+day+"일"+h+"시"+m+"분"+s+"초");
			try {
				Thread.sleep(1000);//인자 1/1000 초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void run(){
		int dan=9;
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+"X"+i+"="+(dan*i));
			try {
				sleep(1000);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
