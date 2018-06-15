package com.bit.am;

public class Ex04 {

	public static void main(String[] args) {
		StringBuffer msg1=new StringBuffer("abcdefg");
		msg1.reverse();
		System.out.println(msg1);
		
		char[] ch=new char[msg1.length()];
		msg1.getChars(0, 7, ch, 0);
		for (int i = 0; i < ch.length; i++) {			
			System.out.println(ch[i]);
		}
		String msg2=new String(ch);
		System.out.println(msg2);
		
		StringBuilder msg3=new StringBuilder("abcdefg");
		System.out.println(msg3);
		
	}

}
