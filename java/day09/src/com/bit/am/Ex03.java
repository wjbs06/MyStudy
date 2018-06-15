package com.bit.am;

public class Ex03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg1="abc";
		String msg2=msg1+"1234";
		String msg3=msg1.concat(msg2);
		System.out.println(msg3);
		System.out.println("----------------");
		System.out.println("วั".concat("ฑÛ"));
		System.out.println("----------------");
		System.out.println("abcd".length());
		System.out.println("----------------");
		System.out.println("".length());
		System.out.println("----------------");
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		System.out.println("----------------");
		String msg4="java";
		String msg5=new String("java");
		
		char[] ch1=new char[4];
		ch1[0]='j';
		ch1[1]='a';
		ch1[2]='v';
		ch1[3]='a';
		String msg6=new String(ch1);
		System.out.println(msg6);
		
		
	}
	
}
