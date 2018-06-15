package com.bit.pm;

public class Ex03 {

	public static void main(String[] args) {
		int[] arr1={1,3,5};
		int[] arr2=arr1;
		
		
		System.out.println("arr1引 arr2: "+(arr1==arr2));
		
		int[] arr3={1,3,5};//new int[arr1.length];
//		System.arraycopy(arr1, 0, arr3, 0, arr3.length);
		System.out.println("arr1引 arr3: "+(arr1==arr3));
		System.out.println("arr1引 arr3(equals): "+(arr1.equals(arr3)));
		System.out.println("arr1引 arr3(same): "+same(arr1,arr3));
		int[] arr4={1,2,3};
		System.out.println(arr4);
		func(arr4);
	}

	public static void func(int[] arr4){
		System.out.println("func: "+arr4);
	}
	
	public static boolean same(int[] arr1,int[] arr3){
		

		boolean result=true;
		if(arr1.length!=arr3.length){
			result=false;
		}else{
			System.out.println("arr1.length=arr3.length: "+result);
			for(int i=0;i<arr3.length;i++){
				if(arr1[i]!=arr3[i]){
					result=false;
				}
			}
		}
		
		System.out.println("arr1.length=arr3.length: "+result);
		
		
		
		
		
		return result;
	}
	
}




