package com.bit.am;


class Car{
	// 
	void go(){
		System.out.println("달린다");
	}
	
	void stop(){
		System.out.println("멈춘다");
	}
}


class Tico extends Car{
	// 부모 - 객체의 상위적 개념
	void go(){
		super.go();
		System.out.println("최대100km로");
	}
}

class TicoTurbo extends Tico {
	// 자식 - 부모에서 보다 구체화
	void go(){
		super.go();
		System.out.println("달리던 차를 조금 더 가속이 빠르게");
	}
}

class Sonata extends Car{
	void go(){
		super.go();
		System.out.println("최대150km");
	}
}

public class Ex06 {

	//TicoTurbo 가 Tico 를 상속받아 오버라이드로 속도 수정
	public static void main(String[] args) {
		Car myCar=new Sonata();//new Tico TicoTurbo 이들을 통해 속도에 변화를 줄수 있다.
		myCar.go();
		myCar.stop();
		
	}

}
