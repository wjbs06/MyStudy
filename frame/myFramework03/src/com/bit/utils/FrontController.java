package com.bit.utils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.controller.BitController;
import com.bit.controller.ListController;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//url		controller			method	view
		//------------------------------------------------
		//list.do	ListController		get - list.jsp
		//add.do	AddController		get - add.jsp
		//insert.do	InsertController	post- list.do
		//edit.do	EditController		get - edit.jsp
		//update.do	UpdateController	post- detail.do
		//delete.do	DeleteController	post- list.do
		//------------------------------------------------
		String uri=req.getRequestURI();
		uri=uri.substring(req.getContextPath().length());
		BitController controller=null;
		String className="drr.do";
		if(uri.equals("/list.do")){
			className="com.bit.controller.ListController";
		}
		if(uri.equals("/add.do")){
			className="com.bit.controller.AddController";
		}
		if(uri.equals("/insert.do")){
			className="com.bit.controller.InsertController";
		}
		if(uri.equals("/detail.do")){
			className="com.bit.controller.DetailController";
		}
		if(uri.equals("/edit.do")){
			className="com.bit.controller.EditController";
		}
		if(uri.equals("/update.do")){
			className="com.bit.controller.UpdateController";
		}
		if(uri.equals("/delete.do")){
			className="com.bit.controller.DeleteController";
		}
		String view=null;
		String prifix="/WEB-INF/view/";
		String subfix=".jsp";
		try{
			Class<?> clzz=Class.forName(className);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		req.getRequestDispatcher(prifix+view+subfix).forward(req, resp);
	}

}
