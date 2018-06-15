class Ex04{

  public static void main(String[] args){

	System.out.println("------------------------------");
	System.out.println("XXXX프로그램");
	System.out.println("------------------------------");
	System.out.println("메뉴를 선택하세요");
	System.out.print("(1.보기 2.입력 3.삭제 0.종료)");
	int input=0;
	System.out.println(input);
	if(input<0||input>3){
		System.out.println("잘못입력하셨습니다.");
	} else if(input<=1){
		System.out.println("보기 선택");	
	} else if(input<=2){
		System.out.println("입력 선택");	
	} else if(input<=3){
		System.out.println("삭제 선택");	
	} else if(input==0){
		System.out.println("종료 선택");	
	}

	System.out.println("");

	int b=1;
	switch(b){
		
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
		case 6:
			System.out.println("6입니다.");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		break;
	}
  }

}