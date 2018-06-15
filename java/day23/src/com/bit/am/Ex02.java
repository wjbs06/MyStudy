package com.bit.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex02 extends Frame{

	public Ex02(){
		GridBagLayout gbl=new GridBagLayout();
		Panel p=new Panel(gbl);
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;

		String[] nums={"7","8","9","4","5","6","1","2","3","+","0",".","Ent"};
		Button[] btns=new Button[13];
		for (int i = 0; i < nums.length; i++) {
			btns[i]=new Button(nums[i]);
		}
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1;
		gbc.weighty=1;
		for (int i = 0; i < 9; i++) {
			if(i<3){
				gbc.gridx=i;
				gbc.gridy=0;
				p.add(btns[i],gbc);
			}else if(i<6){
				gbc.gridx=i-3;
				gbc.gridy=1;
				p.add(btns[i],gbc);
			}else{
				gbc.gridx=i-6;
				gbc.gridy=2;
				p.add(btns[i],gbc);
			}
		}
		gbc.gridx=3;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=2;
		p.add(btns[9],gbc);
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		p.add(btns[10],gbc);
		gbc.gridx=2;
		gbc.gridy=3;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		p.add(btns[11],gbc);
		gbc.gridx=3;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=2;
		p.add(btns[12],gbc);
		
		add(p);
		setSize(500, 300);
		setLocation(900, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02();

	}

}
