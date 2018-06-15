package com.bit.am;

public class Ex02 {
/*
 * Integer 숫자인 문자만 가능
 * 숫자외에 사용불가
 * 
 */
	public static void main(String[] args) {
		Integer a1=new Integer(1);
		Integer a2=new Integer("2");
		Integer a3=3;//오토랩핑 하위버전에서는 사용이 안된다.
		int a4=a1+a2;//언랩핑
		Integer a5=a1+a2;//계산을 위해서 언랩핑(객체가 숫자로 변환) 계산후 다시 오토랩핑됨
		
		System.out.println(a1+a2+a3);
		//속성 변수
		System.out.println(Integer.MIN_VALUE);//값이 변하지 않는 상수형 변수
		System.out.println(Integer.MAX_VALUE);//static 이다.
		System.out.println(a1.MAX_VALUE);
		System.out.println(a1.SIZE);
		System.out.println("-----------------------");
		//기능 메서드 static
		System.out.println("parseInt-----------");
		String su1="1234";
		System.out.println(su1+1);
		int result1=Integer.parseInt(su1);// 자주사용 문자열 -> 숫자  바꾸는 기능
		System.out.println(result1+1);    // INT 로 받으려면 parseInt 사용
		System.out.println("valueOf--------------");
		Integer result2=Integer.valueOf(su1);//Integer 로 받으려면 valueOf 사용
		System.out.println(result2+1);//
		Integer result3=Integer.valueOf(100);//int를 받아서 Integer로 오토랩핑
		System.out.println("진수사용--------------");
		int su=10;
		System.out.println("2진수"+su+":"+Integer.toBinaryString(su));//
		System.out.println("8진수"+su+":"+Integer.toOctalString(su));
		System.out.println("16진수"+su+":"+Integer.toHexString(su));
		
		
		System.out.println("-------------------------------");
		Integer b1=new Integer(101);
		Integer b2=new Integer(101);
		System.out.println("객체로 비교 주소값");
		System.out.println(b1==b2);
		System.out.println("값으로 비교");
		System.out.println(b1.equals(b2));
		System.out.println(Integer.valueOf(b1)==Integer.valueOf(b2));
		System.out.println("-------------------------------");
		System.out.println("숫자를 문자로");
		int c1=3;
		Integer c2=new Integer(c1);
		System.out.println("앞에 빈칸을 더함");
		System.out.println(""+c1+1);
		System.out.println("toStirng으로 더함");
		System.out.println(c2.toString()+1);
		System.out.println("-------------------------------");
		System.out.println("int 를 double 값으로 doubleValue");
		Integer d1=new Integer(100);
		int d2=d1.intValue();
		double d3=d1.doubleValue();
		System.out.println(d2);
		System.out.println(d3);
		System.out.println("int 를 byte 값으로 byteValue");
		byte d4=d1.byteValue();
		System.out.println(d4);
		System.out.println("int 를 short 값으로 shortValue");
		short d5=d1.byteValue();
		System.out.println(d5);
		
		
	}

}
