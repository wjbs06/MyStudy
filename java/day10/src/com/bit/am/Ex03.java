package com.bit.am;

public class Ex03 {

	public static void main(String[] args) {
		//
		byte a1=127;
		Byte a2=new Byte(a1);//byte 의 오토랩핑은 int 타입인 숫자대신 byte 값을 넣어야한다.
		Byte a3=new Byte("127");//문자열이면 가능 byte의 표현볌위 안에서 -128~127
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.SIZE);
		System.out.println("short------------------");
		short b1=123;
		short b2=new Short(b1);
		short b3=new Short("1234");
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.SIZE);
		System.out.println("long------------------");
		long c1=12345678L;
		Long c2=new Long(123456);
		Long c3=new Long(123456L);
		Long c4=new Long("23456");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.SIZE);
		
		
		
		

	}

}
