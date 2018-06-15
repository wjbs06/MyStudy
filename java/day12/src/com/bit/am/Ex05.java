package com.bit.am;

//다형성

class Lec05{
	int sum=1234;
	
	void func01(){
		System.out.println("Lec05 func01 실행");
	}
}

public class Ex05 extends Lec05 {

	void func01(){
			System.out.println("Ex05 func01 실행");
		}
	
	public static void main(String[] args) {
		Lec05 lec=new Lec05();
		System.out.println(lec.sum);
		lec.func01();
		Ex05 me=new Ex05();
		System.out.println(me.sum);
		me.func01();
		
		//다형성
		//참조변수는 부모의 타입을 받아서 자신을 객체로 생성
		Lec05 you= new Ex05();
		System.out.println(me.sum);
		you.func01();
	}
}	