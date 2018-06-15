package com.bit.step1.controller;

import com.opensymphony.xwork2.Action;

public class ResultAction implements Action {
	String id="admin";
	String pw="1234";
	
	public String getId(){
		return id;
	}
	
	public String getPw(){
		return pw;
	}
	
	@Override
	public String execute() throws Exception {
		return "success";
	}
}
