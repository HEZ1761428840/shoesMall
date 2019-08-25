package com.yc.shoesMall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexAction {
	@RequestMapping("index")
	public String index() {
		
		return "index";
	}
	
	
	
}
