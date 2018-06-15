package com.bit.pm;

import java.util.Scanner;

public class Ex01 {

	
	public static void main(String[] args) {
		// 예외처리
		Scanner sc= new Scanner(System.in);
		int result=0;
		
		try{
			try{
			int su=5/0;
			}catch(java.lang.ArithmeticException ex){
				System.out.println("0으로 나누지 못함");
			}
		} catch(java.util.InputMismatchException ex){
			System.out.println("숫자입력이 아님");
		}
	
		
		
	}

}
