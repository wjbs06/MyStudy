package com.bit.pm;

class Lec03{
	int sum=100;
	
	void func01(){
		
		System.out.println("Lec03-func01 run");
	}
}
//부모클래스,상위클래스,super클래스

//자식클래스,하위클래스,유도클래스
public class Ex03 extends Lec03{
	int sum=200;
	//오버라이드의 대상은 메서드 final 아닌 non-static 메서드
	void func01(){
		System.out.println(++super.sum);
		System.out.println("Ex03-func01 run");
		System.out.println(super.sum);
		System.out.println(this.sum);
	}
	public static void main(String[] args) {
		Lec03 me=new Ex03();
		me.func01();
		System.out.println(me.sum);

	}

}
