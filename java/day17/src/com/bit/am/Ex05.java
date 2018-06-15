package com.bit.am;

interface Lec55{
	//추상메서드만 받는 인터페이스, 다중상속 해결
	//1.다중상속
	//2.통일성 index
	//3.클래스의 설명
	//4.클래스의 목적을 부여
	public void func01();
	abstract void func02();//public 생략
	public abstract void func03();
}
interface Lec5{}
interface Lec555 extends Lec5,Lec55{};
//추상클래스는 상속을 위해서
//추상메서드가 있으면 추상클래스
//abstract class Lec05{
//	public void func01(){
//		
//	}
//	public abstract void func02();
//		
//}

public class Ex05 implements Lec55,Lec5{

	
	public static void main(String[] args) {
		Object obj = new Ex05();

	}

	public void func02() {
		// TODO Auto-generated method stub
		
	}

	public void func01() {
		// TODO Auto-generated method stub
		
	}

	public void func03() {
		// TODO Auto-generated method stub
		
	}

}
