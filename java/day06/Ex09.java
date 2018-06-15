/*
----------------------------
bankCD
----------------------------
1.입금 2.출금 3.잔액보기 0.종료>>>3
남은 돈>0원

1.입금 2.출금 3.잔액보기 0.종료>>>2
인출액>500
잔액이 부족합니다.

1.입금 2.출금 3.잔액보기 0.종료>>>1
입금액>1000

1.입금 2.출금 3.잔액보기 0.종료>>>3
잔액>1000

1.입금 2.출금 3.잔액보기 0.종료>>>2
인출액>500

1.입금 2.출금 3.잔액보기 0.종료>>>3
잔액>500

1.입금 2.출금 3.잔액보기 0.종료>>>0
*/
class Ex09{

  public static void main(String[] args){
	System.out.println("----------------------");
	System.out.println("       Bacnk CD");
	System.out.println("----------------------");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	Ex09 me=new Ex09();
	me.show();
  }//main end
	
  public void show(){
	long myAccount=0;
	Ex09 me2=new Ex09();
	int con=1;
	while(con!=0){
		System.out.print("\n1.입금 2.출금 3.잔액보기 0.종료>>>");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		con=sc.nextInt();
		switch(con){
			case 1:
				myAccount=me2.insert(myAccount);
			break;
			case 2:
				myAccount=me2.out(myAccount);
			break;
			case 3:
				me2.check(myAccount);
			break;
			case 0:
				System.out.println("이용해주셔서 감사합니다.");
			break;
			default :
				System.out.println("다시 입력해주세요");
			break;
		}//switch end
	}//while end
  }//show end

  public long insert(long money){
	System.out.print("입금액>");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	long su=0;
	su=sc.nextLong();
	while(su<1){
		System.out.println("다시 입력해주세요");
		su=sc.nextLong();
	}
	money=money + su;
	return money;
  }

  public long out(long money){
  	System.out.print("출금액>");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	long su=0;
	su=sc.nextLong();
	while(su>money){
		System.out.println("잔액이 부족합니다.");
		su=sc.nextLong();
	}
	money=money - su;
	return money;
  }

  public void check(long money){
	System.out.println("잔액보기>"+money);
  }

}//class end