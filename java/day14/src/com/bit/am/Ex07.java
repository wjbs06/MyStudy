package com.bit.am;

import java.util.Scanner;

/*
 * -------------------------------------------------
 * MyBBS게시판 (ver0.0.1)
 * -------------------------------------------------
 * 1.목록 2.글쓰기 3.글삭제>2
 * 제목>test1
 * 내용>test
 * 
 * 1.목록 2.글쓰기 3.글삭제>1
 * ------------------
 * 제목 | 내용
 * ------------------
 * test1|ㄴㅇㄹ
 * ------------------
 * 
 * 1.목록 2.글쓰기 3.글삭제>2
 * 제목>test2
 * 내용>test
 * 
 * 1.목록 2.글쓰기 3.글삭제>1
 * ------------------
 * 제목 | 내용
 * ------------------
 * test1|ㄴㅇㄹ
 * test2|asdf
 * ------------------
 * 
 * 
 * 
 */
class Doc{
	String title="-";
	String body="-";
	
//	public Doc(){
//		doc=new String[0];
//	}
}



public class Ex07 {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean result=true;
		String head="-----------------------------\n"+
					"MyBBS게시판(ver 0.0.1)\n"+
					"-----------------------------";
		System.out.println(head);
	
		
//		while(result){
//			String menu="1.목록 2.글쓰기 3.글삭제 0.종료>";
//			System.out.print(menu);
//			int con=sc.nextInt();
//			switch(con){
//			case 1:
//				
//				break;
//			case 2:
//				input();
//				break;
//			case 3:
//				del();
//				break;
//			case 0:
//				System.out.println("종료합니다.");
//				result=false;
//				break;
//			}//switch end
//		}//while end
	}//main end
	
	public static void list(){
		
		
		
	}
//
//	public static void input(){
//		Doc doc=new Doc();
//		System.out.print("제목>");
//		doc[0].title=sc.nextLine();
//		sc.nextLine();
//		System.out.print("내용>");
//		doc[0].body=sc.nextLine();
//		
//		
//		Doc[] temp=null;
//		temp=new Doc[doc.length+1];
//		for(int i=0;i<doc.length;i++){
//			temp[i]=doc[i];
//			
//		}
//		arr=temp;
//		arr[arr.length-1]=su;
//	}
//	
//	
	
	
	public static void del() {
		
	}
	
	
}//class end

