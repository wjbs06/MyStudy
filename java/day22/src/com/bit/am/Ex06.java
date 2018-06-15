package com.bit.am;

public class Ex06 extends Thread{

	/*
	 * 스레드의 동기화
	 */
	static int su=0;
	static Object key=new Object();
	int start=0;
	public Ex06(int start){
		this.start=start;
	}
	void hap(int su){
		synchronized (key){
			
			int sum=Ex06.su;
			sum+=su;
			Ex06.su=sum;
		}
	}
	public void run(){
		for (int i = start; i < start+500; i++) {
			hap(i);
		}
	}
	public static void main(String[] args) {
		Ex06 me=new Ex06(0);
		Ex06 me2=new Ex06(500);
		me.start();
		me2.start();
		
		try {
			me.join();
			me2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("result su="+me.su);
	}

}
