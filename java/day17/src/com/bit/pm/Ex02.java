package com.bit.pm;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02 {


	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		
		Iterator<Integer> ite=list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
	}

}
