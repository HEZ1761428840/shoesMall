package com.yc.shoesMall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginAction {

	@RequestMapping("login")
	public String login() {
		
		return "login";
	}
}
