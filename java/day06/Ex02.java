class Ex22{
  public static void func01(){
	System.out.println("22클래스의 func01 run");
  }

  public void func02(){
	System.out.println("22클래스의 non-static method run");
  }
} //22class end


class Ex02{

  public static void main(String[] args){
	int su=func01();	
	System.out.println(su+"-----------------");
	//Ex02.func01(); 원래 메서드도 앞에 클래스명을 생략하고 있다.	
	//동일한 클래스 안에 있기 때문에 생략
	Ex02 me = new Ex02();//참조변수 = 객체생성
	su=me.func02(); // 참조변수로 접근
	System.out.println("func02의 "+su);

	Ex22.func01();

	Ex22 me2=new Ex22();
	me2.func02();
	/*
	Ex02 me2;참조변수
	me2=new Ex02(); 객체 생성
	me2.func02();
	*/

  }//main end

  public static int func01(){
	System.out.println("static method run");
	return 0;
  }//func01 end

  public int func02(){//static이 빠짐으로 직접실행 불가,return은 전과같다.
	System.out.println("non-static method run..");
	return 10;
  }//fucn02 end

}//02class end