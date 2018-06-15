class Ex02{

  public static void main(String[] args){

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

	long g=214654654654L;
	System.out.println(g);

	float h=214654654654F;
	System.out.println(h);

	char aa='A'; //char aa=''; 오류 비어있는 문자는 허용X
	String ab=""; //String ab=""; 허용 문자열은 허용
	System.out.println(aa+1-1);
	char ac='\n'; 	
	System.out.println(ac+1-1);
	char ad='\uAC00'; 	
	System.out.println(ad+1-1);
	int ae='\uAC00'; 	
	System.out.println(ae);
	
	byte ba=1;
	short bb=ba;
	int bc=bb;
	long bd=bc; 	
	System.out.println(bd);

	long ca=128L;
	int cb=(int)ca;
	short cc=(short)cb;
	byte cd=(byte)cc;
	System.out.println(cd);
		

  }

}