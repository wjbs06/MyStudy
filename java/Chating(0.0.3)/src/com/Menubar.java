package com;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//메뉴바 클래스

public class Menubar extends Frame implements ActionListener{
	
	public Menubar() {
		MenuBar mb =new MenuBar(); //메뉴바 생성
		
		Menu mnufile =new Menu("File"); // 메뉴에서 파일
		Menu mnuinform =new Menu("Help"); //메뉴에서 도움말
		
		MenuItem mnuexit =new MenuItem("Exit"); //메뉴파일 안에 종료
		MenuItem mnucre =new MenuItem("Creator"); //메뉴 도움말 안에 만든이
		
		mnuexit.addActionListener(this); //종료버튼을 누를시 동작하기위한 액션리스너 추가
		mnucre.addActionListener(this); //크리에이터 버튼을 누를시 동작하기위한 액션리스너 추가
		
		mnufile.add(mnuexit); //파일메뉴에 종료 추가
		mnuinform.add(mnucre); //파일 도움말에 제작자 추가
		
		mb.add(mnufile); //메뉴바에 파일메뉴 추가
		mb.add(mnuinform); //메뉴바에 도움말 추가
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg =((MenuItem)e.getSource()).getLabel(); 
		if(msg.equals("Exit")){
			dispose(); //종료
		}else if(msg.equals("Creator")){
			final Dialog d =new Dialog(this, "Creator"); //제작자를 보여주는 다이얼로그 창 생성
			Label la =new Label("creator : we are the one"); //제작자명 들어가는 라벨
			la.setAlignment(Label.CENTER);
			d.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					d.setVisible(false); //x표시 누를시 창 안보이게함.
				}
			});
			d.add(la); //다이얼 로그에 라벨 추가(제작자 명 쓰는곳)
			d.setBounds(600, 100, 300, 200); //다이얼로그 창위치와 크기
			d.setVisible(true);	
		}	
	}
	

}
