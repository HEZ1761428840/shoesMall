package com.yc.shoesMall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cartAction {
	@RequestMapping("cart")
	public String cart() {
		return "cart";
	}
	
}
