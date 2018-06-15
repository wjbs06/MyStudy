package com.bit.am;

import java.io.File;
import java.text.FieldPosition;
import java.util.Date;

public class Ex02 {

	
	public static void main(String[] args) {
		// 현재 디렉토리안에 어떤 파일들이 있는지 확인
		File f=new File("./");
		if(f.exists()){
			String[] st=f.list();
			for (int i = 0; i< st.length; i++) {
				System.out.println(st[i]);
			}
		}
		if(f.exists()){
			System.out.println(new Date(f.lastModified()));//타입long을 데이트로 감싸면 마지막 수정날짜
			System.out.println(f.length());//파일의 사이즈
		}
		
		
	}
}