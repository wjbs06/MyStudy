package com.bit.pm;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex02 {


	public static void main(String[] args) {
		Date day=new Date();
		DateFormat df=DateFormat.getDateTimeInstance(DateFormat.FULL,0,Locale.KOREA);
		System.out.println(df.format(day));
		DateFormat df2=DateFormat.getDateTimeInstance(DateFormat.FULL,0, Locale.JAPAN);
		System.out.println(df2.format(day));	
	}

}
