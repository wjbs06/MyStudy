package com.ui.am;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Target;
import java.util.concurrent.atomic.LongAccumulator;

public class Ex02 extends Frame implements ActionListener{
	FileDialog dia_s;
	FileDialog dia_l;
	Dialog dia_i;
	String f;//절대경로
	TextArea ta;
	public Ex02(){
		super("메모장");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		MenuBar bar=new MenuBar();
		Menu menu1=new Menu("파일");
		Menu menu2=new Menu("도움말");
		
		MenuItem mi1_1=new MenuItem("열기");
		MenuItem mi1_2=new MenuItem("저장");
		MenuItem mi1_3=new MenuItem("종료");
		menu1.add(mi1_1);
		mi1_1.addActionListener(this);
		menu1.add(mi1_2);
		mi1_2.addActionListener(this);
		menu1.add(mi1_3);
		mi1_3.addActionListener(this);
		
		MenuItem mi2_1=new MenuItem("정보");
		menu2.add(mi2_1);
		mi2_1.addActionListener(this);
		
		bar.add(menu1);
		bar.add(menu2);
	
		dia_s=new FileDialog(this,"저장",FileDialog.SAVE);
		dia_s.setBounds(900, 100, 100, 100);
		dia_l=new FileDialog(this,"열기",FileDialog.LOAD);
		dia_l.setBounds(900, 100, 100, 100);
		dia_i=new Dialog(this,"정보");
		dia_i.setBounds(900, 100, 300, 300);
		dia_i.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dia_i.dispose();
			}
		});
		
		ta=new TextArea();
		add(ta);
		
		Label la=new Label();
		String msg="안녕하세요";
		la.setText(msg);
		
		dia_i.add(la);
		
		add(ta);
		setMenuBar(bar);
		setBounds(900, 100, 500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex02();
	}
	public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand()=="열기"){
				dia_l.setVisible(true);
				f=dia_l.getDirectory()+dia_l.getFile();
				
				File source=new File(f);
				FileReader fr=null;
				BufferedReader br=null;
				
				try {
					fr=new FileReader(source);
					br=new BufferedReader(fr);
					int su=0;
					String temp="";
					while(true){
						su=br.read();
						if(su==-1){break;}
						temp+=(char)su;
					}
					ta.setText(temp);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally{
					try {
						br.close();
						fr.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}else if(e.getActionCommand()=="저장"){
				dia_s.setVisible(true);
				f=dia_s.getDirectory()+dia_s.getFile();
				
				File target=new File(f);
				FileWriter fw=null;
				BufferedWriter bw=null;
				
				byte[] buff=new byte[10];
				
				try {
					fw=new FileWriter(target);
					bw=new BufferedWriter(fw);
					
//					while(true){
						String temp=ta.getText();
//						if(temp==null){break;}
						bw.write(temp);
						bw.newLine();
//					}
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally{
					try {
						bw.close();
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}else if(e.getActionCommand()=="종료"){
				dispose();
			}else if(e.getActionCommand()=="정보"){
				dia_i.setVisible(true);
			}
	}
}