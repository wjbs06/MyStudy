package Client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;

import javax.print.attribute.standard.OutputDeviceAssigned;


public class Send extends Thread{

	public Socket sock;//socket 선언
	BufferedReader br;//퍼버 선언
	PrintWriter pw;// 프린트 선언
	public static String msg;//보낼때 넣을 msg
	public Send(Socket sock){//send 생성자로 sock을 받아 send 클래스에 전달
		this.sock=sock;
	}
	
	public void run() {
		
		try {
			br=new BufferedReader(new InputStreamReader(System.in));//br > is > sock.is
			pw=new PrintWriter(sock.getOutputStream());//sock.os를 통해 보내는 문
			
			pw.println("idID"+Client.id);//서버 clientmanager에서 받을 "idID"+클라이언트에서 입력받은 id를 전송
			pw.flush();
			
			while(true){//위에서는 처음에 id만 보내고 밑의 보내는문만 반복
				if(msg!=null){
//					br.read();
					System.out.println(msg);
				msg=br.readLine();//ui02에서 보내는 텍스트들을 받아 msg로 저장
//				if(msg.equals("exit")){break;} 원래 쓰던 종료문구 보류
					pw.println(msg);// 서버 clientmanager로 보냄.
					pw.flush();
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				pw.close();//닫는문
				br.close();
				sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}