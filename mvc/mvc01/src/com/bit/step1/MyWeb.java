package com.bit.step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyWeb extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String msg="<!DOCTYPE html><html><head><meta charset=\"UTF-8\">";
		msg+="</head><body><h1>Hello World</h1></body></html>";
		PrintWriter out = resp.getWriter();
		out.print(msg);
		out.flush();
	}
}








