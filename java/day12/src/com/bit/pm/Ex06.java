package com.bit.pm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int su=0;
		String msg=null;
		for(int i=0;i<5;i++){
			try{
				System.out.print("숫자>");				
				su=sc.nextInt();
				System.out.print("문자열>");				
				msg=sc.nextLine();
				System.out.println(msg+"="+su);
				
			}catch(InputMismatchException ex){
				System.out.println("0으로 나눌수 없습니다.");
				sc=new Scanner(System.in);
			}//예외 end
		}//for end
		
	}//main end

}
