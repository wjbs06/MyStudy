package com.bit.am;

class Outter02{
	static int su1=1000;
	int su2=2000;
	
	class Inner02{//멤버클래스(non-static 내부 클래스)
		final static int su3=3000;
		int su4=4000;
		
		public Inner02(){
			System.out.println("Inner02 create");
		}
		
//		public static void func03(){
//			System.out.println("Inner-static func03() start");
//			System.out.println("Inner-static func03() end");
//		}
		public void func04(){
			System.out.println("Inner func04() start");
			System.out.println("Inner func04() end");
		}
	}
	
	public Outter02(){
		System.out.println("Outter create");
	}
	
	public static void func01(){
		System.out.println("Outter-static func01() start");
		System.out.println(su1);
		System.out.println(Inner02.su3);
		Outter02 me=new Outter02();
		Inner02 inn=null;
		me.new Inner02();
		
		System.out.println("Outter-static func01() end");
	}
	public void func02(){
		System.out.println("Outter func02() start");
		System.out.println(Inner02.su3);
		Inner02 inn=new Inner02();
		
		System.out.println("Outter func02() end");
	}
		
}

public class Ex02 {


	public static void main(String[] args) {

		Outter02 out=new Outter02();
		out.func02();
		out.func01();
	}

}
