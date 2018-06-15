package com.bit.day08.am;

public class Ex02 {
	/*
	 * 생성자
	 * return 값이 없다.(void 없음)
	 * 이름 고정(class 이름)
	 * 생성자는 기본적으로 생략
	 * 생성자의 대표적기능 - 필드의 초기화
	 * 오버로드 기능 - 메서드, 생성자
	 */
	int sum;
	
	public Ex02(int a){
		sum=a;
		System.out.println("생성자 발동"+sum);
	}
	
	public Ex02(String msg,int a){
		sum=a;
		System.out.println("생성자 발동"+sum+msg);
	}
	
	public static void main(String[] args) {
		Ex02 me=new Ex02("인자",10);
		System.out.println(me.sum);
		me=new Ex02(12);
		System.out.println(me.sum);
	}

}
