package com.bit.pm;

public class Ex05 {

	
	public static void main(String[] args) {
		// 라이브러리
		//String
		String msg1="abc";
		String msg2=new String(msg1);
		String msg3="abc";
		
		System.out.println(msg1==msg2);
		System.out.println(msg1==msg3);
		
		byte[] by=new byte[3];//-128~127
		by[0]=65;
		by[1]=66;
		by[2]=67;
		String msg4=new String(by);
		System.out.println(msg4);
		
		char[] ch=new char[5];
		ch[0]='가';
		ch[1]='나';
		ch[2]='다';
		ch[3]='라';
		ch[4]='마';
		String msg5=new String(ch,0,4);
		System.out.println(msg5);
		int[] sus={55,56,57};
		String msg6=new String(sus,0,3);
		System.out.println(msg6);

		String msg7="가나다라";
		char[] ch2=msg7.toCharArray();
		byte[] by2=msg7.getBytes();
		for (int i = 0; i < by2.length; i++) {
			System.out.println(by2[i]);
		}
		
		String msg11="Java";
		String msg12="Web";
		String msg13=msg11.concat(msg12);
		System.out.println(msg13);
		
		String msg14=msg11.replace('a', 'a');
		String msg15=msg12.replace("e", "");
		String msg16=msg11.substring(1,2);
		System.out.println(msg13+" "+msg16);
		
		String msg21="abc abcd abcde abcdef";
		String msg22=msg21.replace("ab", "AB");
		String msg23=msg21.substring(0,2);
		System.out.println(msg23);
		
		
	
	}

}
