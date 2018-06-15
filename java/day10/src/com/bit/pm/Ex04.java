package com.bit.pm;


public class Ex04 {

	public static void main(String[] args) {
		int[] arr=null;
		arr=new int[5];
		arr[1]=2;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		//다중배열
		int[][] arrs=new int[2][3];
		arrs[0]=new int[3];
		arrs[1]=new int[3];
		
		arrs[0][0]=11;
		arrs[0][1]=22;
		arrs[0][2]=33;
		arrs[1][0]=44;
		arrs[1][1]=55;
		arrs[1][2]=66;
		for(int i=0;i<arrs.length;i++){
			for(int j=0;j<3;j++){
				System.out.print(arrs[i][j]+" ");
			}
				System.out.println();
		}
		
		int[][] arrs1={
						{11,22,33},
						{44,55},
						{77,88,99}		
					};
		System.out.println("--------------------------");
		for(int i=0;i<arrs1.length;i++){
			for(int j=0;j<arrs1[i].length;j++){
				System.out.print(arrs1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int[][] arr2=new int[3][];
		arr2[0]=new int[]{11,22,33};
		arr2[1]=new int[2];
		arr2[2]=new int[3];
	
		
		
		
		
		
		
		
		
	}

}
