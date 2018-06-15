package com.bit.am;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex07 {

	
	public static void main(String[] args) {
		//1.2 컬렉션프레임워크 추가
		//1.5 제네릭 추가
		Vector<Integer> vec= new Vector<Integer>();
//		vec.addElement(new Integer(111));
//		vec.addElement(new Integer(222));
//		vec.addElement(new Integer(333));
//		vec.addElement(new Integer(444));
		vec.addElement(111);
		vec.addElement(222);
		vec.addElement(333);
		vec.add(444);
		vec.add(555);
		
		Enumeration<Integer> eles=vec.elements();
		while(eles.hasMoreElements()){
			Integer item=eles.nextElement();
			System.out.println(item);
		}
		System.out.println("-----------------------------------");
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		
		Iterator<Integer> ite=vec.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}
