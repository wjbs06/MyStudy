package Client;

//클라이언트 UI

//import java.awt.*; 
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;


public class Ui02 extends Frame implements ActionListener {
	
	int x,y;//스크린, 프레임 위치 정하기 위한
	TextArea texA;
	TextField txtF; 
	String msg="~!@#";
	public Ui02() {
		super("Client");
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); // frame close
			}
		});
		Toolkit kit = Toolkit.getDefaultToolkit();
		texA = new TextArea(20,40);// 20행 40column text area 만들기
		texA.setBackground(new Color(200,235,245));//채팅창 바탕색 지정
		texA.setForeground(Color.GRAY); //채팅창 글자색 지정
		texA.setEditable(false);
	    txtF = new TextField(28);	// 30column text field 만들기
	    Font font = new Font("굴림", Font.BOLD, 15);
	    txtF.setBackground(new Color(170,188,215));//채팅입력 바탕색 지정
	    txtF.setFont(font); //채팅 입력은 굵은 글씨로
	    txtF.setForeground(Color.MAGENTA);//채팅 입력 글자색 
		Button btnTransfer = new Button("전송"); // 전송버튼
		btnTransfer.addActionListener(this);
		btnTransfer.setBackground(new Color(65,128,128));//버튼 색상
		btnTransfer.setForeground(Color.WHITE); //버튼 글자색
		Button btnExit = new Button("종료"); // 채팅 닫기 버튼
		btnExit.addActionListener(this);
		btnExit.setBackground(new Color(65,128,128));
		btnExit.setForeground(Color.WHITE);
		
		Panel p = new Panel();
		Panel p1= new Panel();
		add(texA);
      p.add(txtF);
      p.add(btnTransfer);
      p.add(btnExit);
      add("South",p);

		
		Dimension screan = kit.getScreenSize();
		Dimension frame=new Dimension(400,400);//가로, 세로
		x=screan.width/2-frame.width/2;
		y=screan.height/2-frame.height/2;
		setBounds(x, y, frame.width, frame.height);//Frame의 위치  
		setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(((Button)e.getSource()).getLabel()=="전송"){//버튼이 눌렸을때 그 라벨이 전송일때 밑의 if 실행
			msg=txtF.getText();//msg에 보낼문장 저장
			txtF.setText("");//입력창 초기화
		}else if(((Button)e.getSource()).getLabel()=="종료"){
			msg="EXIT";
			dispose();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ui02 ui02=new Ui02();
	}
}