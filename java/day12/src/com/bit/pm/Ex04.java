package com.bit.pm;


/*
 * 예외처리
 * 회피
 * 1.오류
 * 	 1)문법법 자동으로 표시
 * 	 2)논리적
 * 2.실행시 오류
 * 
 */


public class Ex04 {

	public static void main(String[] args) {
		java.lang.String msg=null;
		java.lang.Math.random();//java.lang 생략가능 
		int a=2;
		int b=0;
		int c=0;
		
		try{//예외처리
			System.out.println("에러 발생전");
			c=a/b;
			System.out.println("에러 발생후");
		}catch(ArithmeticException ex){
			System.out.println("에러 상황");
		}
		System.out.println("main end");

	}

}
