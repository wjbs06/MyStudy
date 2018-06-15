package com.bit.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class Ex06 extends Frame implements ActionListener{
	/* 
	 * 타이머 1분 카운트 다운
	 */
	Label la;
	Button btn1;
	Button btn2;
	int first=0;
	Thread thr;
	
	public Ex06(){
		super("타이머");
		Panel p=new Panel(new BorderLayout());
		Panel s=new Panel();
		Font font=new Font("arial", Font.BOLD, 32);
		la=new Label();
		la.setFont(font);
		la.setSize(100, 100);
		btn1=new Button("시작");
		btn2=new Button("초기화");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		s.add(btn1);
		s.add(btn2);
		p.add(la,BorderLayout.CENTER);
		p.add(s,BorderLayout.SOUTH);
		add(p);
		setSize(500, 300);
		setLocation(900, 100);
		setVisible(true);
	}
	public void cnt(){
		int su=60;
		while(true){
			la.setText(""+su--);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			if(su==-1){
				break;
			}
		}
		btn1.setLabel("시작");
		btn1.setEnabled(false);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){
			if(first==0){				
				thr=new Thread(new Runnable() {
					public void run() {
						cnt();
					}
				});
				thr.start();
				first++;
				btn1.setLabel("멈춤");
			}else if(first==1){
				thr.suspend();
				btn1.setLabel("재시작");
				first++;
			}else{
				thr.resume();
				btn1.setLabel("멈춤");
				first--;
			}
		}else if(e.getSource()==btn2){
			thr.suspend();
			la.setText("60");
			thr=new Thread(new Runnable() {
				public void run() {
					cnt();
				}
			});
			first=0;
			btn1.setLabel("시작");
			btn1.setEnabled(true);
		}
	}
	public static void main(String[] args) {
		new Ex06();
	}
}