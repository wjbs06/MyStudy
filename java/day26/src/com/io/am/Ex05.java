package com.io.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Ex05 {

	
	public static void main(String[] args) {
		File file=new File("./test04.bin");
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			Target tar=new Target();
//			tar.sum1=999;
//			tar.sum2=8888;
//			tar.sum3=777
			oos.writeObject(tar);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("입력완료");
	}

}
