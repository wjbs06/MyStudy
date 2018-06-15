package com.net.sock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import org.omg.CosNaming.IstringHelper;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("1.문제 맞추시오");
		list.add("2.문제 맞추시오");
		list.add("3.문제 맞추시오");
		list.add("4.문제 맞추시오");
		list.add("5.문제 맞추시오");
		ServerSocket serv=null;
		OutputStream os=null;
		
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try {
			serv=new ServerSocket(3000);
			System.out.println("서버 대기중");
			Socket sock=serv.accept();
			os=sock.getOutputStream();
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			
//			os.write("Hello".getBytes());
//			os.flush();
			
//			while(true){
//				String msg=br.readLine();
//				if(msg==null){break;}
//				os.write((msg+"\n").getBytes());
//				System.out.println(msg);
//			}
			
			for (int i = 0; i < list.size(); i++) {
				String msg=br.readLine();
				if(msg==null){break;}
				os.write((msg+"\n").getBytes());
				System.out.println(msg);				
			}
			
			System.out.println("서버종료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				isr.close();
				is.close();
				os.close();
				serv.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}