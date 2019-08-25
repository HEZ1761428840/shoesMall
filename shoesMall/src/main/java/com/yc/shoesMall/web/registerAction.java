package com.yc.shoesMall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class registerAction {

	@RequestMapping("register")
	public String register() {
		return "register";
	}
}
