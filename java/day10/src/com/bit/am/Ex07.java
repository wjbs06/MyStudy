package com.bit.am;

public class Ex07 {

	public static void main(String[] args) {
	

		char ch1='a';
		Character ch2= new Character('A');
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		System.out.println(Character.SIZE);
		System.out.println("--------------");
		System.out.println(ch2.charValue()+1);//숫자로 출력
		System.out.println(ch2.toString()+1);//문자로 출력
		System.out.println(Character.valueOf(ch1));//
		// 유니코드 인지 자바에서 사용할 수 있는 문자인지 검사
		System.out.println("유니코드검사--------------");
		System.out.println(Character.isDefined('@'));
		// 문자 인지
		System.out.println("문자검사--------------");
		System.out.println("'a'"+Character.isLetter('a'));
		System.out.println("'한'"+Character.isLetter('한'));
		System.out.println("123"+Character.isLetter(123));
		System.out.println("'金'"+Character.isLetter('金'));
		// 숫자 인지
		System.out.println("숫자검사----------------");
		System.out.println("'9'"+Character.isDigit('9'));
		System.out.println("'@'"+Character.isDigit('@'));
		System.out.println("'a'"+Character.isDigit('a'));
		// 알파벳 인지
		System.out.println("알파벳검사----------------");
		System.out.println("'A'"+Character.isAlphabetic('A'));
		System.out.println("'Z'"+Character.isAlphabetic('Z'));
		System.out.println("'a'"+Character.isAlphabetic('a'));
		System.out.println("'b'"+Character.isAlphabetic('b'));
		System.out.println("'2'"+Character.isAlphabetic('2'));
		System.out.println("'@'"+Character.isAlphabetic('@'));
		System.out.println("'한'"+Character.isAlphabetic('한'));
		System.out.println("'A'"+Character.isUpperCase('A'));
		System.out.println("'a'"+Character.isUpperCase('a'));
		// 띄어쓰기
		System.out.println("띄어쓰기검사----------------");
		System.out.println("' '"+Character.isSpace(' '));
		System.out.println("'a'"+Character.isSpace('a'));
		System.out.println("'@'"+Character.isSpace('@'));
		System.out.println("' '"+Character.isWhitespace(' '));
		System.out.println("'a'"+Character.isWhitespace('a'));
		System.out.println("'@'"+Character.isWhitespace('@'));
	}

}
