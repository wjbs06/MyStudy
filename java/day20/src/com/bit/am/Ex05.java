package com.bit.am;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;


public class Ex05 extends Frame{

	public static void main(String[] args) {
		Frame f= new Frame();
		f.setTitle("목록중에 선택메뉴들");
		Panel p = new Panel();
		Choice cho1=new Choice();
		cho1.add("item1");
		cho1.add("item2");
		cho1.add("item3");
		cho1.add("item4");
		cho1.add("item5");
		
		cho1.select("item1");//초기에 보일 목록 index, 문자 가능

		List list1=new List(8,true);//숫자에 따라 보이는 목록의 개수
		list1.add("item6");
		list1.add("item7");
		list1.add("item8");
		list1.add("item9");
		list1.add("item10");
		list1.add("item11");
		
//		list1.remove(0);
		list1.select(1);
		
		p.add(cho1);
		p.add(list1);
		f.add(p);
		f.setSize(300, 500);
		f.setLocation(1100, 0);
		f.setVisible(true);
	}

}
