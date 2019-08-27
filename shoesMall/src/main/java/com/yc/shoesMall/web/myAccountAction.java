package com.yc.shoesMall.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.shoesMall.biz.MyorderBiz;


@Controller
public class myAccountAction {

	@Resource
	private MyorderBiz obiz;
	
	@RequestMapping("my-account")
	public String myaccount( Model model) {
		model.addAttribute("orderLists", obiz.queryMyOrder());
		
		return "my-account";
	}
}
