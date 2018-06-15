package com.bit.day08.am;

import com.bit.day08.pm.Ex06;

class Ex44{
	/* 접근제한자
	 * 접근제한자 [static] 자료형 변수명;
	 * public > default > private
	 * 
	 * 필드의 접근제한자
	 * private 접근 허용범위가 동일 클래스 내부에서만 접근허용
	 * default 동일 패키지 내부에서만 접근허용
	 * public 어디서든 접근 허용
	 * 
	 */
	
	public int su1=1111;
	int su2=2222;
	private int su3=3333;
	
	public void func01(){
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
	}
	
	void func02(){
		System.out.println("default 메서드");
		func03();
	}
	
	private void func03(){
		System.out.println("private 메서드");
	}
	
}

public class Ex04 {
	
	
	public static void main(String[] args) {
		Ex44 me=new Ex44();
		System.out.println(me.su1);
		System.out.println(me.su2);
		me.func01();
		
		Ex55 you=new Ex55();
		System.out.println(you.su4);
		System.out.println(you.su5);
		
		Ex06 he=new Ex06();
	
		System.out.println(he.su7);
		
		me.func02();
		
	}

}
