package com.bit.day08.pm;

public class Ex04 {




	public static void main(String[] args) {
		int size='Z'-'A'+1;
		char[] chs=new char[size];
		for(int i=0;i<size;i++){
			chs[i]=(char)(65+i);
		}
		
		
		for(int i=0;i<size;i++){
			System.out.print(chs[i]+" ");
		}
		
		System.out.println("\nsize:"+size);
		System.out.println("size:"+chs.length);
		
	}

}
