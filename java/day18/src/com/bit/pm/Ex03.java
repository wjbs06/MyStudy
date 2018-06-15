package com.bit.pm;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 {

	
	public static void main(String[] args) {
		
		String aPattern="YY/MM/dd hh:mm:ss";
		Date day=new Date();
		DateFormatSymbols dfs=new DateFormatSymbols();
		
		SimpleDateFormat sdf=new SimpleDateFormat(aPattern,dfs);
		System.out.println(sdf.format(day));
	}
}
