package com.bit.day08.am;

class Car{
	
	int speed;
	int max;
	String color;
	
	public Car(int a){
		speed=0;
		max=a;
		color="검정색";
	}
	
	public Car(int a,String b){
		speed=0;
		max=a;
		color=b;
	}
	
	public void speedUp(int a){
		if(speed+a<=max){
			speed+=a;	
		} else {speed=max;}
		
	}
	
	public void speedDown(int a){
		speed-=a;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Car car1=new Car(50);
		car1.speedUp(10);
		System.out.println(car1.color+"의 현재 속도는 "+car1.speed);
		car1.speedUp(20);
		System.out.println(car1.color+"의 현재 속도는 "+car1.speed);
		car1.speedUp(30);
		System.out.println(car1.color+"의 현재 속도는 "+car1.speed);
		car1.speedUp(50);
		System.out.println(car1.color+"의 현재 속도는 "+car1.speed);
		
		car1=new Car(150,"빨강색");
		car1.speedUp(10);
		System.out.println(car1.color+"의 현재 속도는 "+car1.speed);
		car1.speedUp(20);
		System.out.println(car1.color+"의 현재 속도는 "+car1.speed);
		car1.speedUp(30);
		System.out.println(car1.color+"의 현재 속도는 "+car1.speed);
		car1.speedUp(120);
		System.out.println(car1.color+"의 현재 속도는 "+car1.speed);
		

	}

}
