package com.bit.am;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex06 extends Frame implements ItemListener{
	public Ex06(){
		Panel p=new Panel();
		Choice cho1=new Choice();
		cho1.addItem("item1");
		cho1.addItem("item2");
		cho1.addItem("item3");
		cho1.addItem("item4");
		
		cho1.addItemListener(this);
		
		p.add(cho1);
		
		List list=new List();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		
		list.addItemListener(this);
		
		p.add(list);
		add(p);
		setBounds(900, 100, 400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex06();
	}
	public void itemStateChanged(ItemEvent e) {
//		Choice cho=(Choice)e.getSource();
//		System.out.println("idx: "+cho.getSelectedIndex());
//		System.out.println(cho.getSelectedItem());
//		System.out.println(e.getItem());
		List list=(List)e.getSource();
//		System.out.println(list.getSelectedIndex());
//		System.out.println(list.getSelectedItem());
		int[] idxs=list.getSelectedIndexes();
		for (int i = 0; i < idxs.length; i++) {
			System.out.println(list.getItem(idxs[i]));
		}
		
	}
}