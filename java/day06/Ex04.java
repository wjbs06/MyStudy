/*
use not-static method
가위바위보

*/

class Ex04{
  public static void main(String[] args){
	
	Ex04 me=new Ex04();
	me.flow();
	
  }//main end

  public void flow(){
	int con=1;
	int win=0;
	int lose=0;
	int draw=0;
	while(con==1){

		Ex04 me=new Ex04();
		int user=me.input();
		int com=me.com();
		int result=me.compare(user,com);
		String resultA=me.compareKo(result);
		con=me.output(user,com,resultA);

		//누적
		switch(result){
			case 3:	
				win+=1;
			break;
			case 2:
				draw+=1;
			break;
			case 1:
				lose+=1;
			break;
		} //누적 end
		System.out.println("----------------------------------");
	}
	
	//종료안내문
	System.out.println("누적 "+win+"승"+draw+"무"+lose+"패");
	System.out.println("이용해주셔서 감사합니다.");
	//종료안내문 end

  }


  //가위바위보 입력받기
  public int input(){
	System.out.println("가위바위보 게임(ver 0.0.1)");	
	System.out.print("1.가위 2.바위 3.보>>>");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int user;
	do{
		user=sc.nextInt();
		if(user>3||user<1){
			System.out.println("다시입력해주세요");
		}
	}while(user>3||user<1);
	String userA;
	if(user==1){
		userA="가위";
	} else if(user==2){
		userA="바위";
	} else {
		userA="보";		
	}
	return user;
  }//가위바위보 입력end

  //컴퓨터가 낼 가위바위보
  public int com(){
	int com=(int)(Math.random()*3)+1;
	String comA;
	if(com==1){
		comA="가위";
	} else if(com==2){
		comA="바위";
	} else {
		comA="보";		
	}
	return com;
  }//컴퓨터 가위바위보 end

  //결과 판정 if문 SU
  public int compare(int user,int com){
	int result=0;
	if(user==1){
		if(com==2){
			result=1;
		} else if(com==3) {
			result=3;
		} else {
			result=2;
		}
	} else if(user==2){
		if(com==1){
			result=3;
		} else if(com==3) {
			result=1;
		} else {
			result=2;
		}
	} else if(user==3){
		if(com==2){
			result=3;
		} else if(com==1) {
			result=1;
		} else {
			result=2;
		}
	} //if end
	return result;
  }//결과 판정 end

  //결과 판정 if문 KOR
  public String compareKo(int result){
	String resultA="";
	switch(result){
		case 1:
			resultA="졌다.";
		break;
		case 2:
			resultA="비겼다.";
		break;
		case 3:
			resultA="이겼다.";
		break;
	}
	return resultA;
  }//결과 판정 end

  //결과 출력
  public int output(int user,int com,String resultA){

	String userA;
	if(user==1){
		userA="가위";
	} else if(user==2){
		userA="바위";
	} else {
		userA="보";		
	}

	String comA;
	if(com==1){
		comA="가위";
	} else if(com==2){
		comA="바위";
	} else {
		comA="보";		
	}

	System.out.println("당신 : "+userA);
	System.out.println("컴퓨터 : "+comA);
	System.out.println("결과 : "+resultA);
	System.out.print("계속하시겠습니까?(1.계속 0.종료)>>");
	java.util.Scanner sc=new java.util.Scanner(System.in);

	//이용응답
	int con;
	do{
		con=sc.nextInt();
		if(con<0||con>1){
			System.out.println("다시입력해주세요");
		}
	}while(con<0||con>1);
	//이용응답 end

	return con;
  }
  //결과 출력 end

}//class end
