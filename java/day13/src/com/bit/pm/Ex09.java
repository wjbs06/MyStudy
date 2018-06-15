package com.bit.pm;

import java.util.Scanner;

/*
 * ===================================
 * 학생성적관리프로그램(ver 0.1.1)
 * ===================================
 * 총원>5
 * 1.전체보기 2.입력 3.상세보기>1
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
 * 입력시>예외처리
 * 숫자입력시 > 문자입력오류해결
 * 이름 > 3자
 * 각 점수 > 최소 0점~100점
 * 
 */

class Student{
	int num=0;
	String name="-";
	int kor,eng,math;
}
public class Ex09 {
static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Ex09 me=new Ex09();
		int con=0;
		int stdN=0;
		int su=0;
		boolean result=true;
		System.out.println("-------------------------------");
		System.out.println("학생성적관리프로그램(ver 0.1.0)");
		System.out.println("-------------------------------");
		System.out.print("총원>");
		su=sc.nextInt();
		Student[] arr=new Student[su];
		for(int i=0;i<su;i++){
			arr[i]=new Student();
		}
		while(result){
			System.out.print("1.전체보기 2.입력 3.상세보기 4.수정하기 5.삭제하기 0.종료>");
			con=me.excepMenu();
			System.out.println(con);
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
						System.out.println("종료합니다.");
						result=false;
						break;
				}//switch end
			}else{
				System.out.println("다시입력해주세요");
			}//if end
		}//while end
	}	
	
	public void show(Student[] arr){//1.전체보기
		System.out.println("-------------------------------");
		System.out.println("학번 |  이름  |  국어  | 영어 | 수학");
		System.out.println("-------------------------------");
		for(int i=0;i<arr.length;i++){
			System.out.println(" "+arr[i].num+"\t"+arr[i].name+"\t"+arr[i].kor+"\t"+arr[i].eng+"\t"+arr[i].math);
		}
		
	}
	
	public void insert(Student[] arr,int a){//2.입력
		int kor = 0;
		int eng = 0;
		int math = 0;
		int result=0;
		System.out.println("-------------------------------");
		System.out.print("학번>");
		arr[a].num=(a+1);
		System.out.println(arr[a].num);
		
		while(true){
			System.out.print("이름>");
			sc.nextLine();
			arr[a].name=sc.nextLine();
			if(arr[a].name.length()!=3){
				System.out.println("3글자가 아닙니다.");
			} else {result++;}
			System.out.print("국어>");
			kor=excepInput();
			if(!(kor>=0 && kor<=100)){
				System.out.println("0~100사이로 입력해주세요");
			} else {result++;}
			sc.nextLine();
			System.out.print("영어>");
			eng=excepInput();
			if(!(eng>=0 && eng<=100)){
				System.out.println("0~100사이로 입력해주세요");
			} else {result++;}
			sc.nextLine();
			System.out.print("수학>");
			math=excepInput();
			if(!(math>=0 && math<=100)){
				System.out.println("0~100사이로 입력해주세요");
			} else {result++;}
			
			if(result==4){break;} else{System.out.println("다시입력해주세요");}
		}//while end
		
		arr[a].kor=kor;
		arr[a].eng=eng;
		arr[a].math=math;
	}
	
	public void showDetail(Student[] arr){//3.상세보기
		System.out.print("학번>");
		int con=0;
		con=sc.nextInt();
		con--;
		System.out.println("-------------------------------");
		System.out.println("학번 | 국어  | 영어 | 수학");
		System.out.println("-------------------------------");
		System.out.println(" "+arr[con].num+"\t"+arr[con].name+"\t"+arr[con].kor+"\t"+arr[con].eng+"\t"+arr[con].math);
	}
	
	public void change(Student[] arr){//4.수정하기
		System.out.println("-------------------------------");
		System.out.print("수정할 학번>");
		int con=sc.nextInt();
		con--;
		System.out.print("국어>");
		arr[con].kor=sc.nextInt();
		System.out.print("영어>");
		arr[con].eng=sc.nextInt();
		System.out.print("수학>");
		arr[con].math=sc.nextInt();
	} 
	
	public void del(Student[] arr){//5.삭제하기
		System.out.println("-------------------------------");
		System.out.print("삭제할 학번>");
		int con=sc.nextInt();
		con--;
		arr[con].num=0;
		arr[con].name="-";
		arr[con].kor=0;
		arr[con].eng=0;
		arr[con].math=0;
		System.out.println("삭제완료");
	}
	
	public int excepMenu(){
		int su=-1;
		do{
			try	{
				su=sc.nextInt();
			}catch(java.util.InputMismatchException ex){
				System.out.println("숫자로 입력해주세요");
				sc=new Scanner(System.in);
			}
		}while(!(su>=0&&su<=5));
		return su;
	}
	
	public int excepInput(){
		int su=-1;
		do{
			try	{
				su=sc.nextInt();
			}catch(java.util.InputMismatchException ex){
				System.out.println("숫자로 입력해주세요");
				sc=new Scanner(System.in);
			}
		}while(!(su>=0&&su<=100));
		return su;
	}
}
