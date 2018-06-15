package com.bit.am;

public class Ex04 extends Thread{
	public Ex04(){
		System.out.println(getName()+" -start");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName()+" -end");
		
	}
	public static void main(String[] args) {
		System.out.println("main Thread run");
		Ex04 me=new Ex04();
		Ex04 me1=new Ex04();
		
		me.start();
		me1.start();
		
		try {
			me.join(3000);//sleep 과 다르다
			me1.join(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main Thread end");
	}
}