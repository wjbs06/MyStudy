class Ex01{

  public static void main(String[] args){

	// 메모리 사이즈가 아니라 표현범위에 따른
	// 자동 형변환
		// byte -> short -> char -> int -> long -> float -> double
	// 강제 형변환(손실감수)
		// (자료형)상수 또는 변수
	// 숫자
		// 정수
			// byte < short < int < long
		// 실수
			// float < double

	// 문자
		// char
		
	// 불린
		// boolean

		// 연산자
		// 증감연산자 : ++,--
		// 산술연사자 : +,-,*,/,%
		// 비교연산자 : >,>=,==,!=,<=,<
		// 논리연산자 : &&,||, !

	int a=100;
	System.out.println();
	System.out.println(a==100);
	System.out.println(a!=101);
	System.out.println("-------------------------");
	System.out.println(true && true); // true
	System.out.println(true && false); // false
	System.out.println(false && true); // false 
	System.out.println(false && false); // false
	System.out.println(true || true); // true
	System.out.println(true || false); // true
	System.out.println(false || true); // true 
	System.out.println(false || false); // false
	System.out.println(!false); 
	System.out.println("-------------------------");
	System.out.println(a++);
	System.out.println(a);	
	System.out.println("-------------------------");
	System.out.println();

  }

}