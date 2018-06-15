package com.bit.am;
//오버라이드는 메서드
class Lec07{
	int su=1000;
	public void func01(){
		System.out.println("Lec07-func01 run");
	}
}

public class Ex07 extends Lec07{
	int su=1111;
	
	public Ex07(){
		super();
	}
	
	public static void main(String[] args) {
		Lec07 me=new Ex07();
		me.func01();
		me.su++;
		System.out.println(me.su);

	}

	public void func01(){
		System.out.println("Ex07-func01 run");
	}

}
