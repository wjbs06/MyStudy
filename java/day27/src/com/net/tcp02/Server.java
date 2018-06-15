package com.net.tcp02;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

public class Server extends Thread{
	InputStream is;
//	static OutputStream[] os=new OutputStream[0];
	static ArrayList<OutputStream> list=new ArrayList<OutputStream>();
	
	Server(InputStream is) {
		this.is=is;
	}

	public void run() {
		InputStreamReader isr=null;
		BufferedReader br=null;
		char[] cbuf=new char[10];
		try {
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			while(true){
				String msg=br.readLine();
				if(msg==null){break;}
				msg+="\n";
//				System.out.println(msg);
//				for (int i = 0; i < os.length; i++) {
//					os[i].write(msg.getBytes());
//				}
				for (int i = 0; i < list.size(); i++) {
					list.get(i).write(msg.getBytes());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
	public static void main(String[] args) {
		ServerSocket serv=null;
		
		try {
			serv=new ServerSocket(3000);
			while (true) {
				Socket sock=serv.accept();
				InputStream is=sock.getInputStream();
				OutputStream os=sock.getOutputStream();
				
//				OutputStream[] temp=new OutputStream[Server.os.length+1];
//				System.arraycopy(os, 0, temp, 0, Server.os.length);
//				temp[Server.os.length]=os;
//				Server.os=temp;
				
				Server ser=new Server(is);
				ser.start();
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
