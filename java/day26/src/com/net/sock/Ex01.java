package com.net.sock;

import java.awt.color.ICC_ColorSpace;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex01 {

	
	public static void main(String[] args) {
		// 클라이언트 소켓 객체
		InetAddress addr=null;
		Socket sock=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		OutputStream os=null;
		Scanner sc=new Scanner(System.in);
		try {
			addr = InetAddress.getByName("203.236.209.219");
			sock=new Socket(addr,3000);
			System.out.println("접속 시도..");
			os=sock.getOutputStream();
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
//			String msg=br.readLine();
//			System.out.println(msg);

//			while(true){
//				System.out.print(">");
//				String msg=sc.nextLine();
//				if("exit".equals(msg)){break;}
//				os.write((msg+"\n").getBytes());
//				os.flush();
//				System.out.println(br.readLine());
//			}
			while(true){
				String temp=br.readLine();
				if("exit".equals(temp)){break;}
				System.out.println(temp);
				System.out.print(">");
				String msg=sc.nextLine();
				os.write((msg+"\n").getBytes());
				os.flush();
				System.out.println(br.readLine());
			}
			System.out.println("클라이언트 접속 종료");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				isr.close();
				is.close();
				os.close();
				sc.close();
				sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
