package com.bit.am;

import java.util.Scanner;

/*-------------------------------
 * 학생성적관리프로그램(ver 0.1.0)
 * -------------------------------
 * 1.전체보기 2.입력 3.상세보기>2
 * 국어>90
 * 영어>80
 * 수학>70
 * 1.전체보기 2.입력 3.상세보기>1
 * -------------------------------
 * 학번 | 국어 | 영어 | 수학
 * -------------------------------
 *  01     90     80     70
 *  02     80     80     80
 * 1.전체보기 2.입력 3.상세보기>3
 * 학번>2
 * -------------------------------
 * 학번 | 국어 | 영어 | 수학
 * -------------------------------
 *  02     80     80     80
 * -------------------------------
 */
public class Ex01 {
	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Ex01 me=new Ex01();
		int con=0;
		int stdN=0;
		int tot=0;
		boolean result=true;
		System.out.println("-------------------------------");
		System.out.println("학생성적관리프로그램(ver 0.1.0)");
		System.out.println("-------------------------------");
		System.out.print("총원>");
		tot=sc.nextInt();
		int[][] arr=new int[tot][4];
		while(result){
			System.out.print("1.전체보기 2.입력 3.상세보기 4.수정하기 5.삭제하기 0.종료>");
			con=sc.nextInt();
			if(con>=0&&con<=5){
				switch(con){
					case 1:
						me.show(arr);
						break;
					case 2:
						me.insert(arr,stdN);
						stdN++;
						break;
					case 3:
						me.showDetail(arr);
						break;
					case 4:
						me.change(arr);
						break;
					case 5:
						me.del(arr);
						break;
					case 0:
						System.out.println("이용해주셔서 감사합니다.");
						result=false;
						break;
				}//switch end
			}else{
				System.out.println("다시입력해주세요");
				break;
			}//if end
		}//while end
	}	
	
	public void show(int[][] arr){//1.전체보기
		System.out.println("-------------------------------");
		System.out.println("학번 | 국어  | 영어 | 수학");
		System.out.println("-------------------------------");
		for(int i=0;i<arr.length;i++){
			System.out.println(" "+arr[i][0]+"\t"+arr[i][1]+"\t"+arr[i][2]+"\t"+arr[i][3]);
		}
		
	}
	
	public void showDetail(int[][] arr){//2.상세보기
		System.out.print("학번>");
		int con=0;
		con=sc.nextInt();
		con--;
		System.out.println("-------------------------------");
		System.out.println("학번 | 국어  | 영어 | 수학");
		System.out.println("-------------------------------");
		System.out.println(" "+arr[con][0]+"\t"+arr[con][1]+"\t"+arr[con][2]+"\t"+arr[con][3]);
	}
	
	public void insert(int[][] arr,int a){//3.입력
		System.out.println("-------------------------------");
		System.out.println("학번>"+(a+1));
		arr[a][0]=a+1;
		System.out.print("국어>");
		arr[a][1]=sc.nextInt();
		System.out.print("영어>");
		arr[a][2]=sc.nextInt();
		System.out.print("수학>");
		arr[a][3]=sc.nextInt();
	}
	
	public void change(int[][] arr){//4.수정하기
		System.out.println("-------------------------------");
		System.out.print("수정할 학번>");
		int con=sc.nextInt();
		con--;
		System.out.print("국어>");
		arr[con][1]=sc.nextInt();
		System.out.print("영어>");
		arr[con][2]=sc.nextInt();
		System.out.print("수학>");
		arr[con][3]=sc.nextInt();
	} 
	
	public void del(int[][] arr){//5.삭제하기
		System.out.println("-------------------------------");
		System.out.print("삭제할 학번>");
		int con=sc.nextInt();
		con--;
		arr[con][0]=0;
		arr[con][1]=0;
		arr[con][2]=0;
		arr[con][3]=0;
		System.out.println("삭제완료");
	}
	
}
