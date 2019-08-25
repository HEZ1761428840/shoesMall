package com.yc.shoesMall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index {
	
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("register")
	public String register() {
		return "register";
	}
}