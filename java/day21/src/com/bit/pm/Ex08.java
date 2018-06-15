package com.bit.pm;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex08 extends Frame implements ActionListener{
	TextArea ta;
	TextField tf;
	public Ex08(){
		WindowAdapter ad= new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		};
		addWindowListener(ad);
		
		Panel p=new Panel();
		Button btn1=new Button("버튼1");
		Button btn2=new Button("버튼2");
		tf=new TextField(15);
		tf.addActionListener(this);
		ta=new TextArea(5,50);
		
		List list=new List();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.addActionListener(this);
		
		
		btn1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("마우스 이벤트로 클릭");
			}
		});
		btn2.addActionListener(this);
		
		
		p.add(btn1);
		p.add(btn2);
		p.add(tf);
		p.add(list);
		p.add(ta);
		add(p);
		setSize(400, 400);
		setLocation(900, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex08();
	}
	public void actionPerformed(ActionEvent e) {
		Component comp=(Component)e.getSource();
		System.out.println(comp.getName()+"actionPerformed");
		if("textfield0".equals(comp.getName())||"button0".equals(comp.getName())){
			String msg=tf.getText();
			String beforeMsg=ta.getText();
			ta.setText(beforeMsg+"\n"+msg);
			tf.setText("");
			tf.requestFocus();
		}
	}
}
