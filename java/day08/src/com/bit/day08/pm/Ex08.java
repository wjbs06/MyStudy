package com.bit.day08.pm;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] stars=new String[10];
		stars[0]="*";
		for(int i=1;i<stars.length;i++){
			stars[i]=stars[(i-1)]+"*";
			System.out.println(stars[i-1]);
		}
		
		int star=1;
		for(int i=0;i<4;i++){
			star=1;
			for(int j=0;j<i+1;j++){
				System.out.print(star+" ");
			}
			System.out.println();
		}
			
	
		for(int i='a';i<'h';i++){
			for(int j=0;j<3;j++){
				System.out.print((char)i);
				i++;
			}
			i--;
			System.out.println();
		}
		
		for(int i=0;i<4;i++){
			int abc='a';
			for(int j=0;j<i+1;j++){
				System.out.print((char)abc+" ");
				abc++;
			}
			System.out.println();
		}
		
		int abc='a';
		for(int i=0;i<4;i++){
			for(int j=0;j<i+1;j++){
				System.out.print((char)abc+" ");
				abc++;
			}
			System.out.println();
		}
		
		int k=4;
		for(int j=0;j<4;j++){
			for(int i=k;i>1;i--){
				System.out.print("  ");
				
			}
			for(int l=1;l<j+2;l++){
				System.out.print("¡Ù");	
			}
			k--;
			System.out.println();
		
		}
			
		k=4;
		for(int j=1;j<5;j++){
			for(int i=k;i>1;i--){
				System.out.print("  ");
				
			}
			for(int l=1;l<j*2;l++){
				System.out.print("¡Ù");	
			}
			k--;
			System.out.println();
		
		}
		k=3;
		for(int j=1;j<4;j++){
			
			for(int i=0;i<j;i++){
				System.out.print("  ");
				
			}
			for(int l=k*2;l>1;l--){
				System.out.print("¡Ù");	
			}
			k--;
			System.out.println();
		}
		
		double sum=0.0;
		for(int i=1;i<10000;i++){
			sum+=1.0*i/(i+1);
		}
		System.out.println(sum);

		double sum2=0.0;
		for(int i=2;i<=1000;i++){
			sum2+=1-1.0/i;
		}
		System.out.println(sum);
	}

}
