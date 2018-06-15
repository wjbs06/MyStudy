package com.bit.am;

class Node{
	//객체를 이용한 동적할당
	int val;
	Node node;
	
}

class MyLink{
	//객체를 이용한 동적할당
	int cnt;
	Node start;
	
	public MyLink(){
		
	}

	public int get(int idx){
		int su=0;
//		//0
//		su=start.val;
//		//1
//		su=start.node.val;
//		//2
//		su=start.node.node.val;
//		
		Node temp=start;
		for (int i = 0; i < idx; i++) {
			temp=temp.node;
		}
		su=temp.val;
		return su;
	}
	
	public void add(int a){
		if(cnt==0){
			start=new Node();
			start.val=a;
			cnt++;
		}else{
			Node temp=start;
			while(true){
				if(temp.node==null){
					break;
				}
				temp=temp.node;
			}
//			Node before=start;
//			for (int i = 0; i < cnt; i++) {
////				before=temp;
//				temp=temp.node;
//			}
			temp.node=new Node();
			temp.node.val=a;
			cnt++;
			
//			start.node=new Node();
//			start.node.val=a;				
		}
	}
}

class MyArr{
	//배열을 이용한 동적할당
	int[] arr;
	
	public MyArr(){
		arr=new int[0];
	}
	
	public void add(int a){
		int[] temp=new int[arr.length+1];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr=temp;
		arr[arr.length-1]=a;
	}
	
	public int get(int idx){
		return arr[idx];
	}
}

public class Ex02 {

	 
	public static void main(String[] args) {
		MyArr arr1=new MyArr();
		arr1.add(111);
		arr1.add(222);
		arr1.add(333);
		for (int i = 0; i < arr1.arr.length; i++) {
			System.out.println(arr1.get(i));
		}
		
		MyLink arr2=new MyLink();
		arr2.add(111);
		arr2.add(222);
		arr2.add(333);
		arr2.add(444);
		arr2.add(555);
		for (int i = 0; i < 5; i++) {
			System.out.println(arr2.get(i));
		}
//		System.out.println(arr2.get(1));
	}

}
