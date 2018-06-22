package com.bit.myapp02.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.myapp02.model.entity.GuestVo;

@Controller
public class Ex01Controller {
	
	@RequestMapping("/ex01")
	public String execute() {
		
		return "ex01";
	}
	
	@RequestMapping(value="/guest/ex02",method=RequestMethod.GET)
	public String execute1() {
		System.out.println("get");
		return "guest/ex02";
	}
	
	@RequestMapping(value="/guest/ex02",method=RequestMethod.POST)
	/*public void execute2(@RequestParam("id") String a,@RequestParam("pw")String b,
			@RequestParam("su") int c
			) {*/
	public void execute2(String id,String pw,int su) {
		System.out.println("post");
//		System.out.println("id: "+req.getParameter("id"));
//		System.out.println("pw: "+req.getParameter("pw"));
		System.out.println("id: "+id);
		System.out.println("pw: "+pw);
		System.out.println("su: "+su);
	}
	
	@RequestMapping("/ex03")
	public void ex03() {}
	@RequestMapping("/ex04")
	public void ex04(@ModelAttribute("bean") GuestVo command) {
	}
//	public void ex04(@ModelAttribute GuestVo command,Model model) {
//		model.addAttribute("bean", command);
//	}
//	public void ex04(int sabun,String name,Model model) {
//		GuestVo bean=new GuestVo();
//		bean.setSabun(sabun);
//		bean.setName(name);
//		model.addAttribute("bean", bean);
//	}
	
	@RequestMapping("/{path}/{msg}")
	public String ex05(@PathVariable String msg,@PathVariable String path) {
		System.out.println(path);
		return "ex12";
	}
}
