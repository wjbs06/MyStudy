package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {//접속을 받아 접속자들을 넘겨주는 서버클래스

	public static ArrayList<PrintWriter> list;//접속자목록 리스트선언
	public static ArrayList idList;
	
	public static void main(String[] args){
		Socket sock;
		ServerSocket serv = null;
		
		list=new ArrayList<PrintWriter>();//리스트 초기화
		idList=new ArrayList();
		int cnt=0;
		try {
			serv=new ServerSocket(3000);//소켓 포트번호 설정
			
			while(true){
				System.out.println("접속대기중");
				sock=serv.accept();//접속받는문
				System.out.println(sock.getInetAddress());
				ClientManager manage=new ClientManager(sock,cnt);//클라이언트를 관리하는 매니저 선언및 초기화
				list.add(new PrintWriter(sock.getOutputStream()));//위에서 선언한 접속자 목록에 추가
				manage.start();//접속자를 관리하는 매니저 스레드 시작
				System.out.println("접속완료");
				cnt++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				serv.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


