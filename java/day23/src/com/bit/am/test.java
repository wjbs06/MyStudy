package com.bit.am;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class test extends Frame implements ActionListener{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	public test(){
		BorderLayout bl=new BorderLayout();
		Panel p=new Panel();
		Panel p1=new Panel();
		Toolkit kit =Toolkit.getDefaultToolkit();
		Icon icon1=new ImageIcon("main01.png");
		btn1=new JButton("가위");
		btn2=new JButton("바위");
		btn3=new JButton("보");
		btn4=new JButton("종료");
	
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		add(p,BorderLayout.NORTH);
		add(p1,BorderLayout.SOUTH);
		setBounds(900, 100, 400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new test();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String userA="";
		int user=0;
		if(e.getSource().equals(btn1)){
			user=1;
			userA="가위";
		}else if(e.getSource().equals(btn2)){
			user=2;
			userA="바위";
		}else if(e.getSource().equals(btn3)){
			user=3;
			userA="보";
		}else if(e.getSource().equals(btn4)){
			
		}
		
		
		//가위바위보 입력end	

		//컴퓨터가 낼 가위바위보
		int com=(int)(Math.random()*3)+1;
		String comA;
		if(com==1){
			comA="가위";
		} else if(com==2){
			comA="바위";
		} else {
			comA="보";		
		}
		//컴퓨터 가위바위보 end

		//결과 판정 if문
		int result=0;
		if(user==1){
			if(com==2){
				result=1;
			} else if(com==3) {
				result=3;
			} else {
				result=2;
			}
		} else if(user==2){
			if(com==1){
				result=3;
			} else if(com==3) {
				result=1;
			} else {
				result=2;
			}
		} else if(user==3){
			if(com==2){
				result=3;
			} else if(com==1) {
				result=1;
			} else {
				result=2;
			}
		} //if end
		String resultA="";
		switch(result){
			case 1:
				resultA="졌다.";
			break;
			case 2:
				resultA="비겼다.";
			break;
			case 3:
				resultA="이겼다.";
			break;
		}
		//결과 판정 if문 end

		//결과 출력
		System.out.println("당신 : "+userA);
		System.out.println("컴퓨터 : "+comA);
		System.out.println("결과 : "+resultA);
		//결과 출력 end
	}

}
