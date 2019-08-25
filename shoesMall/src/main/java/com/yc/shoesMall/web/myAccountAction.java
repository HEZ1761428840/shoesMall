package com.yc.shoesMall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myAccountAction {

	@RequestMapping("my-account")
	public String myaccount() {
		
		return "my-account";
	}
}
