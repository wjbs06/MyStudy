package com.bit.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		File source= new File("./game2.png");
		File target = new File("./dir/copy.png"); 
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(source);
			fos=new FileOutputStream(target);
			int su=0;
			while((su=fis.read())!=-1){
				fos.write(su);
			}
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("º¹»ç³¡");
	}
}
