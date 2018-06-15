class Ex03{
  public static void main(String[] args){
	System.out.println("Ex03 run");

  }//main end

  public static void func01(){
	System.out.println("Ex03 func01 run");
  }

}//ex03 end


class Ex33{//2개의 클래스를 생성하면 컴파일 했을때 2개의 파일이 생긴다.
  public static void main(String[] args){
	System.out.println("ex33 run");
	Ex03.func01();
  }
}//ex33 end