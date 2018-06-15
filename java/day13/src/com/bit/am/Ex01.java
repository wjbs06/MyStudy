package com.bit.am;

/* 패키지
 * 임포트 - 앞으로 등장할 클래스의 위리를 찾는
 * 			예외) 해당패키지&&java.lang.~제외
 * 
 * * 의 사용을 자제
 * 최대한 자세히 쓸것.
 */

//import java.util.Scanner;
//import java.util.Calendar;
//import java.util.Random;
import java.util.Scanner;


public class Ex01 {
	
	/*
	 * 클래스(전역변수,생성자,메서드)
	 * 전역변수
	 * 생성자 - 객체 생성시에 수행할 내용 - 필드 초기화
	 * default - 인자가 없는 생성자
	 * 메서드
	 * non-static(고유값)/static(공통)
	 * static caseBycase
	 * 	
	 */
	
	public Ex01(){
//		super();
		this("");//밑의 생성자를 호출
		System.out.println("Ex01");
		this.func01();
	}
	public Ex01(String st){
//		super();
		System.out.println("Ex01(asdf)");
	}
	
	public static void main(String[] args) {
		com.bit.am.Scanner sc=new com.bit.am.Scanner();
		Scanner sc2=new Scanner(System.in);
		Ex01 me=new Ex01();
		me.func01();
	}

	public void func01(){
		this.func02(); //참조변수가 생략된 이유는 this가 생략되어서
	}
	
	public void func02(){
		
	}
	
}
