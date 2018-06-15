package com.bit.am;

import java.util.Scanner;


class Machine{
	
	void on(){
		System.out.println("켜다");
	}
	
	void off(){
		System.out.println("끄다");
	}
}

class Tv extends Machine{
	void on(){
		System.out.println("Tv를 켜다");
	}
	void off(){
		System.out.println("Tv를 끄다");
	}
}

class Radio extends Machine{
	void on(){
		System.out.println("Radio를 켜다");
	}
	void off(){
		System.out.println("Radio를 끄다");
	}
}

class Aircon extends Machine{
	void on(){
		System.out.println("Aircon를 켜다");
	}
	void off(){
		System.out.println("Aircon를 끄다");
	}
}

public class Ex07{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Machine remote=null;
		System.out.println("1.TV를 향해 2.라디오를 향해 3.에어컨을 향해>");
		int input=sc.nextInt();
		if(input==1){
			remote=new Tv();
		} else if(input==2){
			remote=new Radio();
		} else if(input==3){
			remote=new Aircon();
		}
		remote.on();
		remote.off();
		
	}

}
