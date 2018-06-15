class Ex03{

  public static void main(String[] args){
	/*
	//제어문
		//조건문
			//if문(만약 ~이라면)
			//if(조건-t/f){실행문;}
			//if(조건-t/f){실행문;} else {실행문;}
			//*if(조건-t/f){
				실행문;
				}else if(조건){
				실행문;
				}else if(조건){
				실행문;
				}else if(조건){
				실행문;	
				...
				}else if(조건){
				실행문;
				}
	*/

	int a=-10;
	System.out.println("a는");
	if(a>=0){
		if(a==0){
			System.out.println("0 입니다.");
		} else {
			System.out.println("양수입니다.");
		}
	} else { 
		System.out.println("음수입니다.");
	} //if end

	System.out.println("끝...");

  }//main end

}//class end