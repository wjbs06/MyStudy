package com.bit.myapp02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex03Controller {
	
	@RequestMapping("/ex10")
	public String Ex01() {
		return "index";
	}
}
