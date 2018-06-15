package com.bit.data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyJson extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*String msg="{\"root\":["
				+"{\"id\":\"user1\",\"pw\":\"1234\"},"
				+"{\"id\":\"user2\",\"pw\":\"2345\"},"
				+"{\"id\":\"user3\",\"pw\":\"3456\"}"
				+"]}";
		*/
		//String msg="mycallBack({\"message\":\"Test ok\"})";
		String callBack=req.getParameter("callback");
		String msg=callBack+"({\"message\":\"Test ok\"})";
				
		
		//resp.setContentType(applcation/Json; charset=UTF-8);
		PrintWriter out=resp.getWriter();
		out.print(msg);
		out.close();
	}
}
