package com.bit.am;

class Lec02 extends Thread{
	public void run() {
		System.out.println("스레드 start");
		int sum=0;
		for (int i = 0; i < 1000000000; i++) {
			sum+=i;
		}
		System.out.println("스레드 end");
	}
}
public class Ex01 {

	
	public static void main(String[] args) {
		System.out.println("main start");
		Lec02 lec=new Lec02();
		lec.start();
		
		System.out.println("main end");
	}

}
