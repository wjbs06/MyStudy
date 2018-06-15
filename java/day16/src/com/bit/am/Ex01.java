package com.bit.am;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex01 {


	public static void main(String[] args) {
		//list 구조 (CRUD작업)
		//- 순서를 갖고
		//- 중복허용
		List list1=new ArrayList();
		list1 = new LinkedList();
		list1 = new Vector();//vector 는 add 가 아니라 엘리먼트가 맞다.
		list1.add(1111);
		list1.add(2222);
		list1.add(3333);
		list1.add(4444);
		list1.add(5555);//추가
		list1.set(2,3000);//수정
		list1.remove(1);//삭제
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i)+" ");
		}//보기
		System.out.println("------------------------------");

	}

}
