class Ex09{

  public static void main(String[] args){
/*
	Q1. 1~10까지 중 짝수를 출력하시오
		-> 2 4 6 8
	Q2. 1~50까지의 합계를 구하시오
	
	Q3. 구구단 7단을 출력하시오
		7X1=7
		...
*/	
	// Q1
	System.out.println("Q1. 1~10까지 중 짝수를 출력하시오");
	for(int i=2;i<=10;i+=2){
		System.out.println(i);
	} //for end
	for(int i=3;i<=10;i+=3){
		--i;
		System.out.println(i);
	}
	// Q2
	int sum=0;
	for(int i=1;i<=50;i++){
		sum=sum+i;
	} 		
	System.out.println("Q2. 1~50까지의 합계를 구하시오");
	System.out.println(sum);

	//Q3
	System.out.println("Q3. 구구단 7단을 출력하시오");
	for(int i=1;i<=9;i++){
		int seven=7;
		System.out.println("7X"+i+"="+seven*i);
	} //for end

  } //main end

} //class end