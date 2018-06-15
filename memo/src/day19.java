


public class day19 {

	/**
	 * 커널
	 * 
	 * os는 프로세스 단위로 실행
	 * 프로그램 수= 프로세스 수
	 * 루프를 돌아 잠깐씩 실행
	 * 거기에도 우선순위가 있음
	 * 
	 * 스레드를 하는 방법
	 * 1.THread를 상속받아 실행
	 * 
	 * package com.bit.am;
		//스레드를 상속받으면 객체를 3번찍어야 한다.
		class Lec02 extends Thread{
			public void run() {
				System.out.println("스레드 start");
				int sum=0;
				for (int i = 0; i < 1000000000; i++) {
					sum+=i;
				}
				System.out.println("스레드 end");
			}
		}
		public class Ex01 {
		
			
			public static void main(String[] args) {
				System.out.println("main start");
				Lec02 lec=new Lec02();
				lec.start();
				
				System.out.println("main end");
			}
		
		}

	 * 
	 * 
	 * 2.Runnable 인터페이스를 상속 받아 스레드 객체를 생성하여 실행
	 * 
	 * package com.bit.am;

		class Lec03 implements Runnable{
		
			public void run() {
				System.out.println("스레드로 실행시작");
				for (int i = 0; i < 100; i++) {
					System.out.print(i);
				}
				System.out.println();
				System.out.println("스레드로 실행종료");
			}
		}
		public class Ex03 {
		
			public static void main(String[] args) {
				System.out.println("main start");
				Lec03 lec01=new Lec03();
				Thread thr01=new Thread(lec01);
				thr01.start();
				System.out.println("main end");
			}
		
		}

	 * 
	 * 3.Runnable 객체를 생성하여 실행
	 * 
	 * package com.bit.am;
			
		public class Ex04 {
		
			public static void main(String[] args) {
				System.out.println("main start");
				Runnable runner=new Runnable() {
					
					public void run() {
						System.out.println("시작");
						System.out.println("종료");				
					}
				};
				Thread thr=new Thread(runner);
				thr.start();
				Thread thr1=new Thread(runner);
				thr1.start();
				
				System.out.println("main end");
			}
		}

	 * 
	 * 
	 * 
	 * package com.bit.am;
		
		public class Ex05 extends Thread{
			public Ex05(String name){
				setName(name);
			}
			public static void main(String[] args) {
				Thread thr=Thread.currentThread();
				System.out.println(thr.getName()+" start");
				Ex05 me1=new Ex05("첫번째");
				Ex05 me2=new Ex05("두번째");
				Ex05 me3=new Ex05("세번째");
				me1.start();
				me2.start();
				me3.start();
				System.out.println(thr.getName()+" end");
			}
		
			public void run(){
				Thread thr=currentThread();
				String name=thr.getName();
				System.out.println(name+"스레드 시작");
				System.out.println(name+"스레드 종료");
			}
		}

	 * 
	 * 
	 * 
	 * 
	 * package com.bit.am;
		
		public class Ex06 implements Runnable{
		
			//Runnable 인터페이스르 상속하면 1개의 객체만 만들면 가능하다
			public static void main(String[] args) {
				System.out.println("start");
				Ex06 me = new Ex06();
				Thread thr1=new Thread(me,"첫번째");
				Thread thr2=new Thread(me,"첫번째");
				Thread thr3=new Thread(me,"첫번째");
				thr1.start();
				thr2.start();
				thr3.start();
				System.out.println("end");
			}
			public void run(){
				Thread thr=Thread.currentThread();
				System.out.println(thr.getName()+"시작");
				System.out.println(thr.getName()+"종료");
			}
		}

	 * 
	 * 
	 * 
	 * 
	 * package com.bit.am;
		
		import java.util.Date;
		
		public class Ex07 extends Thread{
				// 스레드 제어
			 
			public static void main(String[] args) {
				Ex07 me=new Ex07();
		//		me.run();
		//		me.time();
				for (int i = 0; i < 10; i++) {
					Date d= new Date();
					int year=d.getYear()+1900;
					int month=d.getMonth()+1;
					int day=d.getDate();
					int h=d.getHours();
					int m=d.getMinutes();
					int s=d.getSeconds();
					System.out.println(year+"년"+month+"월"+day+"일"+h+"시"+m+"분"+s+"초");
					try {
						Thread.sleep(1000);//sleep(1000) 인자 1/1000 초
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}	
				
			}
			
			public void time(){
				for (int i = 0; i < 10; i++) {
					Date d= new Date();
					int year=d.getYear()+1900;
					int month=d.getMonth()+1;
					int day=d.getDate();
					int h=d.getHours();
					int m=d.getMinutes();
					int s=d.getSeconds();
					System.out.println(year+"년"+month+"월"+day+"일"+h+"시"+m+"분"+s+"초");
					try {
						Thread.sleep(1000);//인자 1/1000 초
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}	
			}
			
			public void run(){
				int dan=9;
				for (int i = 1; i < 10; i++) {
					System.out.println(dan+"X"+i+"="+(dan*i));
					try {
						sleep(1000);				
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		
		}

	 * 
	 * 
	 * 
	 * package com.bit.pm;
		
		public class Ex01 {
			private int serial=123456789;
			
			public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException{
				Object obj=new Object();
				Ex01 me=new Ex01();
				Ex01 me2=new Ex01();
		//		Object obj2=me.clone();
				System.out.println(me);
				System.out.println(me==me2);
				System.out.println(me.equals(me2));	
				
				Class cl1=obj.getClass();
				Class cl2=obj.getClass();
				System.out.println(cl1.getCanonicalName());
				System.out.println(cl1.getName());
				//java.lang.Object
				//com.bit.pm.Ex01
				Class temp=Class.forName("java.lang.Object");
				System.out.println(temp.getName());
				Object obj1=temp.newInstance();
				System.out.println(obj1.hashCode());
				Class temp1=Class.forName("com.bit.pm.Ex01");
				System.out.println(temp1.getName());
				Object obj2=temp1.newInstance();
				Ex01 me3=(Ex01) obj2;
				System.out.println(me3.serial);
			}
			public String toString() {
				return this.serial+"";
			}
			public boolean equals(Object obj) {
		//		return this.serial==((Ex01)obj).serial;
		//	}
				return this.hashCode()==obj.hashCode();
			}
			public int hashCode() {
				return this.serial;
			}
		}

	 * 
	 * 
	 * 
	 * package com.bit.pm;

import java.util.ArrayList;
import java.util.Scanner;
interface Lec{
	public void print();
}
class Lec01 implements Lec{
	public void print(){
		System.out.println("Lec01 run");
	}
}
class Lec02 implements Lec{
	public void print(){
		System.out.println("Lec02 run");
	}
}
class Lec03 implements Lec{

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("새로운기능");
	}
	
}
public class Ex02 {

	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ArrayList<String> list=new ArrayList<String>();
		list.add("com.bit.pm.Lec01");
		list.add("com.bit.pm.Lec02");
		list.add(Lec03.class.getName());
		
		Class<Lec03> cl=Lec03.class;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("0.Lec01 1.Lec02>");
		
		Lec obj=null;
		String msg=null;
		switch (sc.nextInt()) {
		case 0:
			msg=list.get(0);
			break;
		case 1:
			msg=list.get(1);
			break;
		case 2:
			msg=list.get(2);
			break;
		}
		obj=(Lec)Class.forName(msg).newInstance();
		
		obj.print();
			
	}

}

	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
