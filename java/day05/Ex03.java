class Ex03{

  public static void main(String[] args){

	// 주석
	/* 주석
	*/	

	/*
		제어문
		조건문if(조건){}, switch
		반복분for(초기화,조건,증감){}, 초기화;while(조건){증감}, 		do{증감} while(조건)
		
	*/
	java.util.Scanner sc = new java.util.Scanner(System.in);
	String st=sc.nextLine();
	System.out.println("입력하신 내용은 "+st);
	/*
	switch(1){
		case 1:
			System.out.print("1실행");
			break;
	}
	*/
	System.out.println(st.equals("test2"));

  }

}