package com.bit.pm;

import java.lang.annotation.ElementType;

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

class Box<T>{//제네릭 - T (Type) E(element) K(key) V(value)
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
