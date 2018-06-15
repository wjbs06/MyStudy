package com.bit.am;
//스레드를 상속받으면 객체를 3번찍어야 한다.
public class Ex05 extends Thread{
	public Ex05(String name){
		setName(name);
	}
	public static void main(String[] args) {
		Thread thr=Thread.currentThread();
		System.out.println(thr.getName()+" start");
		Ex05 me1=new Ex05("첫번째");
		Ex05 me2=new Ex05("두번째");
		Ex05 me3=new Ex05("세번째");
		me1.start();
		me2.start();
		me3.start();
		System.out.println(thr.getName()+" end");
	}

	public void run(){
		Thread thr=currentThread();
		String name=thr.getName();
		System.out.println(name+"스레드 시작");
		System.out.println(name+"스레드 종료");
	}
}
