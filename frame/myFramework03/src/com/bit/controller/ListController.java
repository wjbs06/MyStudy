package com.bit.controller;

import javax.servlet.http.HttpServletRequest;

import com.bit.model.GuestDao;

public class ListController implements BitController{

	@Override
	public String execute(HttpServletRequest req) throws Exception {
		req.setAttribute("alist", new GuestDao().selectAll());
		return "list";
	}

	
}
