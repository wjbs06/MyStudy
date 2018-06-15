import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class Server{
	
	
	public static void main(String[] args) {
		ServerSocket serv=null;
		Socket sock;
		try {
			
			serv=new ServerSocket(3000);
			while(true){
				System.out.println("접속대기중");
				sock=serv.accept();
				InetAddress ia=sock.getInetAddress();
				int port=sock.getLocalPort();
				String i=ia.getHostAddress();
				System.out.println(i+" "+port);
				ServerThread st=new ServerThread(sock);
				st.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//finally{
//			try {
////				serv.close();
//				System.out.println("접속종료");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}