package com.bit.am;

public class Ex05 {

	static String tot01="";
	
	public static void main(String[] args) {
		//static
//		int tot=
//		Ex05.sum01("Java").sum01("Web").sum01("Framework");
//		System.out.println(tot);
		
		//non-static
		Ex05 me=new Ex05();
		System.out.println(me.toString());
		System.out.println(me.func01("Java").func01("Web").func01("Framework"));
	}

//	public static Ex05 sum01(String msg){
//		tot01+=msg;
//		Ex05 me=new Ex05();
//		return me;
//	}
	public Ex05 func01(String msg){
		this.tot01+=msg;
		return this;
	}
	

	public String toString(){
		return tot01;
	}
}
