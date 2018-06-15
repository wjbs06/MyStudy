package com.bit.pm;
/*
 * 배열 -> 객체
 * 변수명 - 참조변수
 * arr1.length 멤버필드를 사용
 * 
 * 
 */
public class Ex01 {

	
	public static void main(String[] args) {
		
		int[] arr1=new int[5];
		
		arr1[0]=100;
		arr1[1]=200;
		arr1[2]=300;
		arr1[3]=400;
		arr1[4]=500;
		System.out.println("배열의 복사- 얕은 복사");
		System.out.print("arr1:");
		for(int i=0;i<arr1.length;i++){//length  괄호가 없으므로 메서드가 아닌 필드
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		int[] arr2=arr1;
		System.out.print("arr2:");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		arr1[2]=2333;
		System.out.print("arr1:");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\narr2:");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("배열의 복사- 깊은 복사");
		
		int[] arr3;//객체 배열을 생성하고
		arr3=new int[arr1.length];//같은크기로 생성
		
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		}
		arr3[1]=2;
		System.out.print("arr1:");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\narr3:");
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
		System.out.println("\n--------------------------");
		System.out.println("arr1==arr2 "+(arr1==arr2));
		System.out.println("arr1==arr3 "+(arr1==arr3));

	}

}
