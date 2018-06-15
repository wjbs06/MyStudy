package com.bit.day07;

public class Ex02 {
/*
 * 클래스의 구성요소
 * 1.메서드(static, non-static)
 * 2.변수(static[클래스변수],non-static[멤버필드])
 * 		기본값이 존재, 초기화를 안해도 디폴트값이 있다.
 *		선언과 초기화가 동시에 필수
 */
	public static int sum=0;//클래스변수 
	
	
	public static void main(String[] args) {
		int temp;

		Ex02 me=new Ex02();
		temp=1000;
		sum=me.add(temp);
		System.out.println("sum: "+sum);
		temp=200;
		sum=me.del(temp);
		System.out.println("sum: "+sum);
		temp=300;
		sum=me.del(temp);
		System.out.println("sum: "+sum);
	}

	public int add(int a){
		return sum+a;
	}
	
	public int del(int a){
		return sum-a;
	}
	
}
