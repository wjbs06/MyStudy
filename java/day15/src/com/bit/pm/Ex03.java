package com.bit.pm;

import java.util.Vector;

public class Ex03 {

	public static void main(String[] args) {
//		Vector vec=new Vector(5,2);//초기의 개수, 늘일 개수
		Vector vec=new Vector(100);
//		vec.trimToSize();//필요없는 공간을 삭제
		for (int i = 0; i < 12; i++) {
			vec.addElement((i+1)*1000);
		}
		vec.trimToSize();
		vec.addElement(1234);
//		vec.addElement("111");
//		vec.addElement("222");
//		vec.addElement("333");
//		vec.addElement("444");
		System.out.println(vec.capacity());
		
		
	}

}
