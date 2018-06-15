class Ex01{

  public static void main(String[] args){//메서드

	int a=100;
	a=102;
	a=10;
	a=012;// 8진수
	System.out.println("8진수"+a);
	a=0xd;
	System.out.println("16진수"+a);
	a=0xa;
	System.out.println("16진수"+a);
	//변수의 선언 : 자료형 변수명;
	//초기화(최초 값의 대입) : 변수명=값;
	//수: 10진수 정수
	//byte
	//short
	//int
	//long
	//수: 실수
	//float
	//double
	double b1=1.0000000001;
	double b2=1.00000000002;
	double b3=b1+b2;
	System.out.println(b3);

  }

}