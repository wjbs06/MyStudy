package com.bit.pm;

public class Ex04 {

	public static void main(String[] args) {
		try{
			ArithmeticException ac=new ArithmeticException();
			throw ac;
		}catch(ArithmeticException ex){
			System.out.println("0으로 나눌때 에러 처리");
		}

	}

}
