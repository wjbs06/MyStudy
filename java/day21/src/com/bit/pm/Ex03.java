
package com.bit.pm;

import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex03 extends Frame implements MouseListener{
	class TargetButton implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			dispose();
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
		}
		public void mouseEntered(MouseEvent e) {
			
				System.out.println("버튼위로");
		}
		public void mouseExited(MouseEvent e) {
		}
	}
	public Ex03(){
		addWindowListener(new WindowListener() {
			public void windowOpened(WindowEvent e) {			}
			public void windowIconified(WindowEvent e) {			}
			public void windowDeiconified(WindowEvent e) {			}
			public void windowDeactivated(WindowEvent e) {			}
			public void windowClosing(WindowEvent e) {		}
			public void windowClosed(WindowEvent e) {			}
			public void windowActivated(WindowEvent e) {			}
		});
		addMouseListener(this);
		
		Panel p=new Panel();
		p.addMouseListener(this);
		Button btn=new Button("버튼");
		btn.addMouseListener(new TargetButton());
		Button btn1=new Button("버튼1");
		btn1.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {		}
			public void mouseExited(MouseEvent e) {	}
			public void mouseEntered(MouseEvent e) {System.out.println("버튼1위로");}
			public void mouseClicked(MouseEvent e) {
				Object obj=e.getSource();
				Component comp=(Component)obj;
				if("Button0".equals(comp.getName())){
					dispose();
				}else if("panel0".equals(comp.getName())){
					System.out.println("패널위 클릭");
				}
			}
		});
		p.add(btn1);
		p.add(btn);
		add(p);
		setSize(500,300);
		setLocation(900, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex03();
	}
	public void mouseClicked(MouseEvent e) {	}
	public void mousePressed(MouseEvent e) {	}
	public void mouseReleased(MouseEvent e) {	}
	public void mouseEntered(MouseEvent e) {		System.out.println("위로");	}
	public void mouseExited(MouseEvent e) {	}
}
