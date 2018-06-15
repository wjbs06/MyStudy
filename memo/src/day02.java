
public class day02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 20180207

자바에서 \t 탭 \n 줄바꿈

문자 'a'; 한글자만 사용가능

문자의 처리가 불가능 약속된 아스키코드로 변환

컴파일 기법 자바
인터프리트기법 웹

객체지향
상속, 다형성, 캡슐화

jvm 을 통한 운영체제 독립

클래스는 첫글자 대문자
변수명은 첫글자 소문자

대소문자 구별됨

실수 원칙적으로 불가능

또한 실수의 연산은 정확한 값이 아니다. 실수의 연산은 피하는게 좋다.

변수를 선언하면 반드시 초기화를 해야한다.

형변환
작은것을 큰공간에 넣는것
큰값을 작은공간에 넣는것(강제형변환을 해야되며 기본전제가 필요하다)


패스경로
C:\Program Files\Java\jdk1.8.0_162\bin

set 으로 환경변수목록봄 그중에 path에 경로를 추가함.

자바의 홈 디렉토리
	
이렇게 환경변수에 할당함.

나중에 path에 추가할때
path=%path%;%JAVA_HOME%\bin


	byte a=100;
	byte b=27;
	byte d=127;
	d++;
	int c=a+b;//byte와 byte로 더하면서 int로 형변환이 되었고 byte로 넣으려니
		   //오류가 남.
	System.out.println(a+b);
	System.out.println("c를 출력하면 오류가나지만 a+b는 int형으로 출력");
	System.out.println(d);
	
	byte f=126;
	//a=a+1; = a++; 둘은 같은 표현이다.  
	System.out.println(f);
	f++;
	System.out.println(f);
	f++;	
	System.out.println(f);
	f++;	
	System.out.println(f);

byte에서 127 더하면 -128이 됨. int와 byte 를 더하면 큰 자료형이 됨.

	char aa='A'; //char aa=''; 오류 비어있는 문자는 허용X
	String ab=""; //String ab=""; 허용 문자열은 허용

	float ba=3.14f;
	double bb=ba;
	System.out.println(bb); //실수는 근사값으로 값이 정확히 나오지 않는다.


*자료형 타입에서 형변환할때는 크기가 아니라 표현범위에 따라 강제형변환이나 변환한다.

		 */

	}

}
