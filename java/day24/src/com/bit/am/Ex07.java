package com.bit.am;

import java.io.File;
import java.io.IOException;

public class Ex07 {

	
	public static void main(String[] args) throws InterruptedException {
		//임시파일생성
		
		try {
			File temp=new File("./dir");
			File f = File.createTempFile("abcdefg", "bit",temp);
			
			System.out.println(f.getCanonicalPath());
			System.out.println(f.getName()+":파일생성완료");
			
			Thread.sleep(3000);
			f.deleteOnExit();
			System.out.println("파일삭제완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
