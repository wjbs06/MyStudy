package com.bit.pm;

public class Ex02 {

	public static void main(String[] args) {
	
		//배열의 깊은 복사
		//1.
		int[] arr1={1,3,5,7};
		int[] arr2=new int[arr1.length];
		for(int i=0;i<arr2.length;i++){
			arr2[i]=arr1[i];
		}
		//2.
		int[] arr3=new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr3.length);
		//System.arraycopy(원본-변수명, 시작 index, 대상, 시작 index, 복사할개수);
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
		
		System.out.println();
		System.out.println("arr1=arr3 "+(arr1==arr3));

	}

}
