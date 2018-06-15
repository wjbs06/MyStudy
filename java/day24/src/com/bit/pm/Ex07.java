package com.bit.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		File file=new File("./dir/ex02.txt");
		File source=new File("./dir/ex07.txt");
		byte[] buff=new byte[1024];
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(file);
			fos=new FileOutputStream(source);
			int su=0;
			while ((su=fis.read(buff))!=-1) {
				fos.write(buff,0,su);//읽는만큼 쓴다
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("쓰기완료");
	}

}