package com.ui.am;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex01 extends Frame{
	public Ex01(){
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		FileDialog dia=new FileDialog(this,"¿­±â",FileDialog.SAVE);
		dia.setBounds(900, 100, 100, 100);
		dia.setVisible(true);
		
		System.out.println(dia.getFile());
		System.out.println(dia.getDirectory());
//		
		
		
		setSize(400,400);
		setLocation(900, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
