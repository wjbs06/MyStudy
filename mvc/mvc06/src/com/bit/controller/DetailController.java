package com.bit.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.GuestDao;
import com.bit.model.GuestDto;

@WebServlet("/guest/detail.bit")
public class DetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String idx=req.getParameter("idx");
		int sabun=Integer.parseInt(idx);
		GuestDto bean=null;
		
		try {
			GuestDao dao=new GuestDao(req);
			bean=dao.selectOne(sabun);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("bean", bean);
		
		RequestDispatcher rd=req.getRequestDispatcher("../jstl/detail.jsp");
		rd.forward(req, resp);
	}
}
