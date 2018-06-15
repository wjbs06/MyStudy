
public class day16 {


	public static void main(String[] args) {
		/* list, set, stack ,Queue
		 * 
				package com.bit.am;
			
			import java.util.ArrayList;
			import java.util.LinkedList;
			import java.util.List;
			import java.util.Vector;
			
			public class Ex01 {
			
			
				public static void main(String[] args) {
					//list 구조 (CRUD작업)
					//- 순서를 갖고
					//- 중복허용
					List list1=new ArrayList();
					list1 = new LinkedList();
					list1 = new Vector();//vector 는 add 가 아니라 엘리먼트가 맞다.
					list1.add(1111);
					list1.add(2222);
					list1.add(3333);
					list1.add(4444);
					list1.add(5555);//추가
					list1.set(2,3000);//수정
					list1.remove(1);//삭제
					
					for (int i = 0; i < list1.size(); i++) {
						System.out.print(list1.get(i)+" ");
					}//보기
					System.out.println("------------------------------");
			
				}
			
			}

		 * 
		 * 
		 * 
		 * package com.bit.am;
			
			import java.util.Stack;
			import java.util.Vector;
			
			public class Ex03 {
			
				
				public static void main(String[] args) {
					//스택(LIFO) - a last in first out
					//순서 O - 먼저 in 나중 out
					//중복허용
					Stack stack01 = new Stack();
			
					stack01.add(11);
					stack01.add(22);
					stack01.add(33);
					stack01.add(44);
					stack01.add(22);
					stack01.add(33);
					System.out.println("stack size: "+stack01.size());
					for (int i = 0; i < stack01.size(); i++) {
						System.out.println(stack01.get(i));
					}
					System.out.println("--------------------------");
					stack01.push(11);//stack 입력
					stack01.push(22);
					stack01.push(33);
					stack01.push(22);
					stack01.push(33);
					
					System.out.println(stack01.pop());//stack 출력
					System.out.println("현재까지 마지막은"+stack01.peek());
					System.out.println(stack01.pop());
					System.out.println(stack01.pop());
					System.out.println(stack01.pop());
					System.out.println(stack01.pop());
					System.out.println("--------------------------");
					Vector stack02 = new Stack();
					stack02.add(11);
					stack02.add(22);
					stack02.add(33);
					stack02.add(44);
					stack02.add(22);
					stack02.add(33);
					System.out.println("stack size: "+stack02.size());
					System.out.println(stack02.remove(stack02.size()-1));
					System.out.println(stack02.remove(stack02.size()-1));
					System.out.println(stack02.remove(stack02.size()-1));
					System.out.println(stack02.remove(stack02.size()-1));
					System.out.println(stack02.remove(stack02.size()-1));
					System.out.println(stack02.lastElement());
				}
			
			}

		 * 
		 * 
		 * 
		 * 
		 * package com.bit.am;
			
			import java.util.Iterator;
			import java.util.Set;
			import java.util.HashSet;
			
			public class Ex02 {
			
				
				public static void main(String[] args) {
					//set
					//-순서를 갖지 않고
					//-중복허용X
					Set set01=new HashSet();
					set01.add(1111);//입력
					set01.add(2222);//입력
					set01.add(3333);//입력
					set01.add(4444);//입력
					set01.add(5555);//입력
			//		set01. 수정이 있을 수 없다. 결국 삭제후 새로 입력과 같다.
					set01.remove(3333);//삭제
					
					System.out.println("set size:"+set01.size());
					Iterator ite= set01.iterator();//보기
					while(ite.hasNext()){
						System.out.print(ite.next()+" ");
					}
					System.out.println("\n-------------------------");	
				}
			
			}

		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * package com.bit.am;
			
			import java.util.LinkedList;
			
			public class Ex04 {
			
			
				public static void main(String[] args) {
					// 큐(FIFO) - a first in first out;
					// 순서 o - 먼저 in 먼저 out;
					// 중복 ㅇ
					java.util.Queue que=null;
					que=new LinkedList();
					que.offer(111);
					que.offer(22);
					que.offer(33);
					que.offer(55);
					que.offer(22);
					que.offer(33);
					
					System.out.println("Queue size: "+que.size());
					System.out.println("다음대기자: "+que.peek());
					System.out.println(que.poll());
					System.out.println(que.poll());
					System.out.println("다음대기자: "+que.peek());
					System.out.println(que.poll());
					System.out.println(que.poll());
					System.out.println(que.poll());
					System.out.println(que.poll());

				}
			}

		 * 
		 * 
		 * 
		 * 
		 * 
		 * package com.bit.pm;
			
			abstract class Pen{
				protected String color;
					
				Pen(String color){
					this.color=color;
				}
				
			//	public void draw(){
			//		System.out.println(color+" 선을 긋는다.");
			//	}
				
				public abstract void draw();
			}
			
			class Ballpen extends Pen{
				
				Ballpen(String color){
					super(color);
				}
				
				public void draw(){
					System.out.println(color+" 진한 선을 긋다");
				}
			}
			
			class Pencil extends Pen{
				
				Pencil(String color){
					super(color);
				}
				
				public void draw(){
					System.out.println(color+" 희미한 선을 긋다");
				}
			}
			
			//class Box{
			//	Object pen;
			//	
			//	public void push(Object pen){
			//		this.pen=pen;
			//	}
			//	
			//	public Object pull(){
			//		return pen;
			//	}
			//}
			
			class Box<T>{//제네릭
				T pen;
				
				public void push(T pen){
					this.pen=pen;
				}
				
				public T pull(){
					return pen;
				}
			}
			public class Ex01 {
			
				//객체 생성시점에 제한하는게 generic
				public static void main(String[] args) {
			//		Pen pen=new Pencil("검정색");
			//		Pen pen3=new Ballpen("검정색");
			//		Box box=new Box();
			//		Pencil pencil=new Pencil("검정");
			//		box.push(pencil);
			//		
			//		Pencil pencil2=box.pull();
			//		pencil2.draw();
					//////////////////////////
			//		Box box=new Box();
			//		Ballpen ball=new Ballpen("빨강");
			//		box.push(ball);
			//		
			//		Pen pen=(Pen)box.pull();
			//		pen.draw();
			//		/////////////////////////
			//		Box box=new Box();
			//		box.push(1111);
			//		System.out.println(box.pull());
					//////////////////////////////
					Box<Pen> box=new Box<Pen>();
			//		Ballpen ball=new Ballpen("빨강");
					Pencil ball=new Pencil("검정");
					box.push(ball);
					
					Pen pen=box.pull();
					pen.draw();
					
			
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

	}

}
