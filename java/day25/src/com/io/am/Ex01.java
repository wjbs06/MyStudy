package com.io.am;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex01 {


	public static void main(String[] args) {
		File file=new File("./txt/ex01.txt");
		char[] buff=new char[1];
		FileReader fr=null;
		
		try {
			fr=new FileReader(file);
			while(true){
				int su=fr.read(buff);
				if(su==-1){break;}
				System.out.print(new String(buff));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
