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
