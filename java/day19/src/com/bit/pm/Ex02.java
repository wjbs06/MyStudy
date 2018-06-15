package com.bit.pm;

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
