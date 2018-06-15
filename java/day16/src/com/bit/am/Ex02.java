package com.bit.am;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

class Lec02{
	int su;
	Lec02(int su){
		this.su=su;
	}
}

public class Ex02 {

	
	public static void main(String[] args) {
		//set
		//-순서를 갖지 않고
		//-중복허용X
		Set set01=new HashSet(); // 순서 없음, hash 값으로 비교하므로 객체도 입력된다
//		set01= new TreeSet();// 순서가 있음, 문자열로 입력시 비교가 어렵
		set01.add(new Lec02(1111));//입력
//		set01.add(2222);//입력
//		set01.add(3333);//입력
//		set01.add(4444);//입력
//		set01.add(5555);//입력
//		set01. 수정이 있을 수 없다. 결국 삭제후 새로 입력과 같다.
		set01.remove(3333);//삭제
		
		System.out.println("set size:"+set01.size());
		Iterator ite= set01.iterator();//보기
		while(ite.hasNext()){
			System.out.print(ite.next()+" ");
		}
		System.out.println("\n-------------------------");	
	}

}
