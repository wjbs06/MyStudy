package com.bit.am;

public class Ex06 {

	
	public static void main(String[] args) {
		
		float a1=3.14f;
		Float a2=new Float(a1);
		Float a3=new Float("3.14");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println("---------------------------------");
		System.out.println("intValue로 double을 int로 형변환");
		Double b1=new Double(3.14);
		int b2=b1.intValue();//double 을 int 로 형변환
		System.out.println(b2);
		System.out.println(a2.intValue());
		System.out.println(b1.floatValue());
		

	}

}
