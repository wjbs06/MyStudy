
public class day18 {

	
	public static void main(String[] args) {
		/*
		 * package com.bit.am;
			
			public class Ex02 {
			
				
				public static void main(String[] args) {
					StringBuffer msg1=new StringBuffer("Java");
					//추가
					StringBuffer msg2=msg1.append("Add");
					//삭제
					StringBuffer msg3=msg1.delete(3, 5);
					System.out.println("msg1:"+msg3);
					//수정
					StringBuffer msg0=new StringBuffer("abcedfg");
					StringBuffer msg4=msg0.replace(2, 4, "ba");
					System.out.println("msg0:"+msg0);
					//삽입
					StringBuffer msg5=new StringBuffer("abcdefg");
					msg5.insert(1, "s");
					System.out.println("msg5:"+msg5);
				}
			
			}

		 * 
		 * 
		 * 
		 * 
			package com.bit.am;
			
			import java.util.StringTokenizer;
			
			public class Ex06 {
			
				public static void main(String[] args) {
					String db="java web         db spring";
			//		String[] lec=db.split(",");
			//		for (int i = 0; i < lec.length; i++) {
			//			System.out.println(lec[i]);
			//		}
					
					StringTokenizer stz=new StringTokenizer(db," ");
					System.out.println(stz.countTokens());
					String[] st=new String[stz.countTokens()];
					int cnt=0;
					while(stz.hasMoreTokens()){
						st[cnt++]=stz.nextToken();
						System.out.println(st[cnt-1]);
					}
					
					
					
				}
			
			}
			
		 * 
		 * 
		 * 
		 * 
		 * 
		 * package com.bit.pm;
			
			import java.text.DateFormat;
			import java.util.Date;
			import java.util.Locale;
			
			public class Ex02 {
			
			
				public static void main(String[] args) {
					Date day=new Date();
					DateFormat df=DateFormat.getDateTimeInstance(DateFormat.FULL,0,Locale.KOREA);
					System.out.println(df.format(day));
					DateFormat df2=DateFormat.getDateTimeInstance(DateFormat.FULL,0, Locale.JAPAN);
					System.out.println(df2.format(day));	
				}
			
			}

		 * 
		 * 
		 * 
		 * 
		 * package com.bit.pm;
			
			import java.text.DateFormat;
			import java.text.DateFormatSymbols;
			import java.text.SimpleDateFormat;
			import java.util.Date;
			
			public class Ex03 {
			
				
				public static void main(String[] args) {
					
					String aPattern="YY/MM/dd hh:mm:ss";
					Date day=new Date();
					DateFormatSymbols dfs=new DateFormatSymbols();
					
					SimpleDateFormat sdf=new SimpleDateFormat(aPattern,dfs);
					System.out.println(sdf.format(day));
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
		 */

	}

}
