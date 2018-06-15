package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Receive extends Thread{
	public Socket sock;//receive 에서 쓸 sock선언
	BufferedReader br;//버퍼선언
	
	
	public Receive(Socket sock){//생성자에 받아온 sock전달
		this.sock=sock;
	}
	
	public void run() {
		try {
			br=new BufferedReader(new InputStreamReader(sock.getInputStream()));//br > is > sock.is
			String msg;//전달받을 텍스트를 저장할 smg
			String[] ids;//전달받은 텍스트를 분할하여 저장할 ids배열
			
			while(true){
				msg=br.readLine();//전달받아 smg에 저장
				if(msg.contains("님이 입장하셨습니다")){//처음만 실행되는 if문으로 ~님이 입장하셨습니다 라는 문장을 구분하기 위함
				}
			
				
//				if(msg.contains("!@")){//clientmanager에서 전달되는 문자을 확인하기 위한 if
//					ids=msg.split("!@"+Client.id+">!@");//ids배열에 전달받은 msg를 괄호안의 내용으로 분할
//					//!@ID>!@내가하고 싶은말    msg에서 전달되는 문장이 왼쪽처럼 되어있기때문에 위에서 분할
//					msg=ids[1];//그렇게 분할되면 ids[0]=!@ID>!@ ids[1]=내가하고싶은말로 분할됨
//					Client.main.texA.append(msg+"\n");//msg에 저장된 ids[1]을 텍스트aera에 추가
//				}
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
