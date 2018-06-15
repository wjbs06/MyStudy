package com.bit.pm;

public class Ex01 {
//	Q3. 띄어쓰기로 잘라서 spring[] 에 담아 출력하시오
//	 * >>str[0]="Java"
//	 * >>str[1]="Web"
//	 * >>str[2]="Spring"
	public static void main(String[] args) {

		String msg="Java Web String";
		int cnt=0;
		
		for(int i=0;i<msg.length();i++){
			if(msg.charAt(i)==' '){
				cnt++;
			}
		}
		
		String[] box=new String[cnt+1];
		char[] chs=msg.toCharArray();
		int idx=0;
		for(int i=0;i<chs.length;i++){
			if(chs[i]==' '){
				idx++;
			}else{
				box[idx]+=chs[i];
			}
			
		}
		for(int i=0;i<box.length;i++){
			System.out.println(box[i]);
		}
		
	}

}
