package com.bit.am;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex08 {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(111);
		stack.push(222);
		stack.push(333);
		stack.push(444);
		while(!stack.isEmpty()){			
			System.out.println(stack.pop());
		}
		
		
		Queue<Integer> que=new LinkedList<Integer>();
		que.offer(111);
		que.offer(222);
		que.offer(333);
		que.offer(444);
		while(!que.isEmpty()){
			System.out.println(que.poll());
		}


		
		
		
		
		
		
	}

}
