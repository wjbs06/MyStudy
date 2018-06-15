package com.bit.pm;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//class Lec07 implements WindowListener{
//	public void windowOpened(WindowEvent e) {}
//	public void windowClosing(WindowEvent e) {}
//	public void windowClosed(WindowEvent e) {}
//	public void windowIconified(WindowEvent e) {}
//	public void windowDeiconified(WindowEvent e) {}
//	public void windowActivated(WindowEvent e) {}
//	public void windowDeactivated(WindowEvent e) {}
//}

public class Ex07 extends Frame{

	public Ex07(){
		WindowAdapter ad= new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		};
		addWindowListener(ad);
		
		setSize(200, 200);
		setLocation(900, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07();

	}

}
