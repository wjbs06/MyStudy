class Ex07{

  public static void main(String[] args){

	//계산기
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.print("첫번째 수:");
	int a=sc.nextInt();
	System.out.print("두번째 수:");
	int b=sc.nextInt();
	System.out.print("1.더하기 2.빼기 3.곱하기 4.나누기");	
	int c=sc.nextInt();

	switch(c){
		case 1:
			plus(a,b);
		break;
		case 2:
			minus(a,b);
		break;
		case 3:
			multi(a,b);
		break;
		case 4:
			div(a,b);
		break;

	}//switch end

  }//main end

  public static void plus(int x,int y){
	System.out.println(x+"+"+y+"="+(x+y));
  }//plus end

  public static void minus(int x,int y){
	System.out.println(x+"-"+y+"="+(x-y));
  }//minus end

  public static void multi(int x,int y){
	System.out.println(x+"*"+y+"="+(x*y));
  }//multi end

  public static void div(int x,int y){
	System.out.println(x+"/"+y+"="+(x/y));
  }//div end

}//class end