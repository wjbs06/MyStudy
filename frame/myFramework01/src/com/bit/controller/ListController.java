package com.bit.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.GuestDao;
import com.bit.model.entity.GuestVo;

/*@WebServlet(
		value={"/list.bit","/list.do"}
		)*/
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		System.out.println(uri);
		
		GuestDao dao=null;
		try {
			dao = new GuestDao();
			List<GuestVo> list=dao.selectAll();
			request.setAttribute("alist", list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/list.jsp");
		rd.forward(request, response);
	}

	public String excute(HttpServletRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

}
