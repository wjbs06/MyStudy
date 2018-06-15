package com.bit.pm;

public class Ex05 {

	public static void main(String[] args) {
//		// 구구단 2*3
//		int[][] gugudan={
//				{2,3,4,5,6,7,8,9},
//				{4,6,8,10,12,14,16,18},
//				...
//				{18,27,36,45,54,63,72,81}
//				
//				
//		};
		int[][] gugudan=new int[8][9];
		for(int i=0;i<gugudan.length;i++){
			for(int j=0;j<gugudan[i].length;j++){
				gugudan[i][j]=(i+2)*(j+1);
			}
		}
		for(int i=0;i<gugudan.length;i++){
			System.out.print((i+2)+"단:");
			for(int j=0;j<gugudan[i].length;j++){
				System.out.print("\t"+(i+2)+"X"+(j+1)+"="+gugudan[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<9;i++){
			
			for(int j=0;j<8;j++){
				System.out.print(gugudan[j][i]+" ");
			}
			System.out.println();
		}
	}

}
