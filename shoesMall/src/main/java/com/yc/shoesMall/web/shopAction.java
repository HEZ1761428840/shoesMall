package com.yc.shoesMall.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.shoesMall.bean.Orders;
import com.yc.shoesMall.biz.MyorderBiz;
import com.yc.shoesMall.result.Result;

@Controller
public class shopAction {
	
	@Resource
	private MyorderBiz obiz;
	
	@RequestMapping("shop")
	public String shop() {
		
		return "shop";
	}
	@RequestMapping("AjaxUpdate")
	@ResponseBody
	public Result update(String  orderNum,int id) {
		Orders o=new Orders();
		o.setOrderNum(orderNum);
		o.setId(id);
		obiz.update(o);
		
		return new Result(1, "OK");
	}
}
