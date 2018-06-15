package com.bit.am;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

public class Ex09 extends Frame{
	public Ex09(){
		Canvas can=new Canvas(){
			public void paint(Graphics g) {
				g.drawLine(50, 50, 250, 50);
				g.drawRect(100, 100, 50, 50);
				g.setColor(Color.BLUE);
				g.drawRect(100, 100, 50, 50);
				g.drawRect(200, 100, 50, 50);
				g.fillRect(100, 200, 50, 50);
				g.fillOval(200, 200, 50, 50);
				g.drawArc(300, 150, 50, 50, 0, 360);
				g.fillArc(300, 250, 50, 50, 0, 360);
				
				g.fill3DRect(300, 300, 50, 50, true);
				Toolkit kit =Toolkit.getDefaultToolkit();
				Image img=kit.getImage("myimg.png");
				g.drawImage(img, 200, 300, this);
			}
		};
		add(can);
		setBounds(900, 100, 500, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex09();
	}
}