package Client;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//아이피 입력 메인

public class Ui03 extends Frame implements ActionListener,MouseListener{
	
	static JTextField tfip=new JTextField(16); //ip텍스트 필드 16자 쓸수 있는용
	static JTextField tfid=new JTextField(8);//id텍스트 필드 8자 쓸수 있는용
	
	
	public Ui03() {
		JPanel jp =new JPanel(); //패널 생성
		JLabel jla =new JLabel("IP번호 "); 
		JLabel jla2 =new JLabel("ID ");
		JLabel jla3 =new JLabel();
		JButton btn = new JButton("Enter");		
		ImageIcon img =new ImageIcon("./chatimg.png");
		btn.addMouseListener(this);
		jla3.setIcon(img);
		
		jp.add(jla3);
		jp.add(jla);
		jp.add(tfip);
		jp.add(jla2);
		jp.add(tfid);
		jp.add(btn);
		
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
		
		setMenuBar(mb); //메뉴바 추가
		
		add(jp);
		setTitle("IP 및 ID 입력창"); //창 제목
		setBounds(600, 50, 600, 150); //창 크기
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	static public String getIp(){
		return tfip.getText();
	}
	
	static public String getId(){
		return tfid.getText();
	}
	
	public static void main(String[] args) {
		new Ui03();

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
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent e) {
		if(((JButton)e.getSource()).getLabel()=="Enter"){
			Client.ipaddress=tfip.getText();//ui의 ip입력창에서 ip를 받아 Client의 ip변수에 저장
			Client.id=tfid.getText();//위와 같이 id를 받아 저장
			if(Client.ipaddress!=""&&Client.id!=""){
				dispose();//내용을 받아 창을 닫음
				Client.connect();//클라이언트의 접속을 하는 메서드를 실행
			}else{
				tfip.setText("");
				tfid.setText("");
				}
		}
	}
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
