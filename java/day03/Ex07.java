/* 성적관리 프로그램
kor=95
eng=69
math=87
............
결과 출력
합계 : XXX
평균 : XX.XX
학점 : A학점
............
학점의 기분
A학점 : 평균 90이상
B학점 : 평균 80이상
C학점 : 평균 70이상
D학점 : 평균 60이상
F학점 : 평균 60미만
*/
class Ex07{

  public static void main(String[] args){
	int kor=95;
	int eng=69;
	int math=87;
	int sum=0;
	double avg=0;
	char igrade,sgrade;

	sum=kor+eng+math;
	avg=sum*100/3/100.0;

	igrade='0';
//if문
	if(avg>=90){
		igrade='A';
	} else if(avg>=80){
		igrade='B';
	} else if(avg>=70){
		igrade='C';
	} else if(avg>=60){
		igrade='D';
	} else {
		igrade='F';
	} //if end
//switch문
	switch((int)avg/10){
		case 10:
		case 9:
			sgrade='A';
		break; 
		case 8:
			sgrade='B';
		break;
		case 7:
			sgrade='C';
		break;
		case 6:
			sgrade='D';
		break;
		default:
			sgrade='F';
		break;
	} //switch end
//출력
	System.out.println("...............");
	System.out.println("if결과 출력");
	System.out.println("합계 :"+sum);
	System.out.println("평균 :"+avg);
	System.out.println("학점 :"+igrade+"학점");
	System.out.println("...............");
	System.out.println("...............");
	System.out.println("switch결과 출력");
	System.out.println("합계 :"+sum);
	System.out.println("평균 :"+avg);
	System.out.println("학점 :"+sgrade+"학점");
	System.out.println("...............");

  } //main end

} //class end