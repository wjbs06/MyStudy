package com.bit.am;

public class Ex01 extends Thread{
	public Ex01(String name){
		setName(name);
	}
	
	public void run(){
		String name=getName();
		System.out.println(name+"new Thread run");
		
		System.out.println(name+"new Thread end");
	}
	
	public static void main(String[] args) {
		System.out.println("main Thread run");
		Ex01 me=new Ex01("1번");
		me.setName("오바");
		me.start();
		Ex01 me2=new Ex01("2번");
		me2.start();
		System.out.println("main Thread end");
		
	}

}
