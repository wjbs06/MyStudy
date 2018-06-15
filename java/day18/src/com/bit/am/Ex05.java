package com.bit.am;

public class Ex05 {
	
	
	public static void main(String[] args) {
		String db="1@홍길동@90@80@70\n";
		db+="2@홍길동@90@80@70\n";
		db+="3@홍길동@90@80@70\n";
		db+="4@홍길동@90@80@70\n";
		db+="5@홍길동@90@80@70\n";
		
		System.out.println("-------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학");
		System.out.println("-------------------------------");
		String[] students=(String[]) db.split("\n");
		for (int i = 0; i < students.length; i++) {
			String temp=students[i];
			String[] stu=temp.split("@");
			System.out.print(stu[0]);
			System.out.print("\t");
			System.out.print(stu[1]);
			System.out.print("\t");
			System.out.print(stu[2]);
			System.out.print("\t");
			System.out.print(stu[3]);
			System.out.print("\t");
			System.out.print(stu[4]);
			System.out.println("\t");
		}
		
		
		
		
	}

}
