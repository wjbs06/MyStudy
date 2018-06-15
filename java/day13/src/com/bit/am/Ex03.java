package com.bit.am;

class Lec03{
	//디자인 패턴 - 싱글톤 패턴
	private static Lec03 you=null;
	
	private Lec03(){
	}
	
	public static Lec03 func01(){
		if(you==null){
			you=new Lec03();
		}
		return you;
	}
	
}

public class Ex03 {

	public int sum1;
	protected int sum2;
	int sum3;
	private int sum4;
	
	//public > protected >= default > private
	
	// class : public || default
	// 생성자,전역,메서드 : public || protected || default || private
	/*
	 * 
	 */

	Ex03(){
		System.out.println("객체생성");
	}
	
	public static void main(String[] args) {
//		Ex03 me= new Ex03();
		
		Lec03 you=Lec03.func01();
		
	}

}
