package Client;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
// 서버메인

public class Ui01 extends Frame implements ActionListener{
  
	public Ui01() {
		int Client =1; //클라이언트가 접속시 1, 아닐시 0
		Panel p1 =new Panel(new BorderLayout());
		Panel p2 =new Panel(new BorderLayout());
		Label la1 =new Label("User"); //순수 라벨
		Label la2 =new Label("User Name(Client)");  //상단의 접속자 목록
		
		Icon icon=new ImageIcon("./chatimg.png"); //채팅 버튼 이미지.
		
		Checkbox ck1 =new Checkbox("Client1");
		Checkbox ck2 =new Checkbox("Client");
		
		Font f1 = new Font("", Font.BOLD, 50); //폰트설정
		Font f2 = new Font("", Font.BOLD, 20); //폰트설정
		
		la1.setFont(f1);
		la2.setFont(f2);
		la1.setAlignment(Label.CENTER); //중앙정렬.
		la2.setAlignment(Label.CENTER); //중앙정렬.
		
		JButton btn =new JButton("chatting"); //버튼에 채팅이라는 글씨 입력
		btn.setIcon(icon); //버튼에 이미지 추가
		btn.setFont(f2); //버튼 폰트 변경
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		if(Client ==1){ //클라이언트가 접속하면 알림창과 리스트에 이름이 뜸.
			la2.setVisible(true); 
			final Dialog d =new Dialog(this, "Alarm");
			Font f3 = new Font("", Font.ITALIC, 20);
			Label la =new Label("Client connected");
			la.setAlignment(Label.CENTER);
			la.setFont(f3);
			d.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					d.setVisible(false); //x표시 누를시 창 안보이게함.
				}
			});

			d.add(la);
			d.setBounds(600, 100, 300, 200); //다이얼로그 창위치와 크기
			d.setVisible(true);
		} else {
			la2.setVisible(false);
		}
		
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
		
		p2.add(btn, BorderLayout.SOUTH); //P2에 채팅으로 입장하는 버튼을 추가
		p1.add(la1, BorderLayout.NORTH); //P1에 유저라는 라벨을 패널에 추가
		p1.add(la2, BorderLayout.CENTER); //P1에 접속자 알림 라벨을 패널에 추가
		setMenuBar(mb); //메뉴바 추가
		add(p1,BorderLayout.NORTH); //프레임에 패널 추가
		add(p2,BorderLayout.SOUTH); //프레임에 패널 추가
		setTitle("채팅메인창"); //창 제목
		setBounds(600, 50, 300, 600); //창 크기
		setVisible(true);

	}
	

	public static void main(String[] args) {
		new Ui01();

	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg =((MenuItem)e.getSource()).getLabel(); 
		if(msg.equals("Exit")){
			dispose(); //종료
		}else if(msg.equals("Creator")){
			final Dialog d =new Dialog(this, "Creator"); //제작자를 보여주는 다이얼로그 창 생성
			Label la =new Label("creator : we are the one"); //제작자명 들어가는 라벨
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
