class Ex04{

  public static void main(String[] args){


     int a;   // 1.자료형 변수명; <- 변수선언 변수명은 띄어쓰기 불가
     a=5;     // 2.변수명=값;  <- 변수초기화
              // int a=5;  <- 변수선언과 초기화가 동시에 
              // 3.중복선언 X
              // 변수명
              // 1)첫글자 소문자로 시작
              // 2)약속된 키워드는 사용불가(true,false 등)
              // 3)_,$를 제외한 띄어쓰기 특수문자 사용불가
              // 4)studentNumber 단어의 조합(두번째 단어의 대문자)
     int b;
     b=6;
     int c;
     c=a+b;

     System.out.println("a="+a);
     System.out.println("b="+b);
     System.out.println("c="+c);

  }

}