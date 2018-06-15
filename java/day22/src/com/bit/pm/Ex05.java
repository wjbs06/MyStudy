package com.bit.pm;

import java.awt.Button;
import java.awt.Event;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05 extends Frame implements ActionListener{
	Label la;
	Thread thr;
	Button btn1,btn2;
	public Ex05(){
		super("시계");
		Panel p=new Panel(new GridLayout(3,1));
		
		la=new Label();
		
		btn1=new Button("시작");
		btn2=new Button("종료");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		p.add(la);
		p.add(btn1);
		p.add(btn2);
		add(p);
		setSize(500, 300);
		setLocation(900, 100);
		setVisible(true);
	}
	class Lec02 implements Runnable{
		public void run() {
			while(true){
				Date day=new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
				String time=sdf.format(day);
				la.setText(time);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		new Ex05();
	}
	public void actionPerformed(ActionEvent e) {
		Button btn=(Button)e.getSource();
		if(e.getSource()==btn1){
			if(thr==null){
				thr=new Thread(new Lec02());
				btn.setEnabled(false);
			}
			thr.start();
		}else if(btn==btn2){
			if(thr!=null){
				thr.stop();
				la.setText("");
				thr=null;
				btn1.setEnabled(true);
			}
		}
		
		
	}


}
