import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Iterator;


public class ServerThread extends Thread{

	static Socket sock;
	DataInputStream is;
	DataOutputStream os;
	
	ServerThread(Socket sock) {
		this.sock=sock;
		try {
			is=new DataInputStream(sock.getInputStream());
			os=new DataOutputStream(sock.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void run() {
		System.out.println("Á¢¼Ó");
		System.out.println(sock.getInetAddress());
		try {
			String a=is.readUTF();
			System.out.println(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


