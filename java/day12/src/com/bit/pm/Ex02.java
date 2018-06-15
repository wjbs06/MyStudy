package com.bit.pm;

class Lec22{
	
	void func01(){
		System.out.println("Lec22-func01 run");
	}
}

public class Ex02 extends Lec22{
	
	void func01(){
		System.out.println("Ex02-func01 run");
	}

	void func02(){
		System.out.println("Ex02-func02 run");
	}
	
	static void func03(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Lec22 me= new Ex02();
		me.func01();
//		me.func02(); 실제 객체는 기능을 가지고 있지만 참조변수의 타입에 없기때문에 불가능
		Ex02 me2=(Ex02)me;//Ex02 타입으로 형변환하여 사용가능
		me2.func02();

		Object obj=new Ex02();
		((Ex02)obj).func01();
		((Ex02)obj).func02();
		
		func03("전달되는 문자열");
//		func03(1234);컴파일 버전에 따라 안될수도 있다.
		func03(new Integer(1234));
		func03(obj);
//		func03(3.14);
//		func03(true);
		int code=me.hashCode();
		String st=Integer.toHexString(code);
		System.out.println(st);
		System.out.println(me);
		System.out.println(me.toString());
	}

}
