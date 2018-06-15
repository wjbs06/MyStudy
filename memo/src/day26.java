
public class day26 {

	/*
	 * 
	 * 
	 * package com.io.am;
		
		import java.io.BufferedReader;
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		import java.io.InputStreamReader;
		
		public class Ex01 {
		
			
			public static void main(String[] args) {
				File file=new File("./ex01.txt");
				FileInputStream fis=null;
				InputStreamReader isr=null;
				BufferedReader br=null;
				if(file.exists()){
					try {
						fis=new FileInputStream(file);
						isr=new InputStreamReader(fis);
						br=new BufferedReader(isr);
						while(true){
							String msg=br.readLine();
							if(msg==null){break;}
							System.out.println(msg);
						}
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						try {
							br.close();
							isr.close();
							fis.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		
		}

	 * 
	 * 
	 * 
	 * 
	 * package com.io.am;
		
		import java.io.BufferedReader;
		import java.io.BufferedWriter;
		import java.io.File;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;
		import java.io.InputStream;
		import java.io.InputStreamReader;
		import java.io.OutputStreamWriter;
		import java.io.PrintWriter;
		import java.util.Scanner;
		
		public class Ex02 {
		
			public static void main(String[] args) {
				InputStream inn=System.in;
		//		Scanner sc=new Scanner(System.in);
				InputStreamReader isr=null;
				BufferedReader br=null;
				File file=new File("./ex01.txt");
				FileOutputStream fos=null;
				OutputStreamWriter osw=null;
				PrintWriter pw=null;
				if(file.exists()){
					try {
						isr=new InputStreamReader(inn);
						br=new BufferedReader(isr);
						fos=new FileOutputStream(file);
						osw=new OutputStreamWriter(fos);
						pw=new PrintWriter(osw);
						while(true){
		//					String msg=sc.nextLine();
							String msg=br.readLine();
							if("".equals(msg)){break;}
							pw.println(msg);
						}
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						try {
							pw.close();
							osw.close();
							fos.close();
							br.close();
							isr.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				System.out.println("입력완료");
			}
		}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.io.am;
		
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		import java.util.NoSuchElementException;
		import java.util.Scanner;
		
		public class Ex03 {
		
			
			public static void main(String[] args) {
				File file=new File("./ex01.txt");
				FileInputStream fis=null;
				Scanner sc=null;
				
				try {
					fis=new FileInputStream(file);
					sc=new Scanner(fis);
		
					while(true){
		//				String msg=sc.nextLine();
		//				if(msg==null){break;}
		//				System.out.println(msg);
						System.out.println(sc.nextLine());
					}
				
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch (NoSuchElementException e) {
				}finally{
					try {
						sc.close();
						fis.close();
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
	 * package com.io.am;
		
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		import java.io.ObjectInputStream;
		
		
		public class Ex04 {
		
			public static void main(String[] args) {
				File file=new File("./test04.bin");
				FileInputStream fis=null;
				ObjectInputStream ois=null;
				try {
					fis=new FileInputStream(file);
					ois=new ObjectInputStream(fis);
					
					Target obj=(Target)new Target();
					
					System.out.println(obj.sum1);
		//			System.out.println(obj.sum2);
					System.out.println(obj.sum3);
					obj.func1();
					obj.func2();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						ois.close();
						fis.close();
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
	 * package com.io.am;
		
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;
		import java.io.ObjectOutputStream;
		
		
		public class Ex05 {
		
			
			public static void main(String[] args) {
				File file=new File("./test04.bin");
				FileOutputStream fos=null;
				ObjectOutputStream oos=null;
				
				try {
					fos=new FileOutputStream(file);
					oos=new ObjectOutputStream(fos);
					
					Target tar=new Target();
		//			tar.sum1=999;
		//			tar.sum2=8888;
		//			tar.sum3=777
					oos.writeObject(tar);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						oos.close();
						fos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("입력완료");
			}
		
		}

	 * 
	 * 
	 * 
	 * 
	 * package com.io.am;
		
		import java.io.File;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		import java.io.RandomAccessFile;
		
		public class Ex06 {
		
			
			public static void main(String[] args) {
				File file=new File("text06.bin");
				RandomAccessFile raf=null;
				
				try {
					if(!file.exists()){
						file.createNewFile();
					}
					raf=new RandomAccessFile(file, "rw");
					raf.write("hello".getBytes());
					int su=0;
					while(true){
						su=raf.read();
						if(su==-1){break;}
						System.out.println((char)su);
					}
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						raf.close();
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
	 * package com.io.am;
		
		import java.io.FileOutputStream;
		import java.io.FileWriter;
		import java.io.IOException;
		import java.util.Scanner;
		
		public class Ex07 {
		
			public static void main(String[] args) {
		//		FileOutputStream fos=new FileOutputStream("./text.txt");
				Scanner sc=new Scanner(System.in);
				FileWriter fw=null;
				
				try {
		//			fw=new FileWriter("./text07.txt",true);//true 하면 추가됨
					fw=new FileWriter("./text07.txt");
					while(true){
						String msg=sc.nextLine();
						if("".equals(msg)){break;}
						fw.write(msg);
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						fw.close();
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
	 * package com.io.am;
		
		import java.io.FileNotFoundException;
		import java.io.FileReader;
		import java.io.IOException;
		import java.io.StreamTokenizer;
		import java.util.StringTokenizer;
		
		public class Ex08 {
		
			public static void main(String[] args) {
				FileReader fr=null;
				StreamTokenizer stken=null;
				try {
					fr=new FileReader("./text07.txt");
					stken=new StreamTokenizer(fr);
					while(stken.nextToken()!=StreamTokenizer.TT_EOF){
						switch (stken.ttype) {
						case StreamTokenizer.TT_NUMBER:
							System.out.println(stken.nval);
							break;
						case StreamTokenizer.TT_WORD:
							System.out.println(stken.sval);
							break;
						default :
							System.out.println();
							break;
						}
					}
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	 * 
	 * 
	 * *****************************************************************************************
	 * 
	 * package com.net.am;

		import java.io.IOException;
		import java.net.MalformedURLException;
		import java.net.URL;
		import java.net.URLConnection;
		import java.util.Iterator;
		import java.util.List;
		import java.util.Map;
		import java.util.Set;
		
		public class Ex04 {
		
			
			public static void main(String[] args) {
				try {
					URL url=new URL("http://www.naver.com");
					URLConnection uc=url.openConnection();
					uc.connect();
					Map<String, List<String>> map=uc.getHeaderFields();
		//			Set<String> key=map.keySet();
		//			Iterator<String> ite=key.iterator();
		//			while(ite.hasNext()){
		//				System.out.println(ite.next());
		//			}
					//Transfer-Encoding
					//null
					//Server
					//Connection
					//Vary
					//Date
					//Location
					//Content-Type
					List<String> date=map.get("Date");
					for (int i = 0; i < date.size(); i++) {
						System.out.println(date.get(i));
					}
					int su=uc.getContentLength();
					System.out.println(su);
					
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
		}

	 * 
	 * 
	 * 
	 * 
	 * package com.net.sock;
		
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

	 * 
	 * 
	 * 
	 * package com.net.sock;
		
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
