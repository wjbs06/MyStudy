
public class day11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 20180222
상속

package com.bit.am;

class Mother01{
	public void func03(){
		System.out.println("잔소리를 한다");
	}
}


class Father01{
	int money=1000;
	
	
	public void func01(int money){
		this.money+=money;
		System.out.println(money+"돈을 벌어옴-누적"+this.money);
	}
	
}

class Son01 extends Father01{
	//메서드 오버로딩
	public void func01(){
		System.out.println("돈벌까 고민하다");
	}
	//메서드 오버라이딩
	public void func01(int money){
		System.out.println(money+"월 벌까 고민하다");
	}
	
	public void func02(int money){
		this.money-=money;
		System.out.println("돈을 쓴다"+this.money);
		
	}
	
}



public class Ex03 {
	
	public static void main(String[] args) {
		//상속
		/* 자식 클래스 extends 부모클래스
		 * 단, 단일 상속(다중상속불가)
		 * 상속을 받을수도 있지만 안받을 수도 있다.오버라이딩
		 * 
		 
		Father01 fa=new Father01();
		fa.func01(1000);
		System.out.println(fa.money);
		System.out.println("---------------------------------");
		Son01 son=new Son01();
		son.func02(500);
		System.out.println(son.money);
		son.func01();
		son.func01(1000);
		System.out.println("아들"+son.money);
		System.out.println("아빠"+fa.money);
	}

}




package com.bit.am;

class Mother04{
	int sum=0;
	public Mother04(){
		this("인자전달");
		System.out.println("엄마객체 생성");
	}
	
	public Mother04(String msg){
		
		System.out.println(msg+"가 있는 엄마객체 생성");
		
	}
	
	public void func01(){
		System.out.println("엄마기능 수행-sum:"+this.sum);
	}
}

class Son04 extends Mother04{
	
	public Son04(){
		super();//기본적으로 생략되있으나 상속해주는 객체인 부모객체를 생성
				//super() 부모의 참조변수 부모가 먼저 객체가 생성되야함.
		System.out.println("자식객체 생성");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Son04 son=new Son04();
//		son.func01();
//		Mother04 mo=new Mother04();
//		mo.func01();
		

	}

}



package com.bit.am;
// 단일 상속만 가능해서 어떤 객체를 상속해서 사용할지가 중요
// 굳이 사용하자면 상속에 상속을 사용하여 둘다 쓸순 있지만 불편
class Lec05{
	public void func01(){
		System.out.println("원본기능");
	}
}

class Lec55 extends Lec05{
	public void func01(){
		super.func01();
		System.out.println("수정기능");
	}	
}

public class Ex05 extends Lec05{

	public Ex05(){
		System.out.println("객체생성");
	}
	
	public static void main(String[] args) {

//		Integer a1=new Integer("10");
//		Double b1=new Double("3.14");
//		Byte c1=new Byte("11");
//		
//	
//		System.out.println(a1.toString());
//		System.out.println(a1.equals(b1));
//		System.out.println(b1.toString());
//		System.out.println(b1);
//		System.out.println(c1.toString());
//		System.out.println(c1);
		
		Lec55 me=new Lec55();
		me.func01();
		
		
	}

	
}










		 */

	}

}
