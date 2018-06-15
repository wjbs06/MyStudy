package com.bit.am;

public class Ex03 {

	
	public static void main(String[] args) {
	
		StringBuffer st1=new StringBuffer("Java");
		StringBuffer st2=new StringBuffer(1);
		System.out.println(st1.append(st2));
		StringBuffer st3=new StringBuffer();
		System.out.println(st3.capacity());
		for (int i = 0; i <16; i++) {
			st3.append(i);
		}
		System.out.println(st3);
		System.out.println(st3.capacity());
		st3.delete(0, 8);
		System.out.println(st3);
		System.out.println(st3.capacity());
		st3.trimToSize();
		System.out.println(st3);
		System.out.println(st3.capacity());
		st3.append("ab");
		System.out.println(st3);
		System.out.println(st3.capacity());
		
		
		
		
	}

}
