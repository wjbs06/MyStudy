package com.bit.am;

public class Ex02 implements Runnable {
	// 1.Thread 를 상속 , setName 이름가능
	// 2.Runnable 인터페이스 상속 , setName 으로 이름X
	// 3.익명클래스 사용
	public static void main(String[] args) {
		System.out.println("main THread run");
		Runnable res=new Runnable() {
			public void run() {
				
				System.out.println("new THread run");
				System.out.println("new THread end");
			}
		};
		Thread thr=new Thread(res);
		thr.start();
		Thread thr2=new Thread(res);
		thr2.start();

		System.out.println("main THread end");
	}
	public void run() {	
		
		System.out.println("new THread run");
		System.out.println("new THread end");
	}
}
