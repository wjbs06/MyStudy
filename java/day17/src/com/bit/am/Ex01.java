package com.bit.am;

public class Ex01 {

	
	public static void main(String[] args) {
		//예외처리 - 오류회피
			
		for (int i = 0; i < 5; i++) {
		try{
				int a=5/i;
				System.out.println("5/"+i+"="+a);
			
		}catch(ArithmeticException ex){
			System.out.println("오류");
		}
		}
	}

}
