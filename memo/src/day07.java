
public class day07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 20180214


이클립스 사용 4.2.2 오래됬지만 요즘 이클립스는 무겁기때문에 과거 버전사용

클래스 이름이 겹치기때문에 상위의 개념으로 패키지가 있다.

자바에서는 패키지에 대해 길이가 상관이 없다.

패키지가 ~~.~~.~~ 까지 되게 되었는데 도메인을 사용하게 되었다.
ex) com.naver.~~  net.daum.~~  com.google.~~

/*
 * 매서드\
 * 이름:알파벳 소문자로 시작 중복X
 * 오버로드: 중복허용
 * 			인자의 유무,인자의 자료형,인자의 갯수
 *

static은 실행시 이미 static 영역에 올리고 남은 non-static만 객체를 생성하여 실행



package com.bit.day07;

public class Ex02 {
/*
 * 클래스의 구성요소
 * 1.메서드(static, non-static)
 * 2.변수(static[클래스변수],non-static[멤버필드])
 * 		기본값이 존재, 초기화를 안해도 디폴트값이 있다.
 *		선언과 초기화가 동시에 필수
 *
	public static int sum=0;//클래스변수 
	
	
	public static void main(String[] args) {
		int temp;

		Ex02 me=new Ex02();
		temp=1000;
		sum=me.add(temp);
		System.out.println("sum: "+sum);
		temp=200;
		sum=me.del(temp);
		System.out.println("sum: "+sum);
		temp=300;
		sum=me.del(temp);
		System.out.println("sum: "+sum);
	}

	public int add(int a){
		return sum+a;
	}
	
	public int del(int a){
		return sum-a;
	}
	
}



--------------------------------       static int sum;

--------				sum의 변화는 누적
-static-				static은 공통점을 정의
--------------------------------


--------------------------------
객체add,del,show,int sum-		멤버필드, 객체	
-------------------------		객체가 새로생성되면 멤버필드는 초기화

--------------------------------



		 */
	}

}
