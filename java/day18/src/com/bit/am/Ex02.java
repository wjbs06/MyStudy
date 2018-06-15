package com.bit.am;

public class Ex02 {

	
	public static void main(String[] args) {
		StringBuffer msg1=new StringBuffer("Java");
		//추가
		StringBuffer msg2=msg1.append("Add");
		//삭제
		StringBuffer msg3=msg1.delete(3, 5);
		System.out.println("msg1:"+msg3);
		//수정
		StringBuffer msg0=new StringBuffer("abcedfg");
		StringBuffer msg4=msg0.replace(2, 4, "ba");
		System.out.println("msg0:"+msg0);
		//삽입
		StringBuffer msg5=new StringBuffer("abcdefg");
		msg5.insert(1, "s");
		System.out.println("msg5:"+msg5);
		
		
		
	}

}
