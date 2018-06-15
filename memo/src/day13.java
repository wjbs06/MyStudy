/* 패키지
 * 임포트 - 앞으로 등장할 클래스의 위리를 찾는
 * 			예외) 해당패키지&&java.lang.~제외
 * 
 * 
 * 
 */
import java.util.Scanner;

public class day13 {
	/*
	 * 클래스(전역변수,생성자,메서드)
	 * 전역변수
	 * 생성자 - 객체 생성시에 수행할 내용 - 필드 초기화
	 * default - 인자가 없는 생성자
	 * 메서드
	 * non-static(고유값)/static(공통)
	 * static caseBycase
	 * 	
	 */
	public static void main(String[] args) {
		/*
		 * 20180226
		 * 
		 * 	public Ex01(){
		//		super();
				this("");//밑의 생성자를 호출
				System.out.println("Ex01");
				this.func01();
			}
			public Ex01(String st){
		//		super();
				System.out.println("Ex01(asdf)");
			}
			
			public static void main(String[] args) {
				com.bit.am.Scanner sc=new com.bit.am.Scanner();
				Scanner sc2=new Scanner(System.in);
				Ex01 me=new Ex01();
				me.func01();
			}
		
			public void func01(){
				this.func02(); //참조변수가 생략된 이유는 this가 생략되어서
			}
			
			public void func02(){
				
			}
			
		}
		 * 
		 * 
		 * class : public || default
		 * 생성자,전역,메서드 : public || protected || default || private
		 * 
		 * class Lec03{
				//디자인 패턴 - 싱글톤 패턴
				private static Lec03 you=null;
				
				private Lec03(){
				}
				
				public static Lec03 func01(){
					if(you==null){
						you=new Lec03();
					}
					return you;
				}
				
			}
		 * 
		 * 
		 * 
		 * 
		 * 
		 * abstract class Lec08{
				//추상클래스
				// - 추상메서드를 0개 이상~
				// 추상메서드를 안가질수도 있다
				int su=1234;
				public Lec08(){
					System.out.println("Lec08 생성자");
				}
				
				public void func01(){
					System.out.println("Lec08 func01 run");
				}
				
				public abstract void func02();
			}
		 * 
		 * 
		 * 
		 * abstract class Lec08{
	//추상클래스
	// - 추상메서드를 0개 이상~
	// - 독립적 객체의 생성불가 **************
	// - 상속받는 측에서 추상메서드를 구현해서 사용
	// 추상메서드를 안가질수도 있다
	// 추상클래스의 사용
	// 1. 하위클래스가 추상클래스가 되어 추상클래스를 상속
	// 2. 추상메서드를 오버라이드(- 상속받는 측에서 추상메서드를 구현해서 사용)
	//  - 상속받는 측에서 기능을 결정해서 사용할 수 있다
				int su=1234;
				public Lec08(){
					System.out.println("Lec08 생성자");
				}
				
				public void func01(){
					System.out.println("Lec08 func01 run");
				}
				// 추상메서드
				public abstract void func02();
			}
			
			public class Ex08 extends Lec08{
			
				/*
				 * 상속
				 *
				public Ex08(){
					super();
					System.out.println("Ex08 생성자");
				}
				
				public static void main(String[] args) {
					Lec08 me= new Ex08();
					me.func01();
					me.func02();
				}
				
				public void func02(){
					System.out.println("Ex08 override func02");
				}
			}
		 * 
		 * 
		 * 
		 ******************* 예외처리
		 * 
		 * Scanner sc= new Scanner(System.in);
			try{
				try{
					int su=5/sc.nextInt();
				}catch(java.util.InputMismatchException ex){
					System.out.println("숫자입력이 아님");
				}
			} catch(Exception ex){
				System.out.println("에러발생");
			}
		 * 
		 * 
		 * 
		 * 
		 * 
			// 직접만든 에러클래스
			class MyErr extends Exception{
				public MyErr(){
					super("2~9사이 값이 아님");
				}
			}
			
			public class Ex05 {
			
				public static void main(String[] args) throws MyErr {
					
					int su=0;
					try{
					gugudan(su);
					}catch(MyErr ex){
			//			System.out.println(ex.getMessage());
						ex.printStackTrace();
					}
					
			
				}
			
				public static void gugudan(int su) throws MyErr{
					if(su>1 && su<10){
						for(int i=1;i<10;i++){
							System.out.println(su+"x"+i+"="+(su*i));
						}			
					}else{
						MyErr err=new MyErr();
						throw err;
					}
				}
				
			}

		 * 
		 * 
		 * 
				class Lec08{}
			
			interface Inter01{
				// 오직 추상메서드만 갖음(단, 상수형 변수만 갖음)
				// 인터페이스의 다중상속 허용(다중상속처럼)
				int sum=100;
				
				public void func01();// 인터페이스의 추상메서드는 public 
				void func02(int a);// 생략해도 public
			}
			
			interface Inter02{
				void func03();
			}
			interface Inter03 extends Inter02,Inter01{
				int sum=200;
				void func03();
			}
			interface Inter04{
				//상속받는 클래스의 구체화
			}
			public class Ex08 extends Lec08 implements Inter01,Inter03,Inter04 {
			
				public static void main(String[] args) {
					
					
				}
			
				public void func01(){
					
					System.out.println();
				}
				
				public void func02(int a){
					
				}
				
				public void func03(){
					
				}
			}
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
