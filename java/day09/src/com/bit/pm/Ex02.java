package com.bit.pm;

public class Ex02 {

	/*
	 * 주민번호를 입력하세요>123456-1234567
	 * 당신은 00살 남자입니다
	 * 
	 * 주민번호를 입력하세요>1234561234567
	 * '-'를 생략하지 마세요
	 * 
	 * 주민번호를 입력하세요>123456-123456
	 * 양식에 맞춰 입력바랍니다 ex)000000-0000000
	 * 
	 * 주민번호를 입력하세요>
	 * 
	 */
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String num=null;
		
		while(true){
			System.out.print("주민번호를 입력해주세요>");
			num=sc.nextLine();
			System.out.println(num);
			if(num.length()==14){
				if(num.charAt(6)=='-'){
					boolean result=true;
					for(int i=0;i<num.length();i++){
						if(i==6){
							continue;
						}
						if(num.charAt(i)<'0'||num.charAt(i)>'9'){
							result=false;
						} 
					}		
					if(result){
						break;
					}else{
						System.out.println("숫자를 입력하세요");					
					}
				}else{
					System.out.println("'-'를 입력해주세요");
				}
			} else {
				System.out.println("14자리 숫자를 입력해주세요");
			}//'-' if end
		}//while end  
		
			
		System.out.println("입력완료");
		
		int age1=0;
		int age2=0;
		String se=null;
		age1=(num.charAt(0)-48)*10;
		age2=(num.charAt(1)-48);
		int age=age1+age2;
		age=118-age;
		
		switch(num.charAt(7)){
			case '1':
				se="남자";
				break;
			case '2':
				se="여자";
				break;
			case '3':
				se="남자";
				break;
			case '4':
				se="여자";
				break;
		}
		System.out.println("당신은"+age+"살"+se+"입니다.");
		
				
		}
		
		
	
	
}

