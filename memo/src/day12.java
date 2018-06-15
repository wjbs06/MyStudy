import java.util.InputMismatchException;





public class day12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * 20180223
		 * 
		 * Ex01과 ball 로 만든 객체를 이용한 로또생성기
		 * 
		 * //public > protected > default > private
		 * 기본적으로 protected 와 default 는 같으나
		 * protected 는 상속을 받은 자손에 의해서는 실행가능하다.
		 * 
		 * class 에 private 와 protected 는 사용불가
		 * 
		 * 상속막는방법
		 * class 앞에 final 을 붙인다.
		 * final class Ex01
		 * 더이상 상속을 할 수 없는 마지막 class 라는 의미
		 * 
		 * 접근제한자 [final] class 클래스명
		 * 
		 * 메서드에 final 을 사용하게 되면 메서드를 변형불가
		 * 오버라이드도 불가
		 * 
		 * 
		 * 다형성
		 * Lec05 you= new Ex05();
		 * 상속받은 부모객체의 변수를 선언하고 자신으로 메모리 생성
		 * 메서드가 실행될때 오버라이드 된 메서드는 자신의 메서드를 실행
		 * 
		 * 
		 * pm.Ex02.java
		 * me.func02(); 실제 객체는 기능을 가지고 있지만 참조변수의 타입에 없기때문에 불가능
		 * Ex02 me2=(Ex02)me;//Ex02 타입으로 형변환하여 사용가능
		 * me2.func02();
		 * 
		 * 
		 * 예외처리
		 * 회피
		 * 1.오류
		 * 	 1)문법법 자동으로 표시
		 * 	 2)논리적
		 * 2.실행시 오류
		 * 
		 * 
		 * 	try{
				System.out.println("입력하세요");
				for(int i=0;i<5;i++){
					su=sc.nextInt();
					System.out.println("su="+su);				
				}
			}catch(InputMismatchException ex){
				System.out.println("숫자를 입력하세요");
				
			}
	
		 */

	}

}
