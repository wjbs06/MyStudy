


public class day17 {


	public static void main(String[] args) {
		/*
		 * 
		 * 예외처리
		 * 상속-추상 인터페이스
		 * 내부클래스
		 * 자료구조
		 * 제네릭
		 * 과 같은 단어들을 알아야한다
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 예외처리
		 * 
				package com.bit.am;
			
			import java.io.FileNotFoundException;
			import java.io.FileOutputStream;
			import java.io.PrintStream;
			import java.nio.file.FileAlreadyExistsException;
			
			public class Ex03 {
			
				public static void main(String[] args) throws FileNotFoundException {
					try {
			//			func01();
						throw new ArithmeticException();
					} catch (ArithmeticException ex) {
						System.out.println("예외처리");
			//			ex.printStackTrace();
			//			System.out.println(">>>"+ex.toString());
			//			System.out.println(">>"+ex.getMessage());
						
			//			Class e=ex.getClass();
			//			System.out.println(">"+e.getName());
			//			StackTraceElement[] errs= ex.getStackTrace();
			//			System.out.println(errs.length);
			//			System.out.println(errs.toString());
			//			ex.printStackTrace(new PrintStream("log.txt"));
					}
					
				}
				
				public static void func01()throws ArithmeticException{
					int a=5/0;
				}
			
			}

		 * 
		 * 
		 * 
		 * 
		 * 
		 * package com.bit.am;
			
			interface Interf{
				void func();
			}
			
			public class Ex06 {
				static int su1=111;
				int su2=222;
				Interf me4=new Interf(){
					public void func(){}
				};
				
				// static (내부)클래스
				static class Lec02{
					static void func02_1(){
						System.out.println(su1);
					}
					void func02_2(){
						System.out.println(su1);
					}
				}
			//	static Interf lec12=new Interf(){
			//		
			//		public void func(){
			//			
			//		}
			//	};
				// 멤버클래스
				class Lec01{
					void func01_2(){
						System.out.println(su1);
					}
					
					Lec02 me1=new Lec02();
					Lec02 me2=new Lec02();
					final int su=100;
				}
				
				public Interf func01(final int su){
					//로컬클래스의 밖에 있는 변수접근
					// ~1.7 final
					// 1.8~
					Lec02 me1=new Lec02();
					Lec02 me2=new Lec02();
					
					//로컬클래스
					class Lec03 implements Interf{
						public void func(){}
					}
			//		Lec03 me3=new Lec03();
			//		Interf me3=new Interf(){
			//			public void func(){}
			//		}
					return new Interf(){
						public void func(){};
					};
			//		return me3;
				}
				
				public static void main(String[] args) {
					
			
				}
			
			}

		 * 
		 * 
		 * 
		 * 
		 * 
		 * package com.bit.am;
			
			import java.util.Enumeration;
			import java.util.Iterator;
			import java.util.Vector;
			
			public class Ex07 {
			
				
				public static void main(String[] args) {
					//1.2 컬렉션프레임워크 추가
					//1.5 제네릭 추가
					Vector<Integer> vec= new Vector<Integer>();
			//		vec.addElement(new Integer(111));
			//		vec.addElement(new Integer(222));
			//		vec.addElement(new Integer(333));
			//		vec.addElement(new Integer(444));
					vec.addElement(111);
					vec.addElement(222);
					vec.addElement(333);
					vec.add(444);
					vec.add(555);
					
					Enumeration<Integer> eles=vec.elements();
					while(eles.hasMoreElements()){
						Integer item=eles.nextElement();
						System.out.println(item);
					}
					System.out.println("-----------------------------------");
					System.out.println(vec.firstElement());
					System.out.println(vec.lastElement());
					
					Iterator<Integer> ite=vec.iterator();
					while(ite.hasNext()){
						System.out.println(ite.next());
					}
				}
			
			}

		 * 
		 * 
		 * 
		 * 
		 * 
		 * package com.bit.am;
			
			import java.util.LinkedList;
			import java.util.Queue;
			import java.util.Stack;
			
			public class Ex08 {
			
				public static void main(String[] args) {
					
					Stack<Integer> stack=new Stack<Integer>();
					stack.push(111);
					stack.push(222);
					stack.push(333);
					stack.push(444);
					while(!stack.isEmpty()){			
						System.out.println(stack.pop());
					}
					
					
					Queue<Integer> que=new LinkedList<Integer>();
					que.offer(111);
					que.offer(222);
					que.offer(333);
					que.offer(444);
					while(!que.isEmpty()){
						System.out.println(que.poll());
					}
			
					
				}
			
			}

		 * 
		 * 
		 * 
		 * package com.bit.am;
			
			import java.util.ArrayList;
			import java.util.LinkedList;
			import java.util.List;
			
			public class Ex09 {
			
					//arraylist 가 속도가 빠르다.
				public static void main(String[] args) {
					List<Integer> list01=new ArrayList<Integer>();
					list01.add(111);
					list01.add(222);
					list01.add(333);
					list01.add(444);
					for (int i = 0; i < list01.size(); i++) {
						System.out.println(list01.get(i));
					}
					for (int i = 0; i < 1000000; i++) {
						list01.add(i);
					}
					System.out.println("입력시작");
					for (int i = 0; i < 1000000; i++) {
						list01.get(i);
					}
					System.out.println("입력끝");
					System.out.println("-----------------------------------");
			
					List<Integer> list02 = new LinkedList<Integer>();
					list02.add(111);
					list02.add(222);
					list02.add(333);
					list02.add(444);
					for (int i = 0; i < list02.size(); i++) {
						System.out.println(list02.get(i));
					}
					for (int i = 0; i < 1000000; i++) {
						list02.add(i);
					}
					System.out.println("입력시작");
					for (int i = 0; i < 1000000; i++) {
						list02.get(i);
					}
					System.out.println("입력끝");
				}
			
			}

		 * 
		 * 
		 * 
		 * 
		 * 
		 * package com.bit.pm;
			
			import java.util.HashSet;
			import java.util.Iterator;
			import java.util.Set;
			import java.util.TreeSet;
			
			class Lec01 implements Comparable<Lec01>{
				static int num;
				int su;
			
				public Lec01(){
					num++;
					su=num;
				}
				
				public int compareTo(Lec01 o){
					return this.su-o.su;
				}
			}
			
			public class Ex01 {
			
			
				public static void main(String[] args) {
					//집합
					Set<Integer> set1=new HashSet<Integer>();
					set1.add(111);
					set1.add(222);
					set1.add(333);
					set1.add(444);
					set1.add(555);
					Iterator<Integer> ite1=set1.iterator();
					while(ite1.hasNext()){
						Integer val=ite1.next();
						System.out.println(val);
					}	
						
					Set<Character> set2=new TreeSet<Character>();
					set2.add('a');
					set2.add('b');
					set2.add('c');
					set2.add('d');
					Iterator<Character> ite2=set2.iterator();
					while(ite2.hasNext()){
						Character val=ite2.next();
						System.out.println(val);
					}	
					
					Set<Lec01> set3=new TreeSet<Lec01>();
					set3.add(new Lec01());
					set3.add(new Lec01());
					Lec01 lec=new Lec01();
					set3.add(lec);
					set3.add(new Lec01());
					set3.add(lec);
					Iterator<Lec01> ite3=set3.iterator();
					while(ite3.hasNext()){
						Lec01 val=ite3.next();
						System.out.println(val);
					}	
					
				}
			}

		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * package com.bit.pm;
			
			import java.util.HashMap;
			import java.util.Iterator;
			import java.util.Map;
			import java.util.Set;
			
			class Lec03{}
			public class Ex03 {
			
				
				public static void main(String[] args) {
					Map<String, Integer> map=new HashMap<String, Integer>();
					map.put("일", 1);
					map.put("이", 2);
					map.put("삼", 3);
					map.put("일", 4);
					map.put("오", 5);
					
					Set<String> keys=map.keySet();
					Iterator<String> ite=keys.iterator();
					while(ite.hasNext()){
						String key=ite.next();
						System.out.println(key+" "+map.get(key));
						
					}
					
					
				}
			
			}

		 * 
		 * 
		 * 
		 * 
		 * package com.bit.pm;
			
			class Lec04<T>{
				T obj;
				void func01(T obj){
					this.obj=obj;
				}
				T func02(){
					return obj;
				}
			}
			
			public class Ex04 {
			
				public static void main(String[] args) {
					//제네릭
					//Lec04<String> lec=new Lec04<String>(); 제대로 작성
					//Lec04<String> lec2=new Lec04(); 나중에 캐스팅할수 있음
					//
					Lec04 temp=new Lec04();
					
					Lec04<String> lec=temp;
					Lec04<Integer> lec2=(Lec04<Integer>)((Object)lec);
					lec2.func01(111111);
					
					Integer obj=lec2.func02();
					System.out.println(obj);
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

	}

}
