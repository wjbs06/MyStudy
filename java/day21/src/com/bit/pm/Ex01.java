package com.bit.pm;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex01 extends Frame implements WindowListener{
	public Ex01(){
		// 이벤트 리스너 등록
		this.addWindowListener(this);
		
		setSize(500,300);
		setLocation(900, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01();
		
	}

	public void windowOpened(WindowEvent e) {
		// 창이 열렸을때
		System.out.println("windowOpened");
	}

	public void windowClosing(WindowEvent e) {
		// 창을 x를 누르면
		System.out.println("windowClosing");
		System.exit(0);
//		dispose(); //창을 안전하게 종료요청
	}

	public void windowClosed(WindowEvent e) {
		// 닫을때 저장과 같은 추가작업을 할때
		System.out.println("windowClosed");
	}

	public void windowIconified(WindowEvent e) {
		// 창을 최소화
		System.out.println("windowIconified");
	}

	public void windowDeiconified(WindowEvent e) {
		// 창의 최소화에서 최대화로
		System.out.println("windowDeiconified");
	}

	public void windowActivated(WindowEvent e) {
		// 창이 포커싱 됨
		System.out.println("windowActivated");
	}

	public void windowDeactivated(WindowEvent e) {
		// 창이 포커싱 안됬을때
		System.out.println("windowDeactivated");
	}

}
