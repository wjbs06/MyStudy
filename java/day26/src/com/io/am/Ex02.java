package com.io.am;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		InputStream inn=System.in;
//		Scanner sc=new Scanner(System.in);
		InputStreamReader isr=null;
		BufferedReader br=null;
		File file=new File("./ex01.txt");
		FileOutputStream fos=null;
		OutputStreamWriter osw=null;
		PrintWriter pw=null;
		if(file.exists()){
			try {
				isr=new InputStreamReader(inn);
				br=new BufferedReader(isr);
				fos=new FileOutputStream(file);
				osw=new OutputStreamWriter(fos);
				pw=new PrintWriter(osw);
				while(true){
//					String msg=sc.nextLine();
					String msg=br.readLine();
					if("".equals(msg)){break;}
					pw.println(msg);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					pw.close();
					osw.close();
					fos.close();
					br.close();
					isr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("입력완료");
	}
}