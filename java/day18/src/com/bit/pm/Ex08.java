package com.bit.pm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ex08 {

	public static void main(String[] args) throws FileNotFoundException {
//		Scanner sc= new Scanner("100");
//		System.out.println(sc.nextInt());
		Scanner sc= new Scanner(new File("myNumbers.txt"));
		String aLong=sc.nextLine();
		System.out.println(aLong);
		
		
		
		
	}

}
