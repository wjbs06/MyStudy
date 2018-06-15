package com.bit.pm;

import java.util.Random;

public class Ex10 {

	
	public static void main(String[] args) {
		Random ran=new Random(System.currentTimeMillis());
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt(45)+1);
		
		
		
	}

}
