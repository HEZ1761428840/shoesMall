package com.yc.shoesMall.web;



import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yc.shoesMall.bean.Address;
import com.yc.shoesMall.bean.User;
import com.yc.shoesMall.biz.AddressBiz;
import com.yc.shoesMall.biz.MyorderBiz;
import com.yc.shoesMall.biz.UserBiz;


@Controller
@JsonIgnoreProperties(value = {"handler"})
@SessionAttributes("loginUser")
public class myAccountAction {

	@Resource
	private MyorderBiz obiz;
	
	@Resource
	private UserBiz ubiz;
	
	@Resource
	private AddressBiz abiz;
	
	/**
	 * 
	 * myaccount的查询order/address操作
	 * 修改个人信息
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping("my-account")
	public String myaccount(@SessionAttribute(name = "loginUser", required = false) User user,Model model) {
		
		//判断是否登录存在用户
		if(user!=null){
			int id=ubiz.queryId(user);
	        model.addAttribute("orderLists", obiz.queryMyOrder(id));
	        model.addAttribute("account_details", obiz.queryAddress(id));	
		}
		
       
		return "my-account";
	}
	
	/**
	 * myaccount的修改个人信息操作
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping("account")
	public String myaccount1(@SessionAttribute("loginUser") User user,
			Model model,
			HttpServletRequest request) {
		
		String name=request.getParameter("display-name");
		String email=request.getParameter("email");
		String password=request.getParameter("new-pwd");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		
		if(!"".equals(name)){
			user.setName(name);
		}
		if(!"".equals(email)){
			user.setEmail(email);
		}
		if(!"".equals(password)){
			user.setPassword(password);
		}
		if(!"".equals(phone)){
			user.setPhone(phone);
		}
		
		//修改地址
		if(!"".equals(address)){
			int id=ubiz.queryId(user);
              Address a= abiz.queryAddress(id);
			  a.setAddress(address);
			abiz.update(a);
			
		}
		
		
		ubiz.update(user);
		
		if("".equals(password) || "".equals(name) || ("".equals(password)&& "".equals(name))){
			return myaccount(user, model);
		}else {
			return "login";
		}
		
	
	}
	
	
	/**
	 * 注销退出
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping("CheckOut")
	
	public String CheckOut(@SessionAttribute("loginUser") User user,Model model) { 
	   user=null;
       model.addAttribute("loginUser", user);		
		return "index";
		
	
	}
	
	
	
	
	
}
	
