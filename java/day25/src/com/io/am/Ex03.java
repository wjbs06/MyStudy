package com.io.am;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex03 {

	
	public static void main(String[] args) {
		File source=new File("./txt/ex01.txt");
		File target=new File("./ex01.txt");
		
		char[] buff=new char[5];
		
		FileReader fr=null;
		FileWriter fw=null;
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		PrintWriter pw=null;
		
		try {
			fr=new FileReader(source);
			fw=new FileWriter(target);
			
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);
	
			pw=new PrintWriter(bw);
			
			int su=0;
			while(true){
				String temp=br.readLine();
				if(temp==null){break;}
				pw.println(temp);
//				bw.write(temp);
//				bw.newLine();
			}
//			while(true){
//				su=br.read(buff);
//				if(su==-1){break;}
//				bw.write(buff,0,su);
////				bw.flush();
//			}
//			while(true){
//				su=fr.read(buff);
//				if(su==-1){break;}
//				fw.write(buff,0,su);
//			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bw.close();
				br.close();
				fw.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
