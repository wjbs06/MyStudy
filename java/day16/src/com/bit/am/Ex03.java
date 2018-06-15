package com.bit.am;

import java.util.Stack;
import java.util.Vector;

public class Ex03 {

	
	public static void main(String[] args) {
		//스택(LIFO) - a last in first out
		//순서 O - 먼저 in 나중 out
		//중복허용
		Stack stack01 = new Stack();

		stack01.add(11);
		stack01.add(22);
		stack01.add(33);
		stack01.add(44);
		stack01.add(22);
		stack01.add(33);
		System.out.println("stack size: "+stack01.size());
		for (int i = 0; i < stack01.size(); i++) {
			System.out.println(stack01.get(i));
		}
		System.out.println("--------------------------");
		stack01.push(11);//stack 입력
		stack01.push(22);
		stack01.push(33);
		stack01.push(22);
		stack01.push(33);
		
		System.out.println(stack01.pop());//stack 출력
		System.out.println("현재까지 마지막은"+stack01.peek());
		System.out.println(stack01.pop());
		System.out.println(stack01.pop());
		System.out.println(stack01.pop());
		System.out.println(stack01.pop());
		System.out.println("--------------------------");
		Vector stack02 = new Stack();
		stack02.add(11);
		stack02.add(22);
		stack02.add(33);
		stack02.add(44);
		stack02.add(22);
		stack02.add(33);
		System.out.println("stack size: "+stack02.size());
		System.out.println(stack02.remove(stack02.size()-1));
		System.out.println(stack02.remove(stack02.size()-1));
		System.out.println(stack02.remove(stack02.size()-1));
		System.out.println(stack02.remove(stack02.size()-1));
		System.out.println(stack02.remove(stack02.size()-1));
		System.out.println(stack02.lastElement());
	}

}
