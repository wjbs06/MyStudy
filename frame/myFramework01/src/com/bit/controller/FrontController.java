package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String uri=req.getRequestURI();
		System.out.println(req.getContextPath());
		System.out.println(uri);
		String result=null;
		
		if("/list.do".equals(uri)){
			ListController controller=new ListController();
			result=controller.excute(req);
		}else if("/add.do".equals(uri)){
			AddController controller=new AddController();
			result=controller.excute(req);
		}
	
		req.getRequestDispatcher(result).forward(req, resp);
	}
}
