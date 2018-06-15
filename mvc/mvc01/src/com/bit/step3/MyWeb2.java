package com.bit.step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyWeb2 extends GenericServlet{//MyServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		HttpServletRequest request= (HttpServletRequest) req;
		HttpServletResponse response=(HttpServletResponse) res;
		System.out.println(request.getMethod());
		if("GET".equals(request.getMethod()))doGet(request,response);
		else if("POST".equals(request.getMethod()))doPost(request,response);
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String msg="<html>";
		msg+="<head>";
		msg+="</head>";
		msg+="<body>";
		msg+="<h1>";
		msg+="MyWeb2 page";
		msg+="</h1>";
		msg+="</body>";
		msg+="</html>";
		
		PrintWriter out = res.getWriter();
		out.print(msg);
		out.flush();

	}

}
