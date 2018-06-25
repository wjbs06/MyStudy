package com.bit.myapp03.controller;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.myapp03.model.GuestDao;
import com.bit.myapp03.model.entity.GuestVo;

@Controller
public class DetailController {
	Logger log=Logger.getLogger(getClass());
	@Autowired
	GuestDao guestDao;

	@RequestMapping(value="/guest/{idx}",method=RequestMethod.GET)
	public String detail(@PathVariable int idx,Model model) throws SQLException {
		model.addAttribute("bean", guestDao.selectOne(idx));
		model.addAttribute("path", "myapp03");
		return "detail"; 
	}
	
	//PUT method �����
	//form-> <input type="hidden" name="_method" value="put" />
	//web.xml-> <filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
	//patten-> /*
	
	@RequestMapping(value="/guest/{idx}",method=RequestMethod.PUT)
	public String edit(@PathVariable int idx,@ModelAttribute GuestVo bean) throws SQLException {
		log.debug("put: "+bean);
		guestDao.updateOne(bean);
		return "redirect:/guest/"+idx; 
	}
	@RequestMapping(value="/guest/{idx}",method=RequestMethod.DELETE)
	public String delete(@PathVariable int idx) throws SQLException {
		log.debug("del: "+idx);
		guestDao.deleteOne(idx);
		return "redirect:/guest/"; 
	}
}
