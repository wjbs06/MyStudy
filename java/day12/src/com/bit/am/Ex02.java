package com.bit.am;

import com.bit.pm.Lec02;

class Lec01{
	public int a=10;
	protected int b=20;
	int c=30;
	private int d=40;
	void func01(){
		System.out.println("Lec01 func01 실행");
	}
	protected void func02(){
		System.out.println("Lec01 func02 실행");
	}
	
}

//public > protected > default > private
//protected , private => class 에 불가
public class Ex02 extends Lec02 {


	public static void main(String[] args) {
		Ex02 me=new Ex02();
		me.func01();
		me.func02();
		
		Lec01 lec1=new Lec01();
		lec1.func01();
		lec1.func02();
		System.out.println(lec1.a);
		System.out.println(lec1.b);
		System.out.println(lec1.c);
//		System.out.print(lec1.d);
		
//		Lec02 lec2=new Lec02();
//		lec2.func01();
//		lec2.func02();
//		System.out.println(lec2.a);
//		System.out.println(me.a);
//		System.out.println(me.b);
//		System.out.println(lec2.b);
//		System.out.println(lec2.c);
//		System.out.println(lec2.d);
	}

}
