package com.bit.am;
/*
 * "Java Web Spring"
 * Q1. 대문자가 몇개인지 구하시오
 * 	>>3개
 * 
 * Q2. 모두 대문자로 출력하시오
 *  >> "JAVA WEB SPRING"
 *  
 *  
 * Q3. 띄어쓰기로 잘라서 spring[] 에 담아 출력하시오
 * >>str[0]="Java"
 * >>str[1]="Web"
 * >>str[2]="Spring"
 * 
 */
public class Ex04 {
	public static void main(String[] args){
		Jws me=new Jws();
		me.count();
		me.cha();
		me.spl();
		
	}
}

class Jws{
	//Q1. 대문자가 몇개인지 구하시오
	void count(){
		System.out.println("Q1. 대문자가 몇개인지 구하시오");
		String str = "Java Web Spring";
		char[] ch1 = null;	
		ch1 = str.toCharArray();
		int b=0;
		for(int i=0;i<ch1.length;i++){
			System.out.print(ch1[i]);
			if((90>(int)ch1[i])&&65<(int)ch1[i]){
				
				b++;
			}
		}
		System.out.println();
		System.out.println(b);
		
		System.out.println(str.charAt(0));
	
	}
	//Q2. 모두 대문자로 출력하시오
	void cha(){
		System.out.println("Q2. 모두 대문자로 출력하시오");
		String a="Java Web Spring";
		System.out.println("Java Web Spring >>\n"+ a.toUpperCase());
	}
	//Q3. 띄어쓰기로 잘라서 spring[] 에 담아 출력하시오
	void spl(){
		System.out.println("Q3. 띄어쓰기로 잘라서 spring[] 에 담아 출력하시오");
		String str1 = "Java Web Spring";
		String[] str2 = null;
		str2 = str1.split(" ");
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		System.out.println(str2[2]);
	
	}
	
}