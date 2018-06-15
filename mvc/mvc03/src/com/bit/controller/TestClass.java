package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestClass {
	
	private TestClass(){
		
	}
	
	public static TestClass getObject(){
		return new TestClass();
	}
	
	public void forward(){
		System.err.println("½ÇÇà");
	}
}
