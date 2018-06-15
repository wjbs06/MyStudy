package com.bit.am;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ex04 extends Frame{
	public Ex04(){
		super("제목");
		
		MenuBar bar=new MenuBar();//메뉴바를 생성
		Menu menu1=new Menu("File");//메뉴를 생성
		Menu menu2=new Menu("Edit");
		Menu menu3=new Menu("Help");
		
		MenuItem mi1_1=new MenuItem();
		mi1_1.setLabel("New");
		MenuItem mi1_2=new MenuItem("Open");
		MenuItem mi1_3=new MenuItem("Option");
		MenuItem mi1_4=new MenuItem();
		mi1_4.setLabel("Exit");
		menu1.add(mi1_1);
		menu1.addSeparator();
		menu1.add(mi1_2);
		menu1.add(mi1_3);
		menu1.addSeparator();
		menu1.add(mi1_4);
		
		MenuItem mi2_1=new MenuItem("Undo");
		MenuItem mi2_2=new MenuItem("Redo");
		CheckboxMenuItem mi2_3=new CheckboxMenuItem("Mode1");
		menu2.add(mi2_1);
		menu2.add(mi2_2);
		menu2.addSeparator();
		menu2.add(mi2_3);
		
		MenuItem mi3_1=new MenuItem("Help");
		MenuItem mi3_2=new MenuItem("About");
		menu3.add(mi3_1);
		menu3.addSeparator();
		menu3.add(mi3_2);
		
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		setMenuBar(bar);
		setSize(500,300);
		setLocation(900, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex04();

	}

}
