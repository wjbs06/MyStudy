package com.bit.pm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Lec01 implements Comparable<Lec01>{
	static int num;
	int su;

	public Lec01(){
		num++;
		su=num;
	}
	
	public int compareTo(Lec01 o){
		return this.su-o.su;
	}
}

public class Ex01 {


	public static void main(String[] args) {
		//С§Че
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(111);
		set1.add(222);
		set1.add(333);
		set1.add(444);
		set1.add(555);
		Iterator<Integer> ite1=set1.iterator();
		while(ite1.hasNext()){
			Integer val=ite1.next();
			System.out.println(val);
		}	
			
		Set<Character> set2=new TreeSet<Character>();
		set2.add('a');
		set2.add('b');
		set2.add('c');
		set2.add('d');
		Iterator<Character> ite2=set2.iterator();
		while(ite2.hasNext()){
			Character val=ite2.next();
			System.out.println(val);
		}	
		
		Set<Lec01> set3=new TreeSet<Lec01>();
		set3.add(new Lec01());
		set3.add(new Lec01());
		Lec01 lec=new Lec01();
		set3.add(lec);
		set3.add(new Lec01());
		set3.add(lec);
		Iterator<Lec01> ite3=set3.iterator();
		while(ite3.hasNext()){
			Lec01 val=ite3.next();
			System.out.println(val);
		}	
		
	}
}
