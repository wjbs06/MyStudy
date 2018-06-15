package com.bit.am;

import java.util.Calendar;

class Lec07{
	
	private Lec07(){
		
	}
	static Lec07 getInstance(){
		return new Lec07();
	}
	
	void func(){
		System.out.println("실행함");
	}
}

public class Ex07 {

	
	public static void main(String[] args) {
		Lec07 lec=Lec07.getInstance();
		lec.func();
//		Calendar test=new Calendar();//객체 생성불가능한 cal
		Calendar now=Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);//0~11
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));//1~7
		System.out.println(now.get(Calendar.AM_PM));//0,1 
//		System.out.println(now.get(Calendar.HOUR));//0~11
		System.out.println(now.get(Calendar.HOUR_OF_DAY));//0~23
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		
		
		
		
		
	}

}
