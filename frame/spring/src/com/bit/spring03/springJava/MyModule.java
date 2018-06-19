package com.bit.spring03.springJava;

public class MyModule {
	public void printHelloMoudule(){
		HelloModule module=new HelloModule("생성자를 통한 주입");
//		module.setMsg("메세지");
		module.print();
	}
}
