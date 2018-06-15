package com.io.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Ex05 {


	public static void main(String[] args) {
		File f=new File("./text04.bin");
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream(f);
			ois=new ObjectInputStream(fis);
			
			Target obj1=(Target) ois.readObject();
			obj1.func();
			
//			int[] arr=(int[]) ois.readObject();
//			System.out.println(Arrays.toString(arr));
			
//			Object obj1=ois.readObject();
//			Object obj2=ois.readObject();
			
//			System.out.println(obj1);
//			System.out.println(obj2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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
