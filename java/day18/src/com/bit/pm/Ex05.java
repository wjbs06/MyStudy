package com.bit.pm;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Lec05{
	void print(){}
}
class Lec55{
	static Lec05 out;
}
public class Ex05 {


	public static void main(String[] args) throws IOException {
//		Lec55.out.print();

//		PrintStream myOut =System.out;//시스템 출력
//		myOut.println("test");
//		InputStream myIn=System.in;//시스템 입력
//		System.out.println(myIn.read());
		
//		Scanner sc=new Scanner(myIn);
//		System.out.println(sc.nextLine());
//		if(sc.nextInt()==0){
//			System.exit(0);//정상종료
//			System.exit(-1);//오류상황으로 종료
//			return ;
//		}
//		System.out.println("계속 입력하다가");
		
		Map<String,String> map=System.getenv();
		Set<Entry<String,String>> set=map.entrySet();
		Iterator<Entry<String,String>> ite=set.iterator();
		while(ite.hasNext()){
			Entry<String,String> entry =ite.next();
			System.out.println("key:"+entry.getKey());
			System.out.println("value:"+entry.getValue());
		}
		
	}
}