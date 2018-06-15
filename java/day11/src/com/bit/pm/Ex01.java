package com.bit.pm;

public class Ex01 {

	
	public static void main(String[] args) {
		// Á¤·Ä
		int[] arr={3,9,1};
		
		int temp = 0; 
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
            	if (arr[j] > arr[k]) {
            			temp = arr[j];
            			arr[j] = arr[k];
            			arr[k] = temp;
            	}
            }
        }
        for(int i=0;i<arr.length;i++){
        	System.out.print(arr[i]+" ");
        }

	}
}
