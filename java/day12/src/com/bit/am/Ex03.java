package com.bit.am;

class Lec03{
	// final class 상속의 허용불가
	final int sum=1111;//상수형 변수
	
	final void func01(){
		System.out.println("func01 실행");
	}
	
}

final class A{
	int a=123;
}

//메서드에 final 을 사용하게 되면 메서드를 변형불가
//오버라이드(메서드 수정)도 불가
public class Ex03 extends Lec03 {

	public static void main(String[] args) {
//		Lec03 lec=new Lec03();
//		System.out.println(lec.sum);
//		lec.func01();
		Ex03 me=new Ex03();
		me.func01();
	
		A a=new A();
		System.out.println(a.a);
		a.a=0;
		System.out.println(a.a);
	}

	
//	void func01(){
//		
//	}
}
