package com.bit.day08.pm;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * 배열
		 * 자료형[] 변수명 = new 자료형[개수];
		 * 자료형[] 변수명; 배열의 선언
		 * 변수명=new 자료형[개수]; 초기화
		 * 변수명[인덱스]
		 * 0부터 시작, 연속된 숫자
		 * 초기화
		 * 변수명[인덱스]=초기값;
		 */
		
		int[] arr1=new int[5];
		for(int i=0;i<5;i++){
			arr1[i]=i+1;
	
			
		}
		
		for(int i=0;i<5;i++){
			arr1[i]=i+1;
			System.out.println("arr["+i+"]="+arr1[i]);
			
		}
		System.out.println("-------------------------------");
		
		//int[] arr2=new int[]{1,4,10,8,7};
		int[] arr2={1,4,10,8,7};
	
		for(int i=0;i<5;i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
			
		}

	}

}
