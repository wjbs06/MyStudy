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
		 */
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
