package com.net.sock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.AllPermission;
import java.util.ArrayList;
import java.lang.Thread;

public class Ex03 extends Thread{
	Socket mySock;
	static ArrayList<Socket> list=new ArrayList<Socket>();
	
	public void allpush(String msg){
		for (int i = 0; i < list.size(); i++) {
			Socket temp=list.get(i);
			try {
				OutputStream os=temp.getOutputStream();
				os.write(msg.getBytes());
				os.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//¼­¹ö
	public void run(){
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		is=mySock.getInputStream();
		isr=new InputStreamReader(is);
		br=new BufferedReader(isr);
		while(true){
			String msg=br.readLine();
//			allPush(msg);
		}
		
	}
	public static void main(String[] args) {
		ServerSocket serv=null;
		try {
			serv=new ServerSocket(3000);
			while(true){
				Socket temp=serv.accept();
				list.add(temp);
				Ex03 me=new Ex03();
				me.mySock=temp;
				me.start();
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
