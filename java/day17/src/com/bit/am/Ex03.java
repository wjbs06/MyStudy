package com.bit.am;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.FileAlreadyExistsException;

public class Ex03 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
//			func01();
			throw new ArithmeticException();
		} catch (ArithmeticException ex) {
			System.out.println("예외처리");
//			ex.printStackTrace();
//			System.out.println(">>>"+ex.toString());
//			System.out.println(">>"+ex.getMessage());
			
//			Class e=ex.getClass();
//			System.out.println(">"+e.getName());
//			StackTraceElement[] errs= ex.getStackTrace();
//			System.out.println(errs.length);
//			System.out.println(errs.toString());
//			ex.printStackTrace(new PrintStream("log.txt"));
		}
		
	}
	
	public static void func01()throws ArithmeticException{
		int a=5/0;
	}

}
