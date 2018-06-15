class Ex03{

  public static void main(String[] args){
		
	int a=65;
	char b=(char)a;
	System.out.println(b);
	int aa=44032;
	char ab=(char)aa;
	System.out.println(ab);
	
	float ba=3.14f;
	double bb=ba;
	System.out.println(bb); //실수는 근사값으로 값이 정확히 나오지 않는다.

	double ca=3.14;
	float cb=(float)ca;
	System.out.println(cb);

	double da=3.14;
	int db=(int)da;
	System.out.println(db); //강제 형변환으로 수수점 손실

	long ea=1234L;
	float eb=(float)ea;
	System.out.println(eb);

//	long ea=1234L;
//	float eb=(float)ea;
//	System.out.println(eb);

  }

}