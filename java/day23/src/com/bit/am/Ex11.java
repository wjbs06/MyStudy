package com.bit.am;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javafx.scene.layout.Border;

public class Ex11 extends Frame implements ActionListener{
	Button[] btns;
	String[] title={"가위","바위","보","종료"};
	JButton target1, target2;
	Label la;
	public Ex11(){
		Toolkit kit=Toolkit.getDefaultToolkit();
		setLayout(new BorderLayout());
		GridBagLayout gbl=new GridBagLayout();
		Panel c=new Panel(gbl);
		gbl.columnWidths=new int[]{400,200,400};
		
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		la=new Label();
		
		target1=new JButton();
		target2=new JButton();
	
		
		gbc.gridx=0;
		gbc.gridy=0;
		c.add(target1,gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		c.add(la);
		gbc.gridx=2;
		gbc.gridy=0;
		c.add(target2,gbc);
		
		Panel s=new Panel(new GridLayout(1,4));
		btns=new Button[4];
		for (int i = 0; i < btns.length; i++) {
			btns[i]=new Button(title[i]);
			btns[i].addActionListener(this);
			s.add(btns[i]);
		}
		
		add(c,BorderLayout.CENTER);
		add(s,BorderLayout.SOUTH);
		Dimension screen=new Dimension();
		setBounds(500, 100, 800, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex11();
	}
	
	public int com(){
		Random ran=new Random();
		int su=ran.nextInt(3);
		Icon icon;
		if(su==0){
			icon=new ImageIcon("main01.png");			
		}else if(su==1){
			icon=new ImageIcon("main02.png");
		}else {
			icon=new ImageIcon("main03.png");
		}
		target2.setIcon(icon);
		return su;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int com=com();
		int me=0;
		String msg=((Button)e.getSource()).getLabel();
		if(msg.equals("종료")){
			dispose();
		}else{
			if(msg.equals("가위")){
				Icon icon=new ImageIcon("main01.png");
				target1.setIcon(icon);
			}else if(msg.equals("바위")) {
				Icon icon=new ImageIcon("main02.png");
				target1.setIcon(icon);
			}else if(msg.equals("보")){
				Icon icon=new ImageIcon("main03.png");
				target1.setIcon(icon);
				
			}
			result(com,me);
		}
			
	}
	public void result(int com,int me){
		if(com==me){
			la.setText("비겼음");
		}else if(com==0){
			if(me==1){
				la.setText("이겼음");
			}else{
				la.setText("졌음");
			}
		}else if(com==1){
			if(me==0){
				la.setText("졌음");
			}else{
				la.setText("이겼음");
			}
		}else if(com==2){
			if(me==0){
				la.setText("이겼음");
			}else{
				la.setText("비겼음");
			}
		}
	}

}
