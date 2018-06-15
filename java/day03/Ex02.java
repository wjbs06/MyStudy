class Ex02{

  public static void main(String[] args){

	/*아래는 출력할 내용*/
	System.out.println("test");

		// 연산자
		// 증감연산자 : ++,--
		// 산술연사자 : +,-,*,/,%
		// 비교연산자 : >,>=,==,!=,<=,<
		// 논리연산자 : &&,||, !
		// 대입연산자 : =,+=,-=

	int a; // 10진수 정수를 담을 수 있는 이름 a라는 메모리 공간 확보
	a=100; // int형 100이라는 값을 메모리공간 a에 대입

	a+=1; //a=a+1
	a-=1; //a=a-1
	a*=1; //a=a*1
	a/=1; //a=a/1	
	a%=1; //a=a%1
	a+=2+3*2+3; //a=a+(2+3*2+3)
	System.out.println(a);


  } // main end

} // class end