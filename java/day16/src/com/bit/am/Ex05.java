package com.bit.am;

import java.util.LinkedList;

public class Ex05 {

	
	public static void main(String[] args) {
		// stack && queue 
		
		java.util.Deque de01=new LinkedList();
		de01.addFirst(11);
		de01.addFirst(22);
		de01.addFirst(33);
		de01.addFirst(44);
		
		System.out.println(de01.removeFirst());
		System.out.println(de01.removeFirst());
		System.out.println(de01.removeFirst());
		System.out.println(de01.removeFirst());
		System.out.println("----------------------");
		java.util.Deque de02= new LinkedList();
		de02.offerFirst(111);
		de02.offerFirst(222);
		de02.offerFirst(333);
		de02.offerFirst(444);
		System.out.println(de02.pollFirst());
		System.out.println(de02.pollFirst());
		System.out.println(de02.pollFirst());
		System.out.println(de02.pollFirst());
		System.out.println("----------------------");
		java.util.Deque de03= new LinkedList();
		de03.offerLast(111);
		de03.offerLast(222);
		de03.offerLast(333);
		de03.offerLast(444);
		System.out.println(de03.removeLast());
		System.out.println(de03.removeLast());
		System.out.println(de03.removeLast());
		System.out.println(de03.removeLast());
		System.out.println("----------------------");
		java.util.Deque de04= new LinkedList();
		de04.offerLast(111);
		de04.offerLast(222);
		de04.offerLast(333);
		de04.offerLast(444);
		System.out.println(de04.pollLast());
		System.out.println(de04.pollLast());
		System.out.println(de04.pollLast());
		System.out.println(de04.pollLast());
		
		
		
		
		
	}

}
