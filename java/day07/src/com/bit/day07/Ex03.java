package com.bit.day07;

public class Ex03 {
		
	public static int a=1234; //클래스 변수
	
	public int b=1234;//멤버필드
	
	
	public static void main(String[] args) {
		
		System.out.println("static"+Ex03.a);
		Ex03 me=new Ex03();
		System.out.println("non-static"+me.b);//클래스명도 오류 only 참조변수
		me.a--;
		me.b--;
		System.out.println("static"+Ex03.a);
		System.out.println("non-static"+me.b);
		System.out.println("객체생성");
		me=new Ex03();
		me.a--;
		me.b--;
		System.out.println("static"+Ex03.a);
		System.out.println("non-static"+me.b);
	}

}
