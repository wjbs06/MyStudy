package com.bit.am;

import java.io.File;
import java.io.IOException;

public class Ex01 {
	//vm에서 운영체제에서 읽어오는데 있으면 true/없으면 false
	
	public static void main(String[] args) throws IOException {
//		File f0=new File("main01.png");
//		System.out.println("파일존재 유무 :"+f0.exists());
//		func(f0);
		File f1=new File("C:\\jtest\\workspace\\myStudy\\day24\\main01.png");//절대경로
		System.out.println("파일존재 유무 :"+f1.exists());
		func(f1);
		
		System.out.println(f1.getPath());
		//절대경로는 같지만 방식이 다르다
		System.out.println(f1.getCanonicalPath());
		System.out.println(f1.getAbsolutePath());
		String path1=f1.getAbsolutePath();
		String path2=f1.getCanonicalPath();
		System.out.println(path1.replace(path2,""));
		System.out.println(f1.getParent());
		System.out.println(f1.getName());
		System.out.println(f1.getParent()+"\\"+f1.getName());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());//파일을 읽기전용으로 하면 쓰는건 불가능
		System.out.println(f1.canExecute());
		
		
		File f2=new File("dir/../main01.png");//dir의 상위의 디렉토리
		System.out.println("파일존재 유무 :"+f2.exists());
		func(f2);
		File f3=new File("./main01.png");//현재 디렉토리
		System.out.println("파일존재 유무 :"+f3.exists());
		func(f3);
	}

	public static void func(File f){
		if(f.isDirectory()){
			System.out.println("디렉토리");
		}else if(f.isFile()){
			System.out.println("파일");
		}
	}
}
