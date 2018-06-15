package com.io.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Ex04 {

	public static void main(String[] args) {
		File file=new File("./test04.bin");
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			
			Target obj=(Target)new Target();
			
			System.out.println(obj.sum1);
//			System.out.println(obj.sum2);
			System.out.println(obj.sum3);
			obj.func1();
			obj.func2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
