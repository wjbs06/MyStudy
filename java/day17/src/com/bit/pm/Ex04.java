package com.bit.pm;

class Lec04<T>{
	T obj;
	void func01(T obj){
		this.obj=obj;
	}
	T func02(){
		return obj;
	}
}

interface Interf{
	
}

public class Ex04 {

	public static void main(String[] args) {
		//제네릭
		//Lec04<String> lec=new Lec04<String>(); 제대로 작성
		//Lec04<String> lec2=new Lec04(); 나중에 캐스팅할수 있음
		
//		Lec04 temp=new Lec04();
		
//		Lec04<String> temp=new Lec04<String>();
//		Lec04<Integer> temp2=new Lec04<Integer>();
//		temp.func01("test");
		Lec04<? super Object> lec=new Lec04();//object를 갖고 있는 것들만 인자로 받음
		lec.func01(new Lec04());
//		Object obj=lec.func02();
//		System.out.println();
//		lec=temp2;
		
//		lec2.func01(111111);
//		
//		Integer obj=lec2.func02();
//		System.out.println(obj);
	}
}
