package com.bit.am;

interface Interf01{
	void func();
}

class Lec04 {
	
	void func01(){
		
		Interf01 inn =new Interf01(){

			public void func(){
				System.out.println("내부클래스의 func");
			}
		};
		inn.func();
		
	}
}
//class Lec04 {
//	//익명클래스    (중간의 클래스 이름이 없다)
//	Interf01 inn=new /*class XXXX*/Interf01(){
//
//		public void func(){
//			System.out.println("내부클래스의 func");
//		}
//	};
//	void func01(){	
//		inn.func();
//	}
//}

abstract class Lec22{
	public void func01(){
		System.out.println("func01()");
	}
	public abstract void func02();
}

//class Ex22 extends Ex02(){} 여기에 이름이 없으면 익명클래스
public class Ex04 {

	public static void main(String[] args) {
		
		Lec04 lec=new Lec04();
		lec.func01();
		// 동일한 익명클래스 상속을 통해
		Ex04 me=new Ex04(){
			void func04(){}
		};
		
		Ex04 www=new Ex04(){};
		
		Lec22 ab=new Lec22(){
			public void func02(){
			}
		};
		
		Interf01 inn =new Interf01(){
			public void func(){
			}
		};

	}
}
