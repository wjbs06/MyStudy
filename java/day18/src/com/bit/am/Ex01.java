package com.bit.am;

public class Ex01 {

	
	public static void main(String[] args) {
		//문자열
//		String st1="abc";
//		for (int i = 0; i < 10; i++) {
//			String temp=st1+i;
//			System.out.println(temp);
//		}
		StringBuffer st2=new StringBuffer("문자열");
		StringBuffer st3=new StringBuffer("추가");
		StringBuffer st4=new StringBuffer(10);
		
		System.out.println(st2.append(st3));
		//저장공간 버퍼
		System.out.println(st4.capacity());
		System.out.println(st4.append("1"));
		System.out.println(st4.capacity());
		System.out.println(st4.append("1123123"));
		System.out.println(st4.capacity());
		System.out.println(st4.append("1"));
		System.out.println(st4.capacity());
		System.out.println(st4.append("1"));
		System.out.println(st4.capacity());
		System.out.println(st4.append("1"));
		System.out.println(st4.capacity());
		System.out.println(st4.append("1"));
		System.out.println(st4.capacity());
		
		
		
		
		
		
		
		
	}

}
