package com.io.am;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex06 {

	
	public static void main(String[] args) {
		File file=new File("text06.bin");
		RandomAccessFile raf=null;
		
		try {
			if(!file.exists()){
				file.createNewFile();
			}
			raf=new RandomAccessFile(file, "rw");
			raf.write("hello".getBytes());
			int su=0;
			while(true){
				su=raf.read();
				if(su==-1){break;}
				System.out.println((char)su);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
