
public class day06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 20180213

void자리에 int면 return값을 받아서 사용할 수 있다.

class Ex22{
  public static void func01(){
	System.out.println("22클래스의 func01 run");
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
	/*
	Ex02 me2;참조변수
	me2=new Ex02(); 객체 생성
	me2.func02();
	*

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



메서드화를 통해 분화를 시키면 다른 프로젝트에서도 사용가능

소스코드를 가져다 쓰는것이 아니라 클래스 참조변수를 통해 재사용



java파일안 2개의 클래스가 있고 컴파일을 하면 class파일이 2개가 생긴다.

---------------------------------------------------------------------

-----------------
클래스(static,core,상수...)
-----------------
스택
-----------------
힙(객체)
-----------------
Game me;
me=new Game() 객체를 만들면 힙 영역에 생김.

not-static을 사용하기 위해서는 최적화가 필요

jvm은 객체가 있어도 사용하지 않는다면 없애버림.
jvm이 메모리관리를 하는 영역은 힙영역으로 객체의 생성과 삭제를 관리


not-static과 static
static은 초기 시작시 속도가 느리고 이후에는 빠르다. 항상 같은 메모리를 가지고 있음. 



/*
static -> static : (클래스명).메서드명();
static -> non-static : 객체 생성 후 참조변수를 통해 접근
                       ex)참조변수=객체생성; 참조변수.메서드();
non-static -> satic : (클래스명).메서드명();
non-static -> non-static : 객체 생성 후 참조변수를 통해 접근
                       ex)참조변수=객체생성; 참조변수.메서드();
*/
		 

	}

}
