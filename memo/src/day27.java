
public class day27 {

	/*
	 * 
	 * 
	 * package com.net.am;
		
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
						msg.append(Arrays.copyOfRange(cbuf, 0, su));
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

	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.net.am;
		
		import java.io.IOException;
		import java.io.OutputStream;
		import java.io.OutputStreamWriter;
		import java.net.Socket;
		import java.net.UnknownHostException;
		
		public class Client {
		
			
			public static void main(String[] args) {
				final String ip="203.236.209.219";
				final int port=3000;
				
				Socket sock=null;
				
				try {
					System.out.println("서버 접속 준비");
					sock=new Socket(ip,port);
					System.out.println("서버 접속");
					
					OutputStream os=sock.getOutputStream();
					OutputStreamWriter osw=new OutputStreamWriter(os);
					osw.write("접속하였음");
					osw.flush();
					
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						sock.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
		
		}

	 * 
	 * 
	 * 
	 * 
	 * package com.net.tcp02;
		
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStream;
		import java.io.InputStreamReader;
		import java.io.OutputStream;
		import java.net.ServerSocket;
		import java.net.Socket;
		
		public class Server extends Thread{
			InputStream is;
			OutputStream os;
			
			Server(InputStream is, OutputStream os) {
				this.is=is;
				this.os=os;
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
						System.out.println(msg);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					try {
						br.close();
						isr.close();
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
						Server ser=new Server(is, os);
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

	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.net.tcp02;

		import java.awt.Frame;
		import java.awt.TextArea;
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStream;
		import java.io.InputStreamReader;
		import java.io.OutputStream;
		import java.io.OutputStreamWriter;
		import java.net.Socket;
		import java.net.UnknownHostException;
		import java.util.Scanner;
		
		public class Client extends Thread{
			final static InputStream is=null;
			public Client(){
				
			}
		
			static class Ui extends Frame{
				static TextArea ta;
				public Ui(){
					ta=new TextArea();
					add(ta);
					setBounds(400, 300, 900, 100);
					setVisible(true);
				}
			}
			public void run(){
				InputStreamReader isr;
				BufferedReader br;
				try {
				isr=new InputStreamReader(is);
				br=new BufferedReader(isr);
				Ui ui=new Ui();
				while(true){
						ui.ta.setText(br.readLine());
				}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				}
			
					
			
			
			
			
			public static void main(String[] args) {
				final String ip="203.236.209.219";
				final int port=3000;
				Scanner sc=new Scanner(System.in);
				Socket sock=null;
				
				try {
					System.out.println("서버 접속 준비");
					sock=new Socket(ip,port);
					System.out.println("서버 접속");
					
					Client cli=new Client();
					cli.start();
					
					OutputStream os=sock.getOutputStream();
					OutputStreamWriter osw=new OutputStreamWriter(os);
					
		//			InputStream is=sock.getInputStream();
					
					while(true){
						String msg=sc.nextLine();
						osw.write(msg+"\n");
						osw.flush();
						if(msg.equals("exit")){break;}
		//				System.out.println(br.readLine());
						
					}
					
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						sock.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
		
		}

	 * 
	 * 
	 * 
	 * 
	 * package com.net.tcp02;
		
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

	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
