package com.bit.step2;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyWeb1 implements Servlet{
	ServletConfig config;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("init() 호출");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("service() 호출");
	}

	@Override
	public void destroy() {
		System.out.println("destroy() 호출");
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return "getServletInfo()";
	}



}
