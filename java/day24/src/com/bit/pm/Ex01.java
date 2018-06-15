package com.bit.pm;

import java.io.IOException;
import java.io.InputStream;

public class Ex01 {

	
	public static void main(String[] args) {
		InputStream myInput=System.in;
		try {
			int su=0;
			while((su=myInput.read())!=13){
				System.out.println((char)su);
				su=myInput.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
