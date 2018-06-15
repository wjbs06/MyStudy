
public class day10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 20180221



package com.bit.am;
/*
 * INT long double(기초자료형,원시자료형)
 * 
 * 랩퍼클래스
 * 첫글자를 대문자로 바꾸면 랩퍼클래스
 * 
 *
public class Ex01 {

	public static void main(String[] args) {
		// INT 의 객체형 Integer
		int a;
		a=100;
		int b;
		b=200;
		int c=a+b;
		System.out.println(c);
		System.out.println("-----------------------");
		Integer x=10; //오토랩핑
		Integer y=20;
		Integer z=x+y;
		System.out.println(z);
		System.out.println("-----------------------");
		Integer a1=new Integer(1000);
		Integer a2=new Integer(2000);
		Integer a3=new Integer(1000+2000);
		System.out.println(a3);
		System.out.println("-----------------------");
	}

}


package com.bit.am;

public class Ex02 {
/*
 * Integer 숫자인 문자만 가능
 * 숫자외에 사용불가
 * 
 *
	public static void main(String[] args) {
		Integer a1=new Integer(1);
		Integer a2=new Integer("2");
		Integer a3=3;//오토랩핑 하위버전에서는 사용이 안된다.
		int a4=a1+a2;//언랩핑
		Integer a5=a1+a2;//계산을 위해서 언랩핑(객체가 숫자로 변환) 계산후 다시 오토랩핑됨
		
		System.out.println(a1+a2+a3);
		//속성 변수
		System.out.println(Integer.MIN_VALUE);//값이 변하지 않는 상수형 변수
		System.out.println(Integer.MAX_VALUE);//static 이다.
		System.out.println(a1.MAX_VALUE);
		System.out.println(a1.SIZE);
		System.out.println("-----------------------");
		//기능 메서드 static
		System.out.println("parseInt-----------");
		String su1="1234";
		System.out.println(su1+1);
		int result1=Integer.parseInt(su1);// 자주사용 문자열 -> 숫자  바꾸는 기능
		System.out.println(result1+1);    // INT 로 받으려면 parseInt 사용
		System.out.println("valueOf--------------");
		Integer result2=Integer.valueOf(su1);//Integer 로 받으려면 valueOf 사용
		System.out.println(result2+1);//
		Integer result3=Integer.valueOf(100);//int를 받아서 Integer로 오토랩핑
		System.out.println("진수사용--------------");
		int su=10;
		System.out.println("2진수"+su+":"+Integer.toBinaryString(su));//
		System.out.println("8진수"+su+":"+Integer.toOctalString(su));
		System.out.println("16진수"+su+":"+Integer.toHexString(su));
		
		
		System.out.println("-------------------------------");
		Integer b1=new Integer(101);
		Integer b2=new Integer(101);
		System.out.println("객체로 비교 주소값");
		System.out.println(b1==b2);
		System.out.println("값으로 비교");
		System.out.println(b1.equals(b2));
		System.out.println(Integer.valueOf(b1)==Integer.valueOf(b2));
		System.out.println("-------------------------------");
		System.out.println("숫자를 문자로");
		int c1=3;
		Integer c2=new Integer(c1);
		System.out.println("앞에 빈칸을 더함");
		System.out.println(""+c1+1);
		System.out.println("toStirng으로 더함");
		System.out.println(c2.toString()+1);
		System.out.println("-------------------------------");
		
		
	}

}


메서드
parseXXX 문자열을 해당 타입으로 가져옴
valueOf
equals
toString
doubleValue()
-------------------------------------------
배열의 복사
package com.bit.pm;
/*
 * 배열 -> 객체
 * 변수명 - 참조변수
 * arr1.length 멤버필드를 사용
 * 
 * 
 *
public class Ex01 {

	
	public static void main(String[] args) {
		
		int[] arr1=new int[5];
		
		arr1[0]=100;
		arr1[1]=200;
		arr1[2]=300;
		arr1[3]=400;
		arr1[4]=500;
		System.out.println("배열의 복사- 얕은 복사");
		System.out.print("arr1:");
		for(int i=0;i<arr1.length;i++){//length  괄호가 없으므로 메서드가 아닌 필드
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		int[] arr2=arr1;
		System.out.print("arr2:");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		arr1[2]=2333;
		System.out.print("arr1:");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\narr2:");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("배열의 복사- 깊은 복사");
		
		int[] arr3;//객체 배열을 생성하고
		arr3=new int[arr1.length];//같은크기로 생성
		
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		}
		arr3[1]=2;
		System.out.print("arr1:");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\narr3:");
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
		System.out.println("\n--------------------------");
		System.out.println("arr1==arr2 "+(arr1==arr2));
		System.out.println("arr1==arr3 "+(arr1==arr3));

	}

}



//배열의 깊은 복사
		//1.
		int[] arr1={1,3,5,7};
		int[] arr2=new int[arr1.length];
		for(int i=0;i<arr2.length;i++){
			arr2[i]=arr1[i];
		}
		//2.
		int[] arr3=new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr3.length);
	//System.arraycopy(원본-변수명, 시작 index, 대상, 시작 index, 복사할개수);
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}




//다중배열

package com.bit.pm;


public class Ex04 {

	public static void main(String[] args) {
		int[] arr=null;
		arr=new int[5];
		arr[1]=2;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		//다중배열
		int[][] arrs=new int[2][3];
		arrs[0]=new int[3];
		arrs[1]=new int[3];
		
		arrs[0][0]=11;
		arrs[0][1]=22;
		arrs[0][2]=33;
		arrs[1][0]=44;
		arrs[1][1]=55;
		arrs[1][2]=66;
		for(int i=0;i<arrs.length;i++){
			for(int j=0;j<3;j++){
				System.out.print(arrs[i][j]+" ");
			}
				System.out.println();
		}
		
		int[][] arrs1={
				{11,22,33},
				{44,55},
				{77,88,99}
				
		};
		int[][] arr2=new int[3][];**********************
		arr2[0]=new int[]{11,22,33};********************
		arr2[1]=new int[2];*****************************
		arr2[2]=new int[3];*****************************
		
	}

}


		 */
	}

}
