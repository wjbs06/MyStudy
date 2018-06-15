package com.bit.am;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

public class Ex08 extends Frame implements ContainerListener{
	Panel p;
	Button btn;
	boolean click;
	public Ex08(){
		BorderLayout bl=new BorderLayout();
		setLayout(bl);
		p=new Panel();
		p.setBackground(Color.GREEN);
		p.addContainerListener(this);
		Button btn1=new Button("toggle");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Label la=new Label("추가");
//				add(la);
				if(!click){
					btn=new Button("add");
					p.add(btn);
				}else{
					p.remove(btn);
				}
				click=!click;
				p.revalidate();//화면갱신
			}
		});
		
		
		add(btn1,BorderLayout.SOUTH);
		add(p,BorderLayout.CENTER);
		setBounds(900, 100, 400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex08();
	}
	public void componentAdded(ContainerEvent e) {
		System.out.println("추가됨");
	}
	public void componentRemoved(ContainerEvent e) {
		System.out.println("제거됨");
	}

}
