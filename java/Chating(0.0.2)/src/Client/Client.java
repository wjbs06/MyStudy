package Client;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Client.Receive;
import Client.Send;

public class Client extends Thread{
	public static String id;//client id 선언
	public static String ipaddress="";//ip선언
	static Socket sock;//sock선언
	static PrintWriter pw;
//	static Ui02 main;
	
	public static void main(String[] args){
		int port=3000;//포트 설정
		Ui03 ui=new Ui03();//초기화면 선언및 초기화로 초기화면 띄움
	}
	public static void connect(){//ui03이 끝나며 실행되는 접속문
		try {
			sock=new Socket("203.236.209.220",3000);//ip를 받아 접속
//			pw=new PrintWriter(sock.getOutputStream());보류
			Ui02 main=new Ui02(sock);//receive 클래스에서 txtarea에 띄우기 위한 문
			Receive receive=new Receive(sock);//receive 스레드
			receive.start();//실행
			Send send=new Send(sock);//send 스레드
			send.start();//실행
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
