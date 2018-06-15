package com.bit.am;

import java.util.Calendar;

public class Ex09 {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
//		cal.set(Calendar.YEAR,2002);
//		System.out.println(cal.get(Calendar.YEAR));
		cal.set(2002,4,1,23,0,0);
		System.out.print(cal.get(Calendar.YEAR)+" ");
		System.out.print(cal.get(Calendar.MONTH)+" ");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.after(Calendar.getInstance()));
	}

}
