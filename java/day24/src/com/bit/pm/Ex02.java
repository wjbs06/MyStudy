package com.bit.pm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		String msg="abcdf\n123456\n한글";
		byte[] byts=msg.getBytes();
		System.out.println(byts.length);
		File f= new File("dir/ex02.txt");
		FileOutputStream fos=null;
		try {
			if(!f.exists()){
				f.createNewFile();
			}
			fos=new FileOutputStream(f);
			for (int i = 0; i < byts.length; i++) {
				fos.write(byts[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	System.out.println("완료");
		
	}

}
