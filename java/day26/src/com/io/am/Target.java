package com.io.am;

import java.io.Serializable;

public class Target implements Serializable{

	private static final long serialVersionUID = 1L;
		transient int sum1;//transient 값이 전달X
		private int sum2;
		int sum3;
		public Target(){
			sum1=111;
			sum2=222;
			sum3=333;
		}
		public void func1(){
			System.out.println("내가 만든 기능1"+sum2);
		}
		public void func2(){
			System.out.println("내가 만든 기능2");
		}
}