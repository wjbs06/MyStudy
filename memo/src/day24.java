
public class day24 {

	/*
	 *
	 *
	 *package com.bit.am;
		
		import java.io.File;
		import java.io.IOException;
		
		public class Ex01 {
			//vm에서 운영체제에서 읽어오는데 있으면 true/없으면 false
			
			public static void main(String[] args) throws IOException {
		//		File f0=new File("main01.png");
		//		System.out.println("파일존재 유무 :"+f0.exists());
		//		func(f0);
				File f1=new File("C:\\jtest\\workspace\\myStudy\\day24\\main01.png");//절대경로
				System.out.println("파일존재 유무 :"+f1.exists());
				func(f1);
				
				System.out.println(f1.getPath());
				//절대경로는 같지만 방식이 다르다
				System.out.println(f1.getCanonicalPath());
				System.out.println(f1.getAbsolutePath());
				String path1=f1.getAbsolutePath();
				String path2=f1.getCanonicalPath();
				System.out.println(path1.replace(path2,""));
				System.out.println(f1.getParent());
				System.out.println(f1.getName());
				System.out.println(f1.getParent()+"\\"+f1.getName());
				System.out.println(f1.canRead());
				System.out.println(f1.canWrite());//파일을 읽기전용으로 하면 쓰는건 불가능
				System.out.println(f1.canExecute());
				
				
				File f2=new File("dir/../main01.png");//dir의 상위의 디렉토리
				System.out.println("파일존재 유무 :"+f2.exists());
				func(f2);
				File f3=new File("./main01.png");//현재 디렉토리
				System.out.println("파일존재 유무 :"+f3.exists());
				func(f3);
			}
		
			public static void func(File f){
				if(f.isDirectory()){
					System.out.println("디렉토리");
				}else if(f.isFile()){
					System.out.println("파일");
				}
			}
		}

	 *
	 *
	 *
	 *
	 *
	 *package com.bit.am;
		
		import java.io.File;
		import java.text.DateFormat;
		import java.text.Format;
		import java.text.SimpleDateFormat;
		import java.util.Date;
		
		public class Ex03 {
			
			public static void main(String[] args) {
		//		File f=new File("C:\\test");
		//		String[] st=f.list();
		//		if(f.exists()){
		//			for (int i = 0; i< st.length; i++) {
		////				System.out.println(st[i]);
		//				String path="C:\\test"+"\\"+st[i];
		////				System.out.println(path);
		//				File f1=new File(path);
		//				String dir=null;
		//				if(f1.isDirectory()){
		//					dir="디렉토리";
		//				}else if(f1.isFile()){
		//					dir="파일";
		//				}
		//				Date date=new Date(f1.lastModified());
		//				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh-mm");
		//				long size=f1.length();
		//				String name=f1.getName();
		//				if(dir=="파일"){
		//					System.out.println(sdf.format(date)+"\t"+dir+"\t\t"+size+"\t"+name);					
		//				}else{
		//					System.out.println(sdf.format(date)+"\t"+dir+"\t"+size+"\t"+name);
		//				}
		//			}
		//		}
				System.out.println("---------------------------------------------------------");
				File f=new File("c:\\test");
				if(f.exists()){
					String[] name=f.list();
					System.out.print(isTime(f)+"\t");
					if(isDir(f)){System.out.print("<dir>");};
					System.out.print(isSize(f)+"\t");
					System.out.println(".");
					if(f.getParent()!=null){
						File parent=new File(f.getParent());
						System.out.print(isTime(parent)+"\t");
						if(isDir(parent)){System.out.print("<dir>");};
						System.out.print(isSize(parent)+"\t");
						System.out.println("..");
					}
					for (int i = 0; i < name.length; i++) {
						File temp=new File(f.getPath()+"\\"+name[i]);
						System.out.print(isTime(temp));
						if(isDir(temp)){
							System.out.print("<Dir>\t");
							System.out.print(name[i]);
						}else{
							System.out.print("\t");
							System.out.print(isSize(temp));
							System.out.print("\t");
							System.out.print(name[i]);
						}
						System.out.println();
						
						
					}
				}
			
				
			}
			public static String isSize(File f){
				String msg="";
				if(f.isFile()){
					msg=""+f.length();
					
				}
				return msg;
			}
			public static String isTime(File f){
				String msg=null;
				long time=f.lastModified();
				Date date=new Date(time);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm"); 
				msg=sdf.format(date);
				return msg;
			}
			public static boolean isDir(File f){
				boolean tf=false;
				if(f.isDirectory()){
					tf=true;
				}
				return tf;
			}
		}

	 *
	 *
	 *
	 *
	 *package com.bit.pm;
		
		import java.io.IOException;
		import java.io.InputStream;
		
		public class Ex01 {
		
			
			public static void main(String[] args) {
				InputStream myInput=System.in;
				try {
					int su=0;
					while((su=myInput.read())!=13){
						System.out.println((char)su);
						su=myInput.read();
					}
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
	 *
	 *package com.bit.pm;
		
		import java.io.File;
		import java.io.FileOutputStream;
		import java.io.IOException;
		
		public class Ex02 {
		
			public static void main(String[] args) {
				String msg="abcdefg\n123456789";
				File f= new File("dir/ex02.txt");
				FileOutputStream fos;
					try {
						if(!f.exists()){
							f.createNewFile();
						}
						fos=new FileOutputStream(f);
						for (int i = 0; i < msg.length(); i++) {
							fos.write(msg.charAt(i));
						}
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
	 *
	 *package com.bit.pm;
		
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		
		public class Ex03 {
		
			public static void main(String[] args) {
				File f=new File("./dir/ex02.txt");
				FileInputStream fis=null;
				try {
					fis=new FileInputStream(f);
					int su=0;
					try {
						while((su=fis.read())!=-1){
							System.out.println(su);
						}
						fis.close();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				} catch (IOException e) {
					e.printStackTrace();
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
	 *package com.bit.pm;
		
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;
		
		public class Ex04 {
		
			public static void main(String[] args) {
				File source= new File("./game2.png");
				File target = new File("./dir/copy.png"); 
				FileInputStream fis=null;
				FileOutputStream fos=null;
				try {
					fis=new FileInputStream(source);
					fos=new FileOutputStream(target);
					int su=0;
					while((su=fis.read())!=-1){
						fos.write(su);
					}
					fos.close();
					fis.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("복사끝");
			}
		}

	 *
	 *
	 *
	 *
	 *
	 *package com.bit.pm;
		
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.List;
		
		public class Ex05 {
		
			public static void main(String[] args) {
				File file=new File("./dir/ex02.txt");
				FileInputStream fis=null;
				List<String> list=new ArrayList<String>();
				byte[] buff=new byte[12];
				try {
					fis=new FileInputStream(file);
					int su=0;
					while(true){
						su=fis.read(buff);
						if(su==-1){break;}
						byte[] temp=Arrays.copyOfRange(buff, 0, su);
						list.add(new String(temp));
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				
				
			}
		
		}

	 *
	 *
	 *
	 *
	 *
	 *package com.bit.pm;
		
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;
		
		public class Ex07 {
		
			public static void main(String[] args) {
				File file=new File("./dir/ex02.txt");
				File source=new File("./dir/ex07.txt");
				byte[] buff=new byte[1024];
				FileInputStream fis=null;
				FileOutputStream fos=null;
				try {
					fis=new FileInputStream(file);
					fos=new FileOutputStream(source);
					int su=0;
					while ((su=fis.read(buff))!=-1) {
						fos.write(buff,0,su);//읽는만큼 쓴다
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						fis.close();
						fos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("쓰기완료");
			}
		
		}
	 *
	 *
	 *
	 *
	 *
	 *
	 *package com.bit.pm;
		
		import java.io.BufferedInputStream;
		import java.io.BufferedOutputStream;
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;
		
		public class Ex10 {
		
			public static void main(String[] args) {
				File source=new File("./dir/ex07.txt");
				File target=new File("./dir/ex01.txt");
				byte[] buff=new byte[5];
				FileInputStream fis=null;
				FileOutputStream fos=null;
				
				BufferedInputStream bis=null;
				BufferedOutputStream bos=null;
				
				try {
					fis=new FileInputStream(source);
					fos=new FileOutputStream(target);
					
					bis=new BufferedInputStream(fis);
					bos=new BufferedOutputStream(fos);
					
					int su=0;
					while(true){
						su=bis.read(buff);
						if(su==-1){break;}
						bos.write(buff, 0, su);
		//				bos.flush(); 버퍼에있는 데이터를 push
					}
		//			while(true){
		//				su=fis.read();
		//				if(su==-1){break;}
		//				fos.write(buff,0,su);
		//			}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						bos.close();
						bis.close();
						fos.close();
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("복사끝");
			}
		}
	 *
	 *
	 *
	 */
	public static void main(String[] args) {
		

	}

}
