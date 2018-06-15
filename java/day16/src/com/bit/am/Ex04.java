package com.bit.am;

import java.util.LinkedList;

public class Ex04 {


	public static void main(String[] args) {
		// 큐(FIFO) - a first in first out;
		// 순서 o - 먼저 in 먼저 out;
		// 중복 ㅇ
		java.util.Queue que=null;
		que=new LinkedList();
		que.offer(111);
		que.offer(22);
		que.offer(33);
		que.offer(55);
		que.offer(22);
		que.offer(33);
		
		System.out.println("Queue size: "+que.size());
		System.out.println("다음대기자: "+que.peek());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println("다음대기자: "+que.peek());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		

	}

}
