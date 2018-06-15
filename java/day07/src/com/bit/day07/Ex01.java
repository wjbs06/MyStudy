package com.bit.day07;
/*
 * 매서드\
 * 이름:알파벳 소문자로 시작 중복X
 * 오버로드: 중복허용
 * 			인자의 유무,인자의 자료형,인자의 갯수
 */

public class Ex01 {

	public static void main(String[] args) {
		Ex01 me=new Ex01();
		System.out.println("test");
		func01();
		func01(100);
		me.func01(12,100);
		func01("ㄱㅁ",100);
		func01(100,"asd");
	}

	public static void func01(){
		System.out.println("func01");
	}

	public static void func01(int a){
		System.out.println("func01-a:"+a);
	}
	
	public void func01(int a,int b){
		System.out.println("func01-a-b "+a+"\t"+b);
	}
	
	public static void func01(String a,int b){
		System.out.println("func01-a-b "+a+"\t"+b);
	}
	
	public static void func01(int a,String b){
		System.out.println("func01-a-b "+a+"\t"+b);
	}
}

