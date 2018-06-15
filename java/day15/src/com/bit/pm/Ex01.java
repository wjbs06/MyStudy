package com.bit.pm;
import java.util.ArrayList;

public class Ex01 {

	
	public static void main(String[] args) {
		// 배열을 이용한 동적할당
		ArrayList list=null;
		list = new ArrayList();
		
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");
		list.add("test5");
		list.add("test6");
		//CRUD(Create,Read,Update,Delete)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------------");
		list.remove(1);//삭제
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
		System.out.println("----------------------------");
		list.set(2, "test5");//수정
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------------");
		list.add(3, "test6");//끼워넣기
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------------");
		// test5의 index값을 구하라(몇번째 있는가)
		System.out.println("test5의 idx="+list.indexOf(new String("test5")));
		int idx=0;
		for (idx = 0; idx < list.size(); idx++) {
			String temp=(String)list.get(idx);
			if(temp=="test5"){
				break;
			}
		}
		if(idx==list.size()){
			idx=-1;
		}
		System.out.println("test5의 index: "+idx);
		// test5의 존재유무
		System.out.println("test5의 존재유무"+list.contains("test5"));
		System.out.println("----------------------------");
		System.out.println("list가 비었는가"+list.isEmpty());
		System.out.println("list.clear 실행");
		list.clear();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("list가 비었는가"+list.isEmpty());
		System.out.println("----------------------------");
		//얕은 복사
		ArrayList list2=list;
		list2.add("1111");
		//깊은 복사
		ArrayList list3=(ArrayList)list2.clone();
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		
		ArrayList list4=new ArrayList();
		for (int i = 0; i < list4.size(); i++) {
			list3.add(list4.get(i));
		}
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		
		ArrayList list5=new ArrayList(list);
		list5.add("2222");
		for (int i = 0; i < list5.size(); i++) {
			System.out.println(list5.get(i));
		}
		System.out.println("----------------------------");
		//객체를 이용한 동적할당 - 위 내용과 같다.
		java.util.LinkedList list01=null;
		
		
		
		
		
		
		
	}

}
