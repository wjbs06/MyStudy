package com.bit.pm;

public class Ex01 extends Thread{
	int dan;
	
	public Ex01(int dan){
		this.dan=dan;
	}
	
	public void run() {
		if(dan==4){
			yield();
		}
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+"X"+i+"="+(dan*i));
			
		}
	}
	
	public static void main(String[] args) {
		Ex01 me1=new Ex01(2);
		Ex01 me2=new Ex01(4);
		Ex01 me3=new Ex01(6);
		Ex01 me4=new Ex01(8);
		me1.start();
		me2.start();
		me3.start();
		me4.start();
	}

}
