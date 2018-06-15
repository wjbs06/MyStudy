package com.bit.pm;

import java.util.InputMismatchException;

public class Ex09 {

	
	public static void main(String[] args) {
		
		func01(10,1);
		func02(10,0);

	}
	
	static void func01(int a,int b){
		try{
			int result=a/b;
			System.out.println(result);
		}catch(InputMismatchException ex){
//		}catch(ArithmeticException ex){
			System.out.println("에러 회피");
			return;
		}finally{//try 가 실행되면 finally 는 반드시 실행
		System.out.println("func01 end");
		}
	}
	
	
	static void func02(int a,int b)throws ArithmeticException{
		int result=a/b;
		System.out.println(result);
	}

}
