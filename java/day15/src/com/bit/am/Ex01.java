package com.bit.am;

import java.util.InputMismatchException;
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
public class Ex01 {
	
	static class Bbs{
		static int cnt;
		int num;
		String title;
		String content;
		
		public Bbs(){
			cnt++;
			num=cnt;
		}
	
	}
	
	static class MyArray{
		Object[] objs;
		public MyArray(){
			objs=new Object[0];
		}
		
		public void add(Object obj){
			Object[] temp=new Object[objs.length+1];
			for (int i = 0; i < objs.length; i++) {
				temp[i]=objs[i];
			}
			objs=temp;
			objs[objs.length-1]=obj;
		}

		public void remove(int idx){
			if(objs.length>0&&idx<objs.length){
				Bbs[] temp=new Bbs[objs.length-1];
				for (int i = 0; i < idx; i++) {
					temp[i]=(Bbs)objs[i];
				}
				for (int i = idx+1; i < objs.length; i++) {
					temp[i-1]=(Bbs)objs[i];
				}
				objs=temp;
			}
		}
		
		public Object get(int index){
			return objs[index];
		}
		
		public int size(){
			return objs.length;
		}
		
	}

	public static void main(String[] args) {
		String bar="-------------------------------------";
		String title="MyBBS게시판 (ver0.0.1)";
		String titleH="글번호\t|\t제목\t|\t내용";
		System.out.println(bar);
		System.out.println(title);
		System.out.println(bar);
		String menu="1.목록 2.글쓰기 3.글삭제 0.종료>";
		int input=-1;
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		MyArray arr= new MyArray();
		
		while(true){
			System.out.print(menu);
			try{
				input=sc.nextInt();
			}catch(InputMismatchException ex){
				System.out.println("숫자로 입력하세요");
				sc=new Scanner(System.in);
			}catch(Exception ex){
				System.out.println("치명적 오류");
			}
			if(input==0){
				System.out.println("종료합니다.");
				break;
			}else if(input==1){//목록
				System.out.println(bar);
				System.out.println(titleH);
				System.out.println(bar);
				
//				for (int i = 0; i < arr.size(); i++) {
//					String[] bbs=(String[])arr.get(i);
//					System.out.print(bbs[0]);
//					System.out.print("\t\t|\t");
//					System.out.println(bbs[1]);
//					System.out.println(bar);
//				}
				
				for (int i = 0; i < arr.size(); i++) {
					Bbs bbs=(Bbs)arr.get(i);
					System.out.println(bbs.num);
					System.out.print("\t|\t");
					System.out.print(bbs.title);
					System.out.print("\t|\t");
					System.out.println(bbs.content);
					System.out.println(bar);
				}
				
			}else if(input==2){//입력
				//String[]
//				String[] bbs=new String[2];
//				System.out.print("제목>");
//				bbs[0]=sc2.nextLine();
//				System.out.print("내용>");
//				bbs[1]=sc2.nextLine();
//				arr.add(bbs);
				//Object
				Bbs bbs=new Bbs();
				
				System.out.print("제목>");
				bbs.title=sc2.nextLine();
				if(bbs.title.equals("")){
					bbs.title="제목없음";
				}
				System.out.print("내용>");
				bbs.content=sc2.nextLine();
				if(bbs.content.equals("")){
					bbs.title="제목없음";
				}
				arr.add(bbs);
			}else if(input==3){//삭제
				System.out.println("글번호>");
				int idx=-1;
				try{
					idx=sc.nextInt();
					arr.remove(idx-1);
				}catch(InputMismatchException ex){
					System.out.println("숫자로 입력");
					sc= new Scanner(System.in);
				}catch(Exception ex){
					
				}
			}else{
				System.out.println("입력을 다시해주세요");
			}
		}//while end	
	}//main end
	
	
	
	
	
	
}
