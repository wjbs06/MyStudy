package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Receive extends Thread{
	public Socket sock;
	BufferedReader br;
	Ui02 ui02;
	
	public Receive(Socket sock,Ui02 ui02){//Client에서 생성할때 생성자
		this.sock=sock;//소켓
		this.ui02=ui02;//채팅 ui02의 주소
	}
	
	public void run() {
		try {
			br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String msg;//전송받는 데이터
			
			while(true){
				msg=br.readLine();//서버에서 전송되는 문장
				ui02.texA.append(msg+"\n");//채팅창에 띄움
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
}
