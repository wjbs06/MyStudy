package com.bit.pm;

import java.util.Random;
import java.util.Scanner;

/*
 * 로또번호 생성기
 * SBS 토 pm 8시40분
 * 숫자 6개
 * 1~45
 * 중복불가
 * 뽑을땐 순서없이
 * 발표할땐 순서대로 오름차순
 * 
 * 객체
 */
public class Lotto {
	Scanner sc=new Scanner(System.in);
	Random random=new Random();
	int[] LottoN=new int[45];
	
	public static void main(String[] args) {
		Lotto me=new Lotto();
		me.show();
	}
	
	public void show(){
		System.out.println("로또추첨");
		System.out.print("1.5000 2.3000 3.1000>");
		int con=sc.nextInt();
		switch(con){
			case 1:
				con=con*5;
				LottoNum(con);
				break;
			case 2:
				con++;
				LottoNum(con);
				break;
			case 3:
				con=con/3;
				LottoNum(con);
				break;	
			default:
				break;
		}
	}
	
	public void LottoNum(int su){//횟수를 인자로 받음.
		int[][] MyNum=new int[su][6];
		
		for(int i=0;i<su;i++){//횟수에 해당하는 for
			for(int a=0;a<45;a++){//LottoN에 45개의 숫자를 넣음.
				LottoN[a]=a+1;
			}
			
			for(int j=0;j<45;j++){//LottoN 45개의 숫자를 무작위로 섞음
				int temp=0;
				int n;
				temp=LottoN[j];
				while(true){
					n=random.nextInt(45);
					if(n!=j){break;}
				}	
				LottoN[j]=LottoN[n];
				LottoN[n]=temp;
			}
			/*
			 * for(int i=0;i<10000;i++){
			 * int ran=(int)(Math.random()*44)+1;
			 * int temp=LottoN[0]
			 * LottoN[0]=LottoN[ran];
			 * LottoN[ran]=temp;
			 * 
			 * }
			 */
			for(int j=0;j<6;j++){//LottoN 앞에서 6개의 숫자를 뽑음
				MyNum[i][j]=LottoN[j];
			}
				
			//번호의 순서를 오름차순으로 해야함.
			int temp = 0; 
	        for (int j = 0; j < MyNum[i].length; j++) {
	            for (int k = j + 1; k < MyNum[i].length; k++) {
	            	if (MyNum[i][j] > MyNum[i][k]) {
	            			temp = MyNum[i][j];
	            			MyNum[i][j] = MyNum[i][k];
	            			MyNum[i][k] = temp;
	            	}
	            }
	        }
	        System.out.print("[");
	        for(int b=0;b<MyNum[i].length;b++){
	        	System.out.print(MyNum[i][b]+"\t");
	        }
	        System.out.print("]");
	        System.out.println();
		}
	}
}

