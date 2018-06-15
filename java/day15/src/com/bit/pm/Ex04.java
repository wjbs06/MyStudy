package com.bit.pm;

import java.util.HashSet;

public class Ex04 {


	public static void main(String[] args) {
		//SET - 집합의 개념
		//순서가 없다
		//순서가 없으므로 중복이 없다.
		java.util.Set set01=null;
//		HashSet set01 = new HashSet();
//		set01=new java.util.HashSet();
		set01=new java.util.TreeSet();
		set01.add(1111);
		set01.add(2222);
		set01.add(3333);
		set01.add(4444);
		
		java.util.Iterator ite=set01.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
		

	}

}
