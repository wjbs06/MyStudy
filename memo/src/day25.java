
public class day25 {

	/*
	 * 
	 * package com.bit.am;
		
		import java.io.File;
		import java.io.FileNotFoundException;
		import java.io.FileReader;
		import java.io.IOException;
		
		public class Ex01 {
		
		
			public static void main(String[] args) {
				File file=new File("./txt/ex01.txt");
				char[] buff=new char[1];
				FileReader fr=null;
				
				try {
					fr=new FileReader(file);
					while(true){
						int su=fr.read(buff);
						if(su==-1){break;}
						System.out.print(new String(buff));
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
	 * package com.bit.am;
		
		import java.io.File;
		import java.io.FileWriter;
		import java.io.IOException;
		import java.util.Scanner;
		
		public class Ex02 {
		
		
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				String msg=sc.nextLine();
				char[] chs=msg.toCharArray();
				
				char[] buff=new char[chs.length+1];
				
				File f=new File("./txt/ex01.txt");
				FileWriter fw=null;
				
				try {
					fw=new FileWriter(f);
					
					fw.write(buff);
					
					
					
		//			for (int i = 0; i < chs.length; i++) {
		//				int su=(int)chs[i];
		//				fw.write(su);
		//			}
					
					
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
	 * 
	 * package com.bit.am;
		
		import java.io.BufferedReader;
		import java.io.BufferedWriter;
		import java.io.File;
		import java.io.FileNotFoundException;
		import java.io.FileReader;
		import java.io.FileWriter;
		import java.io.IOException;
		
		public class Ex03 {
		
			
			public static void main(String[] args) {
				File source=new File("./txt/ex01.txt");
				File target=new File("./ex01.txt");
				
				char[] buff=new char[5];
				
				FileReader fr=null;
				FileWriter fw=null;
				
				BufferedReader br=null;
				BufferedWriter bw=null;
				
				try {
					fr=new FileReader(source);
					fw=new FileWriter(target);
					
					br=new BufferedReader(fr);
					bw=new BufferedWriter(fw);
			
					int su=0;
					while(true){
						su=br.read(buff);
						if(su==-1){break;}
						bw.write(buff,0,su);
		//				bw.flush();
					}
		//			while(true){
		//				su=fr.read(buff);
		//				if(su==-1){break;}
		//				fw.write(buff,0,su);
		//			}
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						bw.close();
						br.close();
						fw.close();
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
	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.bit.am;
		
		import java.io.BufferedInputStream;
		import java.io.BufferedOutputStream;
		import java.io.BufferedReader;
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.FileReader;
		import java.io.IOException;
		import java.io.PrintStream;
		
		public class Ex05 {
		
			
			public static void main(String[] args) {
				File source=new File("./txt/ex01.txt");
				File target=new File("./txt/copy01.txt");
				
		//		FileInputStream fis=null;
				FileReader fr=null;
				FileOutputStream fos=null;
				
		//		BufferedInputStream bis=null;
				BufferedReader br=null;
				BufferedOutputStream bos=null;
				
				PrintStream ps=null;
				
				byte[] buff=new byte[128];
				try {
		//			fis=new FileInputStream(source);
					fr=new FileReader(source);
					fos=new FileOutputStream(target);
					
		//			bis=new BufferedInputStream(fis);
					br=new BufferedReader(fr);
					bos=new BufferedOutputStream(fos);
					
					ps=new PrintStream(bos);
					int su=0;
					while(true){
		//				su=bis.read(buff);
						String temp=br.readLine();
		//				if(su==-1){break;}
						if(temp==null){break;}
						ps.println(temp);
		//				ps.write(buff,0,su);
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						ps.close();
						bos.close();
						br.close();
		//				bis.close();
						fos.close();
						fr.close();
		//				fis.close();
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
	 * package com.ui.am;
		
		import java.awt.Dialog;
		import java.awt.FileDialog;
		import java.awt.Frame;
		import java.awt.Label;
		import java.awt.Menu;
		import java.awt.MenuBar;
		import java.awt.MenuItem;
		import java.awt.Panel;
		import java.awt.TextArea;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.awt.event.WindowAdapter;
		import java.awt.event.WindowEvent;
		import java.io.BufferedReader;
		import java.io.BufferedWriter;
		import java.io.File;
		import java.io.FileNotFoundException;
		import java.io.FileReader;
		import java.io.FileWriter;
		import java.io.IOException;
		import java.lang.annotation.Target;
		import java.util.concurrent.atomic.LongAccumulator;
		
		public class Ex02 extends Frame implements ActionListener{
			FileDialog dia_s;
			FileDialog dia_l;
			Dialog dia_i;
			String f;//절대경로
			TextArea ta;
			public Ex02(){
				super("메모장");
				addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						dispose();
					}
				});
				
				MenuBar bar=new MenuBar();
				Menu menu1=new Menu("파일");
				Menu menu2=new Menu("도움말");
				
				MenuItem mi1_1=new MenuItem("열기");
				MenuItem mi1_2=new MenuItem("저장");
				MenuItem mi1_3=new MenuItem("종료");
				menu1.add(mi1_1);
				mi1_1.addActionListener(this);
				menu1.add(mi1_2);
				mi1_2.addActionListener(this);
				menu1.add(mi1_3);
				mi1_3.addActionListener(this);
				
				MenuItem mi2_1=new MenuItem("정보");
				menu2.add(mi2_1);
				mi2_1.addActionListener(this);
				
				bar.add(menu1);
				bar.add(menu2);
			
				dia_s=new FileDialog(this,"저장",FileDialog.SAVE);
				dia_s.setBounds(900, 100, 100, 100);
				dia_l=new FileDialog(this,"열기",FileDialog.LOAD);
				dia_l.setBounds(900, 100, 100, 100);
				dia_i=new Dialog(this,"정보");
				dia_i.setBounds(900, 100, 300, 300);
				dia_i.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						dia_i.dispose();
					}
				});
				
				ta=new TextArea();
				add(ta);
				
				Label la=new Label();
				String msg="안녕하세요";
				la.setText(msg);
				
				dia_i.add(la);
				
				add(ta);
				setMenuBar(bar);
				setBounds(900, 100, 500, 300);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex02();
			}
			public void actionPerformed(ActionEvent e) {
					if(e.getActionCommand()=="열기"){
						dia_l.setVisible(true);
						f=dia_l.getDirectory()+dia_l.getFile();
						
						File source=new File(f);
						FileReader fr=null;
						BufferedReader br=null;
						
						try {
							fr=new FileReader(source);
							br=new BufferedReader(fr);
							int su=0;
							String temp="";
							while(true){
								su=br.read();
								if(su==-1){break;}
								temp+=(char)su;
							}
							ta.setText(temp);
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}finally{
							try {
								br.close();
								fr.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}else if(e.getActionCommand()=="저장"){
						dia_s.setVisible(true);
						f=dia_s.getDirectory()+dia_s.getFile();
						
						File target=new File(f);
						FileWriter fw=null;
						BufferedWriter bw=null;
						
						byte[] buff=new byte[10];
						
						try {
							fw=new FileWriter(target);
							bw=new BufferedWriter(fw);
							
		//					while(true){
								String temp=ta.getText();
		//						if(temp==null){break;}
								bw.write(temp);
								bw.newLine();
		//					}
							
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}finally{
							try {
								bw.close();
								fw.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}else if(e.getActionCommand()=="종료"){
						dispose();
					}else if(e.getActionCommand()=="정보"){
						dia_i.setVisible(true);
					}
			}
		}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * package com.io.pm;
		
		import java.io.ByteArrayInputStream;
		import java.io.ByteArrayOutputStream;
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;
		
		public class Ex01 {
		
			public static void main(String[] args) {
				File file=new File("./ex01.txt");
				byte[] buff=new byte[32];
				FileInputStream fis=null;
				FileOutputStream fos=null;
				ByteArrayInputStream bais=null;
				ByteArrayOutputStream baos=null;
				try {
					fis=new FileInputStream(file);
					fos=new FileOutputStream(file);
					baos=new ByteArrayOutputStream();
					while(true){
						int su=fis.read(buff);
						if(su==-1){break;}
						baos.write(buff, 0, su);
					}
					bais=new ByteArrayInputStream(baos.toByteArray());
					while(true){
						int su=bais.read(buff);
						if(su==-1){break;}
						System.out.write(buff,0,su);
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						bais.close();
						baos.close();
						fos.close();
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
	 * package com.io.pm;
		
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;
		import java.io.ObjectInputStream;
		import java.io.ObjectOutputStream;
		import java.util.Vector;
		
		public class Ex02 {
		
			public static void main(String[] args) {
				Vector temp=null;
				Vector temp2=null;
				File file=new File("./ex02.bin");
				
				FileOutputStream fos=null;
				FileInputStream fis=null;
				
				ObjectOutputStream oos=null;
				ObjectInputStream ois=null;
				
				try {
					fos=new FileOutputStream(file);
					oos=new ObjectOutputStream(fos);
					
					Vector vec1=new Vector();
					vec1.addElement("abcd");
					vec1.addElement(1234);
					vec1.addElement(true);
					
					oos.writeObject(vec1);
					oos.flush();
					
					Vector vec2=new Vector();
					vec2.addElement("efgh");
					vec2.addElement(5678);
						
						Vector vec3=new Vector();
						vec3.addElement("ijkl");
						vec3.addElement(9101112);
						vec3.addElement(false);
						
					vec2.addElement(vec3);
					
					oos.writeObject(vec2);
					oos.flush();
					
					fis=new FileInputStream(file);
					ois=new ObjectInputStream(fis);
					
					temp=(Vector)ois.readObject();
					temp2=(Vector)ois.readObject();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						fos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				for (int i = 0; i < temp.size(); i++) {
					System.out.println(temp.get(i));
				}
				for (int i = 0; i < temp2.size(); i++) {
					if(i<2){
						System.out.println(temp2.get(i));
					}else{
						Vector tmp3=(Vector)temp2.get(i);
						for (int j = 0; j < tmp3.size(); j++) {
							System.out.println(tmp3.get(j));
						}
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
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
