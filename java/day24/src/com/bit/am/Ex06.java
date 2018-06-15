package com.bit.am;

import java.io.File;
import java.io.IOException;


public class Ex06 {

	
	public static void main(String[] args) throws IOException {
		File f= new File("./");
		File dir=new File(f,"dir");
		
		
		File txt=new File(dir,"temp");
		if(txt.createNewFile()){
			System.out.println("颇老 积己 肯丰");
		}else{
			System.out.println("颇老 积己 角菩");
		}
		
//		if(dir.mkdir()){
//			System.out.println("单腐配府 积己 肯丰");
//		}else{
//			System.out.println("单腐配府 积己 角菩");
//		}
		
		
	}

}
