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
