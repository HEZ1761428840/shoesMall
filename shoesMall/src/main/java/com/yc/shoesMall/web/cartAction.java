package com.yc.shoesMall.web;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.yc.shoesMall.bean.User;
import com.yc.shoesMall.biz.MyorderBiz;
import com.yc.shoesMall.biz.UserBiz;

@Controller
public class cartAction {
	
	@Resource
	private UserBiz ubiz;
	
	@Resource
	private MyorderBiz obiz;
	
	@RequestMapping("cart")
	
	public String cart(@SessionAttribute(name = "loginUser", required = false) User user,
			Model model,
			HttpServletRequest request) {
		String ids=request.getParameter("id");
		
		//如果id不为空表示进行了删除操作
		if(ids!=null){
			int id =Integer.parseInt(ids);			
			obiz.deleteById(id);
			//删除完以后重新查询数据库
			int id1=ubiz.queryId(user);
			 model.addAttribute("orders", obiz.queryMyOrder(id1));
						
		}
		/**
		 * 如果有id参数
		 * 则视为删除指定的id产品
		 * 
		 */
		
		
		
		return "cart";
	}
	
}
