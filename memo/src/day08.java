
public class day08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 20180219
객체
메서드
멤버필드
생성자

package com.bit.day08;


class Bike{
	//객체의 기능 - 객체 특성
	public int nowSpeed;	
	public String color="노랑";
	public int maxSpeed=100;
	
	//객체의 기능 - 객체제어
	public int speedUp(int speed){
		if(nowSpeed+speed<=maxSpeed){
		nowSpeed+=speed;
		}
		System.out.println(color+"색 바이크의 현재속도는 "+nowSpeed+"km 입니다");
		return nowSpeed;
	}
	
	public int speedDown(int speed){
		if(nowSpeed-speed>=0){
		nowSpeed-=speed;
		}
		System.out.println(color+"색 바이크의 현재속도는 "+nowSpeed+"km 입니다");
		return nowSpeed;
	}
}


public class Ex01 {
	
	public static void main(String[] args) {

		Bike by=new Bike();
		by.speedUp(10);
		by.speedUp(20);
		by.speedUp(30);
		by.speedDown(40);
		
		System.out.println("새 bike");
		by=new Bike();
		by.color="파랑";
		by.speedUp(10);
		by.speedUp(20);
		by.speedUp(30);
		
		
	
	}

}package com.bit.day08;

public class Ex02 {
	/*
	 * 생성자
	 * return 값이 없다.(void 없음)
	 * 이름 고정(class 이름)
	 * 생성자는 기본적으로 생략
	 * 생성자의 대표적기능 - 필드의 초기화
	 * 오버로드 기능 - 메서드, 생성자
	 *
	int sum;
	
	public Ex02(int a){
		sum=a;
		System.out.println("생성자 발동"+sum);
	}
	
	public Ex02(String msg,int a){
		sum=a;
		System.out.println("생성자 발동"+sum+msg);
	}
	
	public static void main(String[] args) {
		Ex02 me=new Ex02("인자",10);
		me=new Ex02(10);
	}

}



package com.bit.day08;

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
		Car car1=new Car(100);
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



******생성자,필드,메서드**********


접근제한자


package com.bit.day08;

public class Ex09 {
	//필드에 있는 변수 전역변수
	//static : 클래스변수, static 변수
	//non-static : 멤버필드, non-static 변수
	
	public Ex09(){
		
	}
	String msg;
	int sum=100;
	static int sum2=1000;
	public static void main(String[] args) {
		//내부의 변수는 지역변수
		//Ex09 me=null;//변수 선언 초기값은 null
		Ex09 me=new Ex09(); //초기화

		System.out.println(me);
		System.out.println(me.msg);
		
		System.out.println(me.sum);
		me.func01(10);
		System.out.println(me.sum);
		func02();
		System.out.println(me.sum2);
		
		
	}

	//메서드 - 함수
	void func01(int sum1){
		sum=sum1;
//		return;
	}
	
	static void func02(){
		sum2=1111;
	}
	
}
//this 는 static 에서 사용불가.
//static 은 앞에 클래스명 사용.


------------------------------------------------------
배열



/*
		 * 배열
		 * 자료형[] 변수명 = new 자료형[개수];
		 * 자료형[] 변수명; 배열의 선언
		 * 변수명=new 자료형[개수]; 초기화
		 * 변수명[인덱스]
		 * 0부터 시작, 연속된 숫자
		 * 초기화
		 * 변수명[인덱스]=초기값;
		 */




		

	}

}
