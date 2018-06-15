package com.bit.pm;

import java.util.Scanner;

/* 
 * String db="";
 * 
 * ---------------------------------
 * 학생성적관리프로그램 (ver. 0.3.0)
 * ---------------------------------
 * 1.입력 2.보기 3.상세보기 (4.삭제)>1
 * 이름>
 * 국어>
 * ...
 * 
 * ---------------------------------------
 * 학번 | 성명 | 국어 | 영어 | 수학
 * ---------------------------------------
 * 1	 홍길동  100	100	   100
 * 2	 홍길동  100	100	   100
 * 3	 홍길동  100	100	   100
 * 4	 홍길동  100	100	   100
 * 5	 홍길동  100	100	   100
 * 6	 홍길동  100	100	   100
 * 
 */

public class Ex03 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name="-";
		int num=0;
		int kor,eng,math;
		boolean result=true;
		String db="";
		
		
		String title="---------------------------------\n"+
					"학생성적관리프로그램 (ver. 0.3.0)\n"+
					"---------------------------------";
		String menu="1.입력 2.보기 3.상세보기 4.삭제 0.종료>";
		System.out.println(title);
		
		while(result){
		System.out.print(menu);
		int con=sc.nextInt();
			switch (con) {
			case 1:
				num++;
				sc.nextLine();
				System.out.print("이름>");
				name=sc.nextLine();
				System.out.print("국어>");
				kor=sc.nextInt();
				System.out.print("영어>");
				eng=sc.nextInt();
				System.out.print("수학>");
				math=sc.nextInt();
				db+=num+"@"+name+"@"+kor+"@"+eng+"@"+math+"\n";
				break;
			case 2:
				if(db==""){System.out.println("입력해주세요");break;}
				System.out.println("-------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학");
				System.out.println("-------------------------------------");
				String[] students=(String[]) db.split("\n");
				for (int i = 0; i < students.length; i++) {
					String temp=students[i];
					String[] stu=temp.split("@");
					System.out.print(stu[0]);
					System.out.print("\t");
					System.out.print(stu[1]);
					System.out.print("\t");
					System.out.print(stu[2]);
					System.out.print("\t");
					System.out.print(stu[3]);
					System.out.print("\t");
					System.out.print(stu[4]);
					System.out.println("\t");
				}
				break;
			case 3:
				if(db==""){System.out.println("입력해주세요");break;}
				int su=0;
				System.out.print("학번>");
				su=sc.nextInt();
				System.out.println("-------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학");
				System.out.println("-------------------------------------");
				students=(String[]) db.split("\n");
				for (int i = su-1; i < su; i++) {
					String temp=students[i];
					String[] stu=temp.split("@");
					System.out.print(stu[0]);
					System.out.print("\t");
					System.out.print(stu[1]);
					System.out.print("\t");
					System.out.print(stu[2]);
					System.out.print("\t");
					System.out.print(stu[3]);
					System.out.print("\t");
					System.out.print(stu[4]);
					System.out.println("\t");
				}
				break;
			case 4:
				su=0;
				System.out.print("학번>");
				su=sc.nextInt();
				students=(String[]) db.split("\n");
				db="";
				students[su-1]="";
				
				for (int j = su; j < students.length; j++) {
					
					String temp=students[j];
					String[] stu=temp.split("@");
					stu[0]=j+"";
					for (int i = 0; i < stu.length; i++) {
						if(i==4){
							students[j-1]+=stu[i];
						}else{							
							students[j-1]+=stu[i]+"@";
						}
					}
				}
				int a=students.length;
				students[a-1]="";
				for(int i=0;i<students.length;i++){
					if(students[i]!=""){						
						db+=students[i]+"\n";
					}
				}
				num--;
				break;
			case 0:
				result=false;
				break;
			}
		}
		
		

	}

}
