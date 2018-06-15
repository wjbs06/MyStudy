package com.io.pm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Target implements Serializable{
	int sum;
	
	public Target(){
		sum=1234;
	}
	
	public void func(){
		System.out.println("내가 만든 기능");
	}
}

public class Ex04 {

	
	public static void main(String[] args) {
		File f=new File("./text04.bin");
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(f);
			oos=new ObjectOutputStream(fos);
			
			Target tar=new Target();
			oos.writeObject(tar);
			
//			int[] arr={1,3,5,7,9};
//			oos.writeObject(arr);
			
//			oos.writeObject("abcd");
//			oos.writeObject(new Integer(1234));//기본적으로 오토래핑으로 객체로 담김
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("입력완료");
	}
}
