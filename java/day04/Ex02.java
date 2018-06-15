/*
Q1. 2의1승 2의2승 2의3승 2의4승 2의5승을 출력하세요
	-> 2 4 8 16 32
Q2. 1~50까지의 합을 while문으로 출력하시오
	-> 1~50의 총 합계는 XXXX입니다.
Q3. 1,2,3,4,5,6,7,8,9,10을 출력하시오

Q4. 구구단 7단을 while문으로 출력하시오

Q5. while문으로 구구단을 출력하시오
*/
class Ex02{

  public static void main(String[] args){

	//Q1. 2의1승 2의2승 2의3승 2의4승 2의5승을 출력하세요
	System.out.println("Q1. 2의1승 2의2승 2의3승 2의4승 2의5승을 출력하세요");
	int a=1;
	while(a<32){
		System.out.print(a*2+" ");
		a=a*2;
		/*	a=2  덧셈으로 하는 방법
			a=a+a
			2+2=4
			4+4=8
			8+8=16
			16+16=32

		*/
			
	}//while end
	System.out.println();

	//Q2. 1~50까지의 합을 while문으로 출력하시오
	System.out.println("Q2. 1~50까지의 합을 while문으로 출력하시오");
	int j=1;
	int sum=0;
	boolean result2=true;
	while(result2){
		sum=sum+j;
		j++;
		if(j==51){
			result2=false;
		}
	}
	System.out.println(sum);

	//Q3. 1,2,3,4,5,6,7,8,9,10을 출력하시오
	System.out.println("Q3. 1,2,3,4,5,6,7,8,9,10을 출력하시오");
	int c=0;
	while(c<9){
		c++;
		System.out.print(c+",");
		
	}
	System.out.println("10\n");
	
	//Q4. 구구단 7단을 while문으로 출력하시오
	int q4=1;
	while(q4<10){
		System.out.println("7X"+q4+"="+q4*7);
		q4++;
	}
	System.out.println();
	//Q5. while문으로 구구단을 출력하시오
	int q5a=2;
	int q5b=1;
	while(q5b<10){
		while(q5a<10){
			System.out.print(q5a+"X"+q5b+"="+q5a*q5b+"\t");
			q5a++;
		}
		q5a=2;
		q5b++;
		System.out.println();
	}

  }//main end

}//class end