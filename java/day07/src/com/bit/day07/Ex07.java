package com.bit.day07;
/*
 * 학생 성적 관리 프로그램(ver 0.0.2)
 * 
 * 2개 반
 * 
 * 1.반 선택 2.결과보기>1
 * 
 * 반>1
 * 
 * 1반 1번학생 국어>
 * 1반 1번학생 영어>
 * 1반 1번학생 수학>
 * 
 * 입력 결과-국어 : XX, 영어 : xx, 수학 : xx
 * 
 * 1.반 선택 2.결과보기>1
 * 
 * 반>2
 * 
 * 2반 1번학생 국어>
 * 2반 1번학생 영어>
 * 2반 1번학생 수학>
 * 
 * 입력 결과-국어 : XX, 영어 : xx, 수학 : xx
 * 
 * 1.반 선택 2.결과보기>2
 * ----------------------
 * 1반
 * ----------------------
 * 총원 : xx명
 * 국어 평균 : xx.xx
 * 영어 평균 : xx.xx
 * 수학 평균 : xx.xx
 * ----------------------
 * 2반
 * ----------------------
 * 총원 : xx명
 * 국어 평균 : xx.xx
 * 영어 평균 : xx.xx
 * 수학 평균 : xx.xx 
 */
/*
	class Ban{
		int banId;
		
	}

	class Student{
		int studentId;
		int kor,eng,math,sum;
		double avg;
	}
	
	class management{
		Ban ban=new Ban();
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		public void show(){//결과 출력
			for(int i=1;i<=std.studentId;i++){
				std.avg=avg(std.kor, std.eng, std.math);
			}
			
			System.out.println("----------------------");
			System.out.println(ban.banId+"반");
			System.out.println("----------------------");
			System.out.println("총원 :"+std.studentId+"명");
			System.out.println("국어 평균 :"+std.kor);
			System.out.println("영어 평균 :"+std.eng);
			System.out.println("수학 평균 :"+std.math);
		}
		
		public void add(){//학생추가,점수입력
			int n=0;
			System.out.print("반>");
			ban.banId=sc.nextInt();
			if(ban.banId==1){
				n++;
				Student std=new Student();
				std.studentId++;
			}
			System.out.println("----------------------");
			System.out.println(ban.banId+"반");
			System.out.println("----------------------");
			System.out.print(ban.banId+"반"+std.studentId+"번학생 국어>");
			std.kor=sc.nextInt();
			System.out.print("1반 1번학생 영어>");
			std.eng=sc.nextInt();
			System.out.print("1반 1번학생 수학>");
			std.math=sc.nextInt();
			
			System.out.println("입력 결과-국어 : "+std.kor+", 영어 : "+std.eng+", 수학 : "+std.math);
		}
		
		public double avg(int kor,int eng,int math){//평균 계산
			int sum=kor+eng+math;
			double avg=sum*100/3/100;
			return avg;
		}
	}

public class Ex07{

	
	public static void main(String[] args) {
		int con=1;
		management me=new management();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("학생 성적 관리 프로그램(ver 0.0.2)");
		System.out.println("1.반 선택 2.결과보기 0.종료>");
		con=sc.nextInt();
		
		switch(con){
			case 1:
				me.add();
				break;
			case 2:
				me.show();
				break;
			case 0:
				break;
			default :
				break;
		}
		
	}

}
*/