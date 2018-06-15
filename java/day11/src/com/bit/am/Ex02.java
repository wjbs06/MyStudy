package com.bit.am;
/*
 * Q1. a=5,b=1,c=3
 *  이를 오름차순으로 출력
 *  
 * Q2. int[] arr={5,1,3}
 *  이를 오름차순으로 출력
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		int a=5;
		int b=1;
		int c=3;
		if(a>b){
			if(a>c){
				if(b>c){
					System.out.println(a+" "+b+" "+c);
				} else {
					System.out.println(a+" "+c+" "+b);
				}
			} else {
				System.out.println(c+" "+a+" "+b);
			}
		} else if(b>c){
			System.out.println(b+" "+c+" "+a);
		} else {
			System.out.println(c+" "+b+" "+a);
		}
		
		
		int[] arr={5,1,3};
		int d=0;
		if(arr[0]>arr[1]){
			if(arr[1]>arr[2]){
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
			} else {
				d=arr[1];
				arr[1]=arr[2];
				arr[2]=d;
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
			}
		} else {
			d=arr[0];
			arr[0]=arr[1];
			arr[1]=d;
			if(arr[1]>arr[2]){
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
			} else {
				d=arr[1];
				arr[1]=arr[2];
				arr[2]=d;
				if(arr[0]>arr[1]){
					System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
				}else{
					d=arr[0];
					arr[0]=arr[1];
					arr[1]=d;
					System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
				}
			}
		}
		
		
		

	}
}
