package com.bit.step1.controller;

import com.opensymphony.xwork2.Action;

public class Ex02Action implements Action{
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("db¿¬µ¿");
		int a=0;
		if(a>0){
			return "success";
		}else{
			return "error";
		}
	}
}
