package com.bit.am;

class Lec02{
	public Lec02(String msg){
		System.out.println("Lec02"+msg);
	}
}

public class Ex02 extends Lec02{
	public Ex02(){
		this("РќДо");
		System.out.println("Ex02");
	}
	public Ex02(String msg){
		super(msg);
		System.out.println("Ex02"+msg);
	}
	
	public static void main(String[] args) {
		
		Ex02 me= new Ex02();
		

	}

}
