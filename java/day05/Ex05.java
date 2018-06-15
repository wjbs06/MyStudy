class Ex05{

  public static void main(String[] args){
	System.out.println("main start");
	//자바의 기본문법
	//자바의 기본 요소
	//메서드
	int su=func02();
	func01(100,1);
	System.out.println(su);
	System.out.println("main end");
  }//main end
/*메서드 사용법
public static [자료형||void] 메서드이름(인자){실행문;}



*/
  public static void func01(int b,int c){
	System.out.println(b+c+" func01 run..");
	//return; 생략된다.
  }

  public static int func02(){
	int x=1234;
	int y=4321;
	int z=x+y;
	return z;
  }


}//class end