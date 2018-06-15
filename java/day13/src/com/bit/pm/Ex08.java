package com.bit.pm;

class Lec08{}

interface Inter01{
	// 오직 추상메서드만 갖음(단, 상수형 변수만 갖음)
	// 인터페이스의 다중상속 허용(다중상속처럼)
	int sum=100;
	
	public void func01();// 인터페이스의 추상메서드는 public 
	void func02(int a);// 생략해도 public
}

interface Inter02{
	void func03();
}
interface Inter03 extends Inter02,Inter01{
	int sum=200;
	void func03();
}
interface Inter04{
	//상속받는 클래스의 구체화
}
public class Ex08 extends Lec08 implements Inter01,Inter03,Inter04 {

	public static void main(String[] args) {
		
		
	}

	public void func01(){
		
		System.out.println();
	}
	
	public void func02(int a){
		
	}
	
	public void func03(){
		
	}
}
