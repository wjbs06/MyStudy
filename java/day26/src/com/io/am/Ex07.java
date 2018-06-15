package com.io.am;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
//		FileOutputStream fos=new FileOutputStream("./text.txt");
		Scanner sc=new Scanner(System.in);
		FileWriter fw=null;
		
		try {
//			fw=new FileWriter("./text07.txt",true);//true ÇÏ¸é Ãß°¡µÊ
			fw=new FileWriter("./text07.txt");
			while(true){
				String msg=sc.nextLine();
				if("".equals(msg)){break;}
				fw.write(msg);
				fw.write("\n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
