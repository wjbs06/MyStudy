package com.bit.am;

public class Ex05 {
	static int[] arr01= new int[0];

	public static void main(String[] args) {
		
//		
//		arr01=new int[1];
//		arr01[0]=100;
//		
//		temp=new int[2];
//		temp[0]=arr01[0];
//		arr01=temp;
//		arr01[1]=200;
//		
//		temp=new int[3];
//		temp[1]=arr01[1];
//		arr01=temp;
//		arr01[2]=300;


		add(100);
		add(200);
		add(300);
		add(400);
		add(500);
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
		}
		
	}
	public static void add(int a){
		int[] temp=null;
		temp=new int[arr01.length+1];
		for(int i=0;i<arr01.length;i++){
			temp[i]=arr01[i];
			
		}
		arr01=temp;
		arr01[arr01.length-1]=a;
	}
}
