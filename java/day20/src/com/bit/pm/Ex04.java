package com.bit.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex04 extends Frame{
	String[] msgs={
			"7","8","9","%","4","5","6","+","1","2","3","-","0",".","="
	};
	public Ex04(){
		super("°è»ê±â");
		Panel mainP=new Panel(new BorderLayout());
		
		Font font=new Font("±¼¸²Ã¼",Font.BOLD,26);
		Font font2=new Font("±¼¸²Ã¼",Font.BOLD,26);
		TextField tf=new TextField();
		tf.setFont(font2);
		Panel topP=new Panel();
		Panel botP=new Panel(new GridLayout(4,4));
		
		for (int i = 0; i < msgs.length; i++) {
			Button temp=new Button(msgs[i]);
			temp.setFont(font);
			botP.add(temp);
			
		}
	
		
		topP.add(new TextField(50));
		mainP.add(topP,BorderLayout.NORTH);
		mainP.add(botP,BorderLayout.CENTER);
		add(mainP);
		setSize(400, 400);
		setLocation(1000, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex04();

	}

}
