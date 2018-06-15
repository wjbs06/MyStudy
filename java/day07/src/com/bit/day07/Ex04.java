package com.bit.day07;

class BankCD{
	public int money=0;
	public void add(int b){
		money=money+b;
	};
	public void del(int input){
		money=money-input;
	};	
	public void show(){
		System.out.println("현재 잔고는 "+money+"원입니다.");
	};	
}

public class Ex04 {

	public static void main(String[] args) {
		int input=1;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		BankCD bank=new BankCD();
		
		while(input!=0){
			
		System.out.println("1.입금 2.출금 3.잔고확인 0.종료");
		input=sc.nextInt();
		
		
			switch(input){
				case 1:
						System.out.print("입금하실 금액");
						input=sc.nextInt();
						bank.add(input);
						System.out.println(bank.money);
					break;
				case 2:
						System.out.print("입금하실 금액");
						input=sc.nextInt();
						bank.del(input);
					break;
				case 3:
						bank.show();
					break;
				case 0:
					break;
				default:
					break;
			}
	
		}
	}

}
