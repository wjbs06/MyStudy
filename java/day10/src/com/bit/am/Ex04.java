package com.bit.am;

public class Ex04 {


	public static void main(String[] args) {
		//�Ǽ�
		double a1=3.14;
		Double a2=new Double(3.14);
		Double a3=new Double("3.14");
		Double a4=3.14;
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.SIZE);
		System.out.println("--------------------------");

		System.out.println(Double.parseDouble("3.14"));
		System.out.println(Double.valueOf("3.14"));
		System.out.println(a2==a3);
		System.out.println(a2.equals(a3));
		System.out.println("--------------------------");
		Double b1=3.0/0;
		Double b2=0.0/3;
		Double b3=0.0/0;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("--------------------------");
		System.out.println(Double.isInfinite(b1));
		System.out.println(Double.isNaN(b1));
		System.out.println(Double.isInfinite(b3));
		System.out.println(Double.isNaN(b3));
		
		
		
		
	}

}
