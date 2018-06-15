package com.bit.pm;

public class Ex02 {

	public static void main(String[] args) {
		//동적할당을 위한 자료구조(vector)
		java.util.Vector vec01=new java.util.Vector();
		vec01.addElement("1111");
		vec01.addElement("1112");
		vec01.addElement("1113");
		vec01.addElement("1114");
		
		System.out.println("------------------------------");
		for (int i = 0; i < vec01.size(); i++) {
			System.out.println(vec01.elementAt(i));
		}
		System.out.println("------------------------------");
		java.util.Enumeration en=vec01.elements();
		System.out.println(en.hasMoreElements());
		System.out.println(en.nextElement());
		System.out.println(en.hasMoreElements());
		System.out.println(en.nextElement());
		System.out.println(en.hasMoreElements());
		System.out.println(en.nextElement());
		System.out.println(en.hasMoreElements());
		System.out.println(en.nextElement());
		System.out.println("------------------------------");
		vec01.removeElementAt(2);//삭제
		vec01.removeElement("1112");
		
		java.util.Enumeration ev=vec01.elements();
		
		for (int i = 0; i < vec01.size(); i++) {
			System.out.println(vec01.elementAt(i));
		}
		vec01.setElementAt("5555", 1);
		
		for (int i = 0; i < vec01.size(); i++) {
			System.out.println(vec01.elementAt(i));
		}
		
	}

}
