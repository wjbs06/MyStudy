package com.bit.am;

abstract class Lec08{
	//추상클래스
	// - 추상메서드를 0개 이상~
	// - 독립적 객체의 생성불가 **************
	// - 상속받는 측에서 추상메서드를 구현해서 사용
	// 추상메서드를 안가질수도 있다
	// 추상클래스의 사용
	// 1. 하위클래스가 추상클래스가 되어 추상클래스를 상속
	// 2. 추상메서드를 오버라이드(- 상속받는 측에서 추상메서드를 구현해서 사용)
	//  - 상속받는 측에서 기능을 결정해서 사용할 수 있다
	int su=1234;
	public Lec08(){
		System.out.println("Lec08 생성자");
	}
	
	public void func01(){
		System.out.println("Lec08 func01 run");
	}
	// 추상메서드
	public abstract void func02();
}

public class Ex08 extends Lec08{

	/*
	 * 상속
	 */
	public Ex08(){
		super();
		System.out.println("Ex08 생성자");
	}
	
	public static void main(String[] args) {
		Lec08 me= new Ex08();
		me.func01();
		me.func02();
	}
	
	public void func02(){
		System.out.println("Ex08 override func02");
	}
}
