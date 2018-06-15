package com.bit.pm;

public class Ex03 implements Runnable{

	public void run() {
		while(true){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" run");
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Ex03 me=new Ex03();
		ThreadGroup tg=new ThreadGroup("me");
		Thread thr1=new Thread(tg,me);
		Thread thr2=new Thread(tg,me);
		Thread thr3=new Thread(tg,me);
		thr1.start();
		thr2.start();
		thr3.start();
		
		Thread.sleep(5000);
		tg.stop();//suspend();stop();
	}


}
