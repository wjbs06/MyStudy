package com.bit.pm;

public class Ex07 {

	
	public static void main(String[] args) {
		String msg="boo:and:foo";
		String[] part=msg.split(":");
		for (int i = 0; i < part.length; i++) {
			System.out.println(part[i]);
		}
		
		
	}

}
