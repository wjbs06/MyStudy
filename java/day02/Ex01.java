class Ex01{

  public static void main(String[] args){

    System.out.println("\n\n\ntest");

	double a;
	a=3.14;
	int b;
	b=20;
	double c;
	c=a+b;

	char d;
	d='a';
	char e;
	e='b';
	int g=d+e; //문자의 처리가 불가능해 숫자로 받음
	
	String msg;
	msg="문자열";
	
	String msg2;
	msg2=msg+c;
	System.out.println(msg);
	System.out.println(d);
	System.out.println(g);	
	System.out.println(msg2);
	System.out.println(msg+c);    

  }

}	