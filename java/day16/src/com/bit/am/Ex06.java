package com.bit.am;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Lec06 implements Comparable{//상속받으면 treeset 사용편함
	int su;

	@Override
	public int compareTo(Object obj) {
		// 0 중복으로 인정 - 값은 역순
		int result=this.su-((Lec06)(obj)).su;
//		return 0;
		return result;
//		return 1;
//		return -1;
	}
}

public class Ex06 {

	
	public static void main(String[] args) {
		// set 
		Set set=new HashSet();
		set=new TreeSet();
		
		Lec06 me = new Lec06();
		me.su=1;
		set.add(me);
		me = new Lec06();
		me.su=232;
		set.add(me);
		me = new Lec06();
		me.su=3;
		set.add(me);
		me = new Lec06();
		me.su=4123;
		set.add(me);
		
		Iterator ite= set.iterator();
//		while(ite.hasNext()){
//			System.out.println(ite.next());
//		}
		while(ite.hasNext()){
			Lec06 item=(Lec06)ite.next();
			System.out.println(item.su);
		}
	}

}
