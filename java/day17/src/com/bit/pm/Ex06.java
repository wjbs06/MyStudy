package com.bit.pm;

public class Ex06 {

	
	public static void main(String[] args) {
		String msg1="abcabcabcabcd";
		System.out.println(msg1.contains("cd"));
		System.out.println(msg1.endsWith("fg"));
		System.out.println(msg1.startsWith("abc"));
		System.out.println(msg1.indexOf('c',3));
		System.out.println(msg1.lastIndexOf("abc",8));
		char[] ch={'a','b','c'};
		System.out.println(String.valueOf(ch));
		String msg2="Java";
		String msg3=new String("Java");
		System.out.println(msg2==msg3);
		System.out.println(msg2.equals(msg3));
		// 0 같음
		// 다른 index 차이
		// 길이
		System.out.println(msg2.compareTo(msg3));
	}

}
