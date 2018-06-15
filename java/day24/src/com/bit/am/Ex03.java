package com.bit.am;

import java.io.File;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 {
	
	public static void main(String[] args) {
//		File f=new File("C:\\test");
//		String[] st=f.list();
//		if(f.exists()){
//			for (int i = 0; i< st.length; i++) {
////				System.out.println(st[i]);
//				String path="C:\\test"+"\\"+st[i];
////				System.out.println(path);
//				File f1=new File(path);
//				String dir=null;
//				if(f1.isDirectory()){
//					dir="디렉토리";
//				}else if(f1.isFile()){
//					dir="파일";
//				}
//				Date date=new Date(f1.lastModified());
//				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh-mm");
//				long size=f1.length();
//				String name=f1.getName();
//				if(dir=="파일"){
//					System.out.println(sdf.format(date)+"\t"+dir+"\t\t"+size+"\t"+name);					
//				}else{
//					System.out.println(sdf.format(date)+"\t"+dir+"\t"+size+"\t"+name);
//				}
//			}
//		}
		System.out.println("---------------------------------------------------------");
		File f=new File("c:\\test");
		if(f.exists()){
			String[] name=f.list();
			System.out.print(isTime(f)+"\t");
			if(isDir(f)){System.out.print("<dir>");};
			System.out.print(isSize(f)+"\t");
			System.out.println(".");
			if(f.getParent()!=null){
				File parent=new File(f.getParent());
				System.out.print(isTime(parent)+"\t");
				if(isDir(parent)){System.out.print("<dir>");};
				System.out.print(isSize(parent)+"\t");
				System.out.println("..");
			}
			for (int i = 0; i < name.length; i++) {
				File temp=new File(f.getPath()+"\\"+name[i]);
				System.out.print(isTime(temp));
				if(isDir(temp)){
					System.out.print("<Dir>\t");
					System.out.print(name[i]);
				}else{
					System.out.print("\t");
					System.out.print(isSize(temp));
					System.out.print("\t");
					System.out.print(name[i]);
				}
				System.out.println();
				
				
			}
		}
	
		
	}
	public static String isSize(File f){
		String msg="";
		if(f.isFile()){
			msg=""+f.length();
			
		}
		return msg;
	}
	public static String isTime(File f){
		String msg=null;
		long time=f.lastModified();
		Date date=new Date(time);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm"); 
		msg=sdf.format(date);
		return msg;
	}
	public static boolean isDir(File f){
		boolean tf=false;
		if(f.isDirectory()){
			tf=true;
		}
		return tf;
	}
}
