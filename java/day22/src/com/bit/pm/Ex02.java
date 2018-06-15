package com.bit.pm;

public class Ex02 extends Thread{
	public void run() {
		while(true){
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("running");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		Ex02 me=new Ex02();
		me.setDaemon(true);// main에 종속되 스레드로 만듬. main이 끝나면 종속도 End
		me.start();
		
		Thread.sleep(3000);
		System.out.println("main end");
	}

}
