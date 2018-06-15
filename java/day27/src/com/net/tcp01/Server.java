package com.net.tcp01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Arrays;

public class Server {

	public static void main(String[] args) {
		final int port=3000;
		ServerSocket serv=null;
		Socket sock=null;
		
		try {
			serv=new ServerSocket(port);
			System.out.println("접속 대기중");
			sock=serv.accept();
			System.out.println("접속 완료");
			InetAddress local=sock.getLocalAddress();
			System.out.println(local.getHostAddress());
			SocketAddress remote=(InetSocketAddress) sock.getRemoteSocketAddress();
			System.out.println("client name: "+((InetSocketAddress)remote).getHostName());
			InetAddress addr=((InetSocketAddress)remote).getAddress();
			System.out.println("client ip: "+addr.getHostAddress());
			InputStream is=sock.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			int su=0;
			byte[] buff=new byte[2];
			char[] cbuf=new char[50];
			StringBuffer msg=new StringBuffer();
			while(true){
				su=isr.read(cbuf);
				if(su==-1){break;}
				msg.append(new String(cbuf, 0, su));
			}
			System.out.print(msg);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				sock.close();
				serv.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
