import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {

	public void init(String ip,int port){
		System.out.println("立加");
		Socket sock=null;
		String line;
		int cnt=0;
		
		try {
		String Ip="203.236.209.220";
		int Port=3000;
		
			sock=new Socket(Ip,Port);
			BufferedReader br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			while(true){
				cnt++;
				line = br.readLine();
				if(line==null){break;}
				Thread.sleep(10);
				System.out.println(line);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				sock.close();
				System.out.println("立加辆丰");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
