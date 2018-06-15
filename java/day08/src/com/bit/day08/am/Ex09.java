package com.bit.day08.am;

public class Ex09 {
	//필드에 있는 변수 전역변수
	//static : 클래스변수, static 변수
	//non-static : 멤버필드, non-static 변수
	
	public Ex09(){
		
	}
	String msg;
	int sum=100;
	static int sum2=1000;
	public static void main(String[] args) {
		//내부의 변수는 지역변수
		//Ex09 me=null;//변수 선언 초기값은 null
		Ex09 me=new Ex09(); //초기화

		System.out.println(me);
		System.out.println(me.msg);
		
		System.out.println(me.sum);
		me.func01(10);
		System.out.println(me.sum);
		func02();
		System.out.println(me.sum2);
		
		
	}

	//메서드 - 함수
	void func01(int sum1){
		sum=sum1;
//		return;
	}
	
	static void func02(){
		sum2=1111;
	}
	
}
//this 는 static 에서 사용불가.
//static 은 앞에 클래스명 사용.
