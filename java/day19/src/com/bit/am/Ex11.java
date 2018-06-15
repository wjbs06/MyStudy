package com.bit.am;

class Lec11 extends Thread{
	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+" i="+i);
		}
	}
}

public class Ex11 {

	public static void main(String[] args) {
		Lec11 lec= new Lec11();
		lec.start();
		try {
			lec.join(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("main i="+i);
		}
	}
}
